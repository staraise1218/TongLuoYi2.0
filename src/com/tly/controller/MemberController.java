package com.tly.controller;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.tly.model.EquipmentApply;
import com.tly.model.Finance;
import com.tly.model.Integral;
import com.tly.model.Member;
import com.tly.service.ICommissionrewardService;
import com.tly.service.IEquipmentService;
import com.tly.service.IEquipmentSublistService;
import com.tly.service.IFinanceService;
import com.tly.service.IIntegralService;
import com.tly.service.IMemberService;
import com.tly.service.IPartnerEquipmentService;
import com.tly.service.IPartnerService;
import com.tly.service.IUserStatisticsService;
import com.tly.util.CreateQRcode;
import com.tly.util.ScanServer;
import com.tly.util.StringTools;
import com.tly.util.YesOrNo;

/**
 * @author moxiuchuan
 * 会员控制器
 * 11点17分
 */
@Controller
@RequestMapping("/member")
public class MemberController {
	
	public static volatile String accessToken = null;
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private IMemberService ims;//会员服务
	
	@Autowired
	private IEquipmentService ies;//设备服务
	
	@Autowired
	private IPartnerService ips; //合伙人服务
	
	@Autowired
	private IFinanceService ifs;
	
	@Autowired
	private ICommissionrewardService ics;
	
	@Autowired
	private IEquipmentSublistService iess;
	
	@Autowired
	private IPartnerEquipmentService ipes;
	
	@Autowired
	private IUserStatisticsService ius;
	
	@Autowired
	private IIntegralService iis;
	
	@Autowired
	private  ServletContext application;
	
	
	private String Equipmentnumber; //设备码
	
	//每隔一个半小时生成一次
	static{
		CreateQRcode.timeerAccessToken();
	}
	/**
	 * 查询还不是合伙人的会员
	 * yangweihang
	 * @Date 2018年9月1日 下午6:47:56
	 * @return
	 */
	@RequestMapping("/selectByNotp")
	public String selectByNotp() {
		List<Member> list = ims.selectByNotp();
		request.setAttribute("list", list);
		return "partner/insertp";
	}
	
	/**
	 * 根据手机号查询会员id
	 * @return 存在：会员id 不存在：null
	 */
	@RequestMapping("/selectOneByPhone")
	@ResponseBody
	public Integer selectOneByPhone(String phonenum) {
		
		Integer mid = ims.selectOneByPhone(phonenum);

		return mid;
	}
	
	/**
	 * 录入一个会员和确认上下级关系
	 * @param from 注册来源(必须参数) 1.扫描该设备 2.朋友二维码推荐 3.关注公众号2
	 * @param equipmentnumber 设备编号(不必须)
	 * @param mem 会员基础信息 (必须)
	 * @param otherWxid 对方微信id (不必须)
	 * @return 录入是否成功
	 */
	@RequestMapping("/insertOneMember") 
	@ResponseBody
	public Integer insertOneMember(Integer from,String equipmentnumber,Member mem,String otherWxid) {
		//如果注册方式为扫描设备二维码，那么这个会员上线就是该设备租赁者
		Integer suc = null;
		if (from == 1) {
			suc = ims.insertOneMemberAndRelation(mem,equipmentnumber,from);
		}else if(from == 2) {
			suc = ims.insertOneMemberAndRelation(mem,from,otherWxid);
		}
		return suc;
	}
	
	/**
	 * 检查他应该付多少钱
	 * @return 钱数
	 */
	@RequestMapping("/selectMoneyByScan")
	@ResponseBody
	public Map selectMoneyByScan(String Equipmentnumber,String wxid,String phonenum) {
		//1.工具
		Map map = new HashMap();
		this.Equipmentnumber = Equipmentnumber;
		//2.判断该设备的状态state
		Integer state = selectStateByEquipmentnumber();
		if (state != 0) {
			//3.检查该用户是否是会员
			Member mem = ims.selectOneMemberByWxid(wxid);
			if (mem == null) {//如果是null就回调让他注册会员
				map.put("key", "memberType");
				map.put("value", 0);
				return map;
			}
			//4.判断该设备是否是购买的，如果是购买的扫码不收钱，并且对应的上线没有提成
			Integer form = ips.selectEquipmentForm(Equipmentnumber);
			if(form == 2) {//直接返回该设备为购买的 扫码不需要支付
				map.put("key", "EquipmentForm");
				map.put("value", 2);
				return map;
			}
			Member selectOneMemberByWxid = ims.selectOneMemberByWxid(wxid);
			//5.用户的角色
			if(selectOneMemberByWxid.getType() == 4){//假定维修工的类型为4，具体要统一###
				map.put("key", "memberType");
				map.put("value", 4);
				return map;
			}else{//不是维修工的时候
				//6.判断用户使用次数
				Integer mid = mem.getId();
				Integer sum = ims.selectUseSumByMid(mid);
				if(sum == 0){
					map.put("key", "money");
					map.put("value", 0);
					//创建任务线程用来执行提成办法和订单服务
					startScanServer(wxid);
					return map;
				}else if(sum == 1) {
					map.put("key", "money");
					map.put("value", 1);
					//创建任务线程用来执行提成办法和订单服务
					startScanServer(wxid);
					return map;
				}else {
					//收取正常价格
					Double money = ies.selectMoneyByEquipmentnumber(Equipmentnumber);
					map.put("key", "money");
					map.put("value", money);
					//创建任务线程用来执行提成办法和订单服务
					startScanServer(wxid);
					return map;
				}
			}
		}else {
			map.put("key", "memberStatus");
			map.put("value", state);
			return map;
		}
	}
	
	/**
	 * 启动扫码之后的服务
	 * @param mid 会员id
	 */
	private void startScanServer(String wxid) {
		//创建任务线程用来执行提成办法和订单服务
		Thread t = new Thread(new ScanServer(ims,wxid,ips,Equipmentnumber,ies,ifs,ics,iess,ipes,iis,ius));
		t.start();
		/*if (t.isInterrupted()) {
			t.interrupt();
		}*/
	}
	
	/**
	 * 查询该设备是否可用
	 * @return 状态值
	 */
	@RequestMapping("selectStateByEquipmentnumber")
	@ResponseBody
	private Integer selectStateByEquipmentnumber() {
		Integer state = ies.selectStateByEquipmentnumber(Equipmentnumber);
		if (state == 1 || state == 3 || state == 4) {
			return 0;
		}
		return state;
	}
	
	/**
	 * 会员管理
	 * yangweihang
	 * @Date 2018年8月26日 下午1:55:46
	 * @return
	 */
	@RequestMapping("/selectByMember")
	public String selectByMember(){
		List<Map<String, Object>> list = ims.selectByMember();
		//变换汉字
		for(Map<String,Object> m : list){
			if((int)m.get("sex") == YesOrNo.ON){
				m.replace("sex", "男");
			}
			if(m.get("sex") == YesOrNo.YES){
				m.replace("sex", "女");
			}
		}
		request.setAttribute("list", list);
		return "member/manage";
	}
	
	/**
	 * 查询一级上线
	 * yangweihang
	 * @Date 2018年8月26日 下午3:11:24
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/onone")
	public String selectonone(String wxid) {
		Member m = ims.selectonone(wxid);
		request.setAttribute("m", m);
		return "member/onmember";
	}


	/**
	 * 查询二级上线
	 * yangweihang
	 * @Date 2018年8月26日 下午3:11:35
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/ontwo")
	public String selectontwo(String wxid) {
		Member m = ims.selectontwo(wxid);
		request.setAttribute("m", m);
		return "member/onmember";
	}


	/**
	 * 查询一级下线
	 * yangweihang
	 * @Date 2018年8月26日 下午3:11:46
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/upone")
	public String selectupone(String wxid) {
		 List<Member> list = ims.selectupone(wxid);
		 request.setAttribute("list", list);
		 return "member/upmember";
	}


	/**
	 * 查询二级下线
	 * yangweihang
	 * @Date 2018年8月26日 下午3:11:59
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/uptwo")
	public String selectuptwo(String wxid) {
		 List<Member> list = ims.selectuptwo(wxid);
		 request.setAttribute("list", list);
		 return "member/upmember";
	}
	
	/**
	 * 查询该会员一级下线的人数
	 * @param wxid 微信id
	 * @return 一级下线人数
	 */
	@RequestMapping("/selectDownOneSum")
	@ResponseBody
	public Integer selectDownOneSum(String wxid) {
		List<Member> list = ims.selectupone(wxid);
		Integer sum = list.size();
		return sum;
	}
	
	
	/**
	 * 查询该会员的二级下线人数
	 * @param wxid 会员微信id
	 * @return 二级下线人数
	 */
	@RequestMapping("/selectDownTwoSum")
	@ResponseBody
	public Integer selectDownTwoSum(String wxid) {
		List<Member> list = ims.selectuptwo(wxid);
		Integer sum = list.size();
		return sum;
	}
	
	/**
	 * 根据该用户id查询该用户一级下线的微信id和成为下线方式的列表
	 * @param wxid 该用户的微信id
	 * @return list
	 */
	@RequestMapping("/selectDownOneWxidAndType")
	@ResponseBody
	public List<Map> selectDownOneWxidAndType(String wxid) {
		List<Map> list = ims.selectDownOneWxidAndType(wxid);
		return list;
	}
	/**
	 * 查询该会员的二级下线人数和 根据该用户id查询该用户一级下线的微信id和成为下线方式的列表
	 * @param wxid 用户微信id
	 * @return 上面两个方法的集合
	 */
	@RequestMapping("/selectSumOneAndTwo")
	@ResponseBody
	public Map selectSumOneAndTwo(String wxid) {
		List<Map> selectDownOneWxidAndType = selectDownOneWxidAndType(wxid);
		Integer selectDownTwoSum = selectDownTwoSum(wxid);
		
		Map map = new HashMap();
		map.put("DownOneWxidAndType", selectDownOneWxidAndType);
		map.put("sum", selectDownTwoSum);
		return map;
	}
	
	/**
	 * 根据该用户微信id查询该用户一级下线微信id和一级下线的一级下线有多少人
	 * @param wxid 该用户的微信id
	 * @return list
	 */
	@RequestMapping("/selectDownOneWxidAndSumTwo")
	@ResponseBody
	public List<Map> selectDownOneWxidAndSumTwo(String wxid) {
		
		List<Map> list = ims.selectDownOneWxidAndSumTwo(wxid);
		return list;
	}
	
	/**
	 * 查询该账户余额
	 * @param wxid 微信id
	 * @return 该账户余额
	 */
	@RequestMapping("/selectRemainMoney")
	@ResponseBody
	public Double selectRemainMoney(String wxid) {
		Double remainMoney = ims.selectRemainMoney(wxid);
		return remainMoney;
	}
	/**
	 * 查询该会员近30天的收益记录
	 * @param wxid 微信id
	 * @return list
	 */
	@ResponseBody
	@RequestMapping("/selectEarningsByWxid")
	public List<Map> selectEarningsByWxid(String wxid) {
		List<Map> list = ifs.selectEarningsByWxid(wxid);
		return list;
	}
	
	/**
	 * 前台传来钱数 ，然后将他钱包扣钱
	 * @param wxid 微信id
	 * @param wmoney 要扣的钱数
	 * @return 是否扣成功
	 */
	@ResponseBody
	@RequestMapping("/updateMoneyByWxid")
	public Integer updateMoneyByWxid(String wxid,Double money) {
		Integer suc = ims.updateMoneyByWxid(wxid,money);
		return suc;
	}
	
	/**
	 * 录入一条设备申请（租设备和买设备统一入口 租为1 买为2）
	 * @param ea 一个申请对象
	 * @return 是否录入成功
	 */
	@RequestMapping("/insertOneApple")
	@ResponseBody
	public Integer insertOneApple(EquipmentApply ea) {
		Integer suc = ies.insertOneApple(ea);
		return suc;
	}
	
	/**
	 * 创建二维码
	 * @param wxid 该用户的微信id
	 * @param scene 保留的参数
	 * @param page 返回的页面路径
	 * @param width 大小
	 * @param auto_color 样式
	 * @return 成功返回1 失败返回0
	 */
	@RequestMapping("/createCode")
	@ResponseBody
	public String createCode(String wxid,String scene,String page,Integer width,Boolean auto_color) {
		System.out.println("Token:" + accessToken);
		String path = "";
		String fileExistsPath = CreateQRcode.fileExists(wxid, application);
		//如果没生成过 就生成一个
		if (fileExistsPath == null) {
			//创建二维码
			path = CreateQRcode.getqrCode(scene, accessToken, page, width, auto_color, wxid,application);
		}else{
			//如果该用户之前生成过，直接返回图片路径
			path = fileExistsPath;
		}
		return path;
	}
	/**
	 * 下载二维码
	 * @param wxid 用户微信id
	 * @return 输出流
	 * @throws Exception 
	 */
	@RequestMapping("downloadQrCode")
	public void downloadQrCode(String wxid,HttpServletResponse response) throws Exception {
		String path = application.getRealPath("/images/ewm/member") + "/memewm" + wxid + ".jpg";
        File file = new File(path);
        //设置相应为下载
        response.setContentType("application/x-msdownload");
        //设置字符集
        path=new String(path.getBytes("iso8859-1"),"gb2312");
        response.setHeader("Content-disposition","attachment; filename="+new String(file.getName().getBytes("gb2312"),"iso8859-1"));	
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(file)) ;
		BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
		int len = -1;
		while((len = in.read()) != -1) {
			out.write(len);
		}
		out.flush();
		in.close();
		out.close();
	}
	/**
	 * 查询积分
	 * yangweihang
	 * @Date 2018年8月28日 下午6:55:45
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/integral")
	@ResponseBody
	public JSONObject selectintegral(String wxid) {
		JSONObject jo = new JSONObject();
		List<Integral> list = iis.selectByTime(wxid);
		jo.put("list", list);
		return jo;
	}
	
	/**
	 * 查询收益
	 * yangweihang
	 * @Date 2018年8月28日 下午8:16:48
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/earnings")
	@ResponseBody
	public JSONObject selectearnings(String wxid) {
		JSONObject jo = new JSONObject();
		List<Map<String, Object>> list = ifs.selectByWxid(wxid);
		jo.put("list", list);
		return jo;
	}
	
	/**
	 * 查询积分没有读的数量
	 * yangweihang
	 * @Date 2018年8月29日 上午9:38:49
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/selectByNotLook")
	@ResponseBody
	public JSONObject selectByNotLook(String wxid) {
		JSONObject jo = new JSONObject();
		Integer i = iis.selectByNotLook(wxid);
		jo.put("count", i);
		return jo;
	}
	
	/**
	 * 修改积分为已读
	 * yangweihang
	 * @Date 2018年8月29日 上午9:49:35
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/updateByLook")
	@ResponseBody
	public JSONObject updateByLook(String wxid) {
		JSONObject jo = new JSONObject();
		int result = iis.updateBylook(wxid);
		jo.put("result", result);
		return jo;
	}
	
	/**
	 * 查询财务未读的数量
	 * yangweihang
	 * @Date 2018年8月29日 上午10:52:33
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/selectByNotLookcount")
	@ResponseBody
	public JSONObject selectByNotLookcount(String wxid) {
		JSONObject jo = new JSONObject();
		int i = ifs.selectByNotLookcount(wxid);
		jo.put("count", i);
		return jo;
	}
	
	/**
	 * 修改财务为已读
	 * yangweihang
	 * @Date 2018年8月29日 上午10:54:46
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/updateByFinanceLook")
	@ResponseBody
	public JSONObject updateByFinanceLook(String wxid) {
		StringTools st = StringTools.getFactory();
		JSONObject jo = new JSONObject();
		//按微信id查询没有读的财务
		List<Finance> list = ifs.selectByNotLook(wxid);
		//条件判断修改
		for(Finance f : list) {
			if(!st.isNullOrEmpty(f.getXfonewxid())) {
				if(f.getXfonewxid().equals(wxid)) {
					int i = ifs.updatexfone(f.getId());
					jo.put("xfone", i);
				}
			}
			if(!st.isNullOrEmpty(f.getXftwowxid())) {
				if(f.getXftwowxid().equals(wxid)) {
					int i = ifs.updatexftwo(f.getId());
					jo.put("xftwo", i);
				}
			}
			if(!st.isNullOrEmpty(f.getZyonewxid())) {
				if(f.getZyonewxid().equals(wxid)) {
					int i = ifs.updatezyone(f.getId());
					jo.put("zyone", i);
				}
			}
			if(!st.isNullOrEmpty(f.getZytwowxid())) {
				if(f.getZytwowxid().equals(wxid)) {
					int i = ifs.updatezytwo(f.getId());
					jo.put("zytwo", i);
				}
			}
			if(!st.isNullOrEmpty(f.getGmonewxid())) {
				if(f.getGmonewxid().equals(wxid)) {
					int i = ifs.updategmone(f.getId());
					jo.put("gmone", i);
				}
			}
			if(!st.isNullOrEmpty(f.getGmtwowxid())) {
				if(f.getGmtwowxid().equals(wxid)) {
					int i = ifs.updategmtwo(f.getId());
					jo.put("gmtwo", i);
				}
			}
		}
		return jo;
	}
}
