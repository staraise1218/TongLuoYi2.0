package com.tly.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.tly.model.Administrator;
import com.tly.model.Finance;
import com.tly.model.Integral;
import com.tly.model.Member;
import com.tly.model.Partner;
import com.tly.model.PartnerEquipment;
import com.tly.model.Shop;
import com.tly.service.IAdministratorService;
import com.tly.service.IFinanceService;
import com.tly.service.IIntegralService;
import com.tly.service.IMemberService;
import com.tly.service.IPartnerEquipmentService;
import com.tly.service.IPartnerService;
import com.tly.service.IShopService;
import com.tly.service.IUserStatisticsService;
import com.tly.util.DateTools;
import com.tly.util.RoleUtil;
import com.tly.util.StringTools;
import com.tly.util.YesOrNo;

/**
 * 合伙人
 * @ClassName PartnerController
 * @Author yangweihang
 * @Date 2018年8月26日 下午5:22:11
 */
@Controller
@RequestMapping("/partner")
public class PartnerController {

	@Autowired
	private IPartnerService ips;
	
	@Autowired
	private IMemberService ims;
	
	@Autowired
	private IIntegralService iis;
	
	@Autowired
	private IFinanceService ifs;
	
	@Autowired
	private IUserStatisticsService iuss;
	
	@Autowired
	private IPartnerEquipmentService ipes;
	
	@Autowired
	private IAdministratorService ias;
	
	@Autowired
	private IShopService iss;
	
	@Autowired
	private HttpServletRequest request;
	
	/**
	 * 合伙人管理
	 * yangweihang
	 * @Date 2018年8月26日 下午5:23:58
	 * @return
	 */
	@RequestMapping("/selectByPartner")
	public String selectByPartner(){
		StringTools st = StringTools.getFactory();
		List<Map<String, Object>> list = ips.selectByPartner();
		for(Map<String,Object> m : list){
			//合伙人级别
			if(!st.isNull(m.get("plid"))) {
				String plid = RoleUtil.partnerlevel((int)m.get("plid"));
				m.replace("plid", plid);
			}
		}
		request.setAttribute("list", list);
		return "partner/manage";
	}
	
	/**
	* 查询
	* yangweihang
	* @date: 2018年9月1日 上午12:27:30
	* @return List<Map<String,Object>>
	*/
	@RequestMapping("/selectbytx")
	public String select(){
		DateTools dt = DateTools.getFactory();
		List<Map<String, Object>> list = ips.selectbytx();
		for(Map<String,Object> m : list) {
			String time = dt.formatDate((Date)m.get("time"), "yyyy-MM-dd HH:mm:ss");
			System.out.println("time"+time);
			m.replace("time", time);
		}
		request.setAttribute("list", list);
		return "membertx/manage";
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
		Partner p = ips.selectonone(wxid);
		if(m != null){
			request.setAttribute("m", m);
		}else if(p != null){
			request.setAttribute("p", p);
		}
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
		Partner p = ips.selectontwo(wxid);
		if(m != null){
			request.setAttribute("m", m);
		}else if(p != null){
			request.setAttribute("p", p);
		}
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
		 List<Member> mlist = ims.selectupone(wxid);
		 List<Partner> plist = ips.selectupone(wxid);
		 if(mlist != null && !mlist.isEmpty()){
			 request.setAttribute("list", mlist);
		 }else if(plist != null && !plist.isEmpty()){
			 request.setAttribute("list", plist);
		 }
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
		 List<Member> mlist = ims.selectuptwo(wxid);
		 List<Partner> plist = ips.selectuptwo(wxid);
		 if(mlist != null && !mlist.isEmpty()){
			 request.setAttribute("list", mlist);
		 }else if(plist != null && !plist.isEmpty()){
			 request.setAttribute("list", plist);
		 }
		 return "member/upmember";
	}
	
	/**
	 * 新增合伙人
	 * yangweihang
	 * @Date 2018年9月1日 下午6:08:12
	 * @param p
	 * @return
	 */
	@RequestMapping("/insert")
	public String insert(String wxid) {
		Member m = ims.selectOneMemberByWxid(wxid);
		Partner p = new Partner();
		p.setWxid(wxid);
		p.setNickname(m.getNickname());
		p.setName(m.getName());
		p.setSex(m.getSex());
		p.setDate(m.getDate());
		p.setPhonenum(m.getPhonenum());
		p.setCity(m.getCity());
		p.setPlid(YesOrNo.YES);
		p.setMid(p.getId());
		int result = ips.insertbyp(p);
		return "partner/manage";
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
	
	/**
	 * 按合伙人微信id查询该店铺没有开机的设备
	 * yangweihang
	 * @Date 2018年8月29日 下午5:07:02
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/selectNotStartingByPwxid")
	@ResponseBody
	public JSONObject selectNotStartingByPwxid(String wxid) {
		JSONObject jo = new JSONObject();
		List<Map<String, Object>> list = iuss.selectNotStartingByPwxid(wxid);
		jo.put("list", list);
		return jo;
	}
	
	/**
	 * 按合伙人微信id查询该店铺没有开机的设备的未读数量
	 * yangweihang
	 * @Date 2018年8月29日 下午5:49:48
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/notstartingcount")
	@ResponseBody
	public JSONObject selectNotStartingByWxidcount(String wxid) {
		JSONObject jo = new JSONObject();
		int i = iuss.selectNotStartingByWxidcount(wxid);
		jo.put("count", i);
		return jo;
	}
	
	/**
	 * 按合伙人微信id查询店铺没有开机的设备修改为已读
	 * yangweihang
	 * @Date 2018年8月29日 下午6:00:54
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/updatenotplook")
	@ResponseBody
	public JSONObject updateNotStartingByPlook(String wxid) {
		JSONObject jo = new JSONObject();
		int i = iuss.updateNotStartingByPlook(wxid);
		jo.put("result", i);
		return jo;
	}
	
	/**
	 * 按店铺合伙人微信id查询租用设备
	 * yangweihang
	 * @Date 2018年8月29日 下午6:17:17
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/selectpwxidByzyEs")
	@ResponseBody
	public JSONObject selectpwxidByzyEs(String wxid) {
		JSONObject jo = new JSONObject();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("wxid", wxid);
		map.put("form", YesOrNo.YES);
		List<Map<String, Object>> list = ipes.selectpwxidByEs(map);
		jo.put("list", list);
		return jo;
	}
	
	/**
	 * 按店铺合伙人微信id查询购买设备
	 * yangweihang
	 * @Date 2018年8月29日 下午6:45:18
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/selectpwxidBygmEs")
	@ResponseBody
	public JSONObject selectpwxidBygmEs(String wxid) {
		JSONObject jo = new JSONObject();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("wxid", wxid);
		map.put("form", YesOrNo.ON);
		List<Map<String, Object>> list = ipes.selectpwxidByEs(map);
		jo.put("list", list);
		return jo;
	}
	
	/**
	 * 按合伙人微信id查询已经修改过价格的设备
	 * yangweihang
	 * @Date 2018年8月31日 下午2:56:39
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/selectByUpdateSmoney")
	@ResponseBody
	public JSONObject selectByUpdateSmoney(String wxid){
		JSONObject jo = new JSONObject();
		List<Map<String, Object>> list = ipes.selectByMoney(wxid);
		jo.put("list", list);
		//修改为已读
		int result = ipes.updatelookByYd(wxid);
		jo.put("result", result);
		return jo;
	}
	
	/**
	 * 按合伙人微信id查询已经修改过价格的设备未读数量
	 * yangweihang
	 * @Date 2018年8月31日 下午3:17:00
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/selectbylookcount")
	@ResponseBody
	public JSONObject selectbylookcount(String wxid){
		JSONObject jo = new JSONObject();
		int i = ipes.selectbylookcount(wxid);
		jo.put("count", i);
		return jo;
	}
	
	/**
	 * 修改开机价格
	 * yangweihang
	 * @Date 2018年8月31日 下午3:19:27
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/updatesmoney")
	@ResponseBody
	public JSONObject updatesmoney(PartnerEquipment pe){
		JSONObject jo = new JSONObject();
		int result = ipes.updatesmoney(pe);
		jo.put("result", result);
		//修改为未读
		int result1 = ipes.updatelookbywd(pe.getEid());
		jo.put("result1", result1);
		return jo;
	}
	
	/**
	 * 按手机号或微信号查找店铺管理员并且添加管理员
	 * yangweihang
	 * @Date 2018年9月1日 上午8:59:30
	 * @param wp
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/selectByPhonenumOrWxid")
	@ResponseBody
	public JSONObject selectByPhonenumOrWxid(String wp,String wxid){
		JSONObject jo = new JSONObject();
		Member m = ims.selectByPhonenumOrWxid(wp);
		if(m != null){
			Administrator a = new Administrator();
			a.setName(m.getName());
			a.setPhonenum(m.getPhonenum());
			a.setWxid(m.getWxid());
			//查询店铺
			Shop s = iss.selectpwxidbyshop(wxid);
			a.setSid(s.getSid());
			//新增管理员
			int result = ias.inserta(a);
			jo.put("result", result);
			//修改member表的角色
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("wp", wp);
			map.put("type", RoleUtil.THREE);
			int result1 = ims.updatetype(map);
			jo.put("type", result1);
		}
		return jo;
	}
	
	/**
	 * 修改管理员角色
	 * yangweihang
	 * @Date 2018年9月1日 上午9:37:14
	 * @param a
	 * @return
	 */
	@RequestMapping("/updatetype")
	@ResponseBody
	public JSONObject updatetype(Administrator a){
		JSONObject jo = new JSONObject();
		int result = ias.updatetype(a);
		jo.put("result", result);
		return jo;
	}
	
	/**
	 * 删除管理员
	 * yangweihang
	 * @Date 2018年9月1日 上午9:42:22
	 * @param id
	 * @return
	 */
	@RequestMapping("/deletea")
	@ResponseBody
	public JSONObject deletea(int id){
		//按微信id查询
		Administrator a = ias.selectonebywxid(id);
		JSONObject jo = new JSONObject();
		int result = ias.deletea(a.getId());
		jo.put("result", result);
		//修改为普通会员
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("wp", a.getWxid());
		map.put("type", RoleUtil.ONE);
		int result1 = ims.updatetype(map);
		jo.put("type", result1);
		return jo;
	}
	
	/**
	 * 按合伙人微信id查询店铺管理员
	 * yangweihang
	 * @Date 2018年9月1日 上午9:50:58
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/selectpwxidbya")
	@ResponseBody
	public JSONObject selectpwxidbya(String wxid){
		JSONObject jo = new JSONObject();
		List<Administrator> list = ias.selectpwxidbya(wxid);
		jo.put("list", list);
		return jo;
	}
}
