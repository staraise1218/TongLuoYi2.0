package com.tly.controller;

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
import com.tly.model.EquipmentMaintenance;
import com.tly.model.Finance;
import com.tly.model.Integral;
import com.tly.model.PartnerEquipment;
import com.tly.service.IAdministratorService;
import com.tly.service.IEquipmentMaintenanceService;
import com.tly.service.IFinanceService;
import com.tly.service.IIntegralService;
import com.tly.service.IPartnerEquipmentService;
import com.tly.service.IPartnerService;
import com.tly.service.IUserStatisticsService;
import com.tly.util.StringTools;
import com.tly.util.YesOrNo;

/**
 * 店铺管理员
 * @ClassName AdministratorController
 * @Author yangweihang
 * @Date 2018年8月26日 下午7:18:18
 */
@Controller
@RequestMapping("/administrator")
public class AdministratorController {

	@Autowired
	private IIntegralService iis;
	
	@Autowired
	private IAdministratorService ias;
	
	@Autowired
	private IFinanceService ifs;
	
	@Autowired
	private IUserStatisticsService iuss;
	
	@Autowired
	private IPartnerEquipmentService ipes;
	
	@Autowired
	private IEquipmentMaintenanceService iems;
	
	@Autowired
	private IPartnerService ips;
	
	@Autowired
	private HttpServletRequest request;
	
	/**
	 * 查询店铺管理员
	 * yangweihang
	 * @Date 2018年8月26日 下午7:20:50
	 * @param pid
	 * @return
	 */
	@RequestMapping("/selectByA")
	public String selectByA(int pid){
		List<Administrator> list = ias.selectByA(pid);
		request.setAttribute("list", list);
		return "administrator/manage";
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
	 * 按管理员微信id查询该店铺没有开机的设备
	 * yangweihang
	 * @Date 2018年8月29日 下午5:07:02
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/selectNotStartingByWxid")
	@ResponseBody
	public JSONObject selectNotStartingByWxid(String wxid) {
		JSONObject jo = new JSONObject();
		List<Map<String, Object>> list = iuss.selectNotStartingByWxid(wxid);
		jo.put("list", list);
		return jo;
	}
	
	/**
	 * 按管理员微信id查询该店铺没有开机的设备的未读数量
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
	 * 按管理员微信id查询店铺没有开机的设备修改为已读
	 * yangweihang
	 * @Date 2018年8月29日 下午6:00:54
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/updatenotlook")
	@ResponseBody
	public JSONObject updateNotStartingByLook(String wxid) {
		JSONObject jo = new JSONObject();
		int i = iuss.updateNotStartingByLook(wxid);
		jo.put("result", i);
		return jo;
	}
	
	/**
	 * 按店铺管理员微信id查询租用设备
	 * yangweihang
	 * @Date 2018年8月29日 下午6:17:17
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/selectwxidByzyEs")
	@ResponseBody
	public JSONObject selectwxidByzyEs(String wxid) {
		JSONObject jo = new JSONObject();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("wxid", wxid);
		map.put("form", YesOrNo.YES);
		List<Map<String, Object>> list = ipes.selectwxidByEs(map);
		jo.put("list", list);
		return jo;
	}
	
	/**
	 * 按店铺管理员微信id查询购买设备
	 * yangweihang
	 * @Date 2018年8月29日 下午6:45:18
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/selectwxidBygmEs")
	@ResponseBody
	public JSONObject selectwxidBygmEs(String wxid) {
		JSONObject jo = new JSONObject();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("wxid", wxid);
		map.put("form", YesOrNo.ON);
		List<Map<String, Object>> list = ipes.selectwxidByEs(map);
		jo.put("list", list);
		return jo;
	}
	
	/**
	 * 修改设备名称
	 * yangweihang
	 * @Date 2018年8月31日 上午9:09:24
	 * @param pe
	 * @return
	 */
	@RequestMapping("/updatebyname")
	@ResponseBody
	public JSONObject updatebyname(PartnerEquipment pe){
		JSONObject jo = new JSONObject();
		int result = ipes.updatebyname(pe);
		jo.put("result", result);
		return jo;
	}
	
	/**
	 * 申报故障
	 * yangweihang
	 * @Date 2018年8月31日 上午11:42:43
	 * @param em
	 * @return
	 */
	@RequestMapping("/insertByEm")
	@ResponseBody
	public JSONObject insertByEm(String wxid,EquipmentMaintenance em){
		JSONObject jo = new JSONObject();
		//按管理员微信id查询合伙人id
		Integer pid = ips.selectawxidbypid(wxid);
		em.setPid(pid);
		int result = iems.insertByEm(em);
		jo.put("result", result);
		return jo;
	}
}
