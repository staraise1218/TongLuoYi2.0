package com.tly.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.tly.model.EquipmentMaintenance;
import com.tly.model.Finance;
import com.tly.model.Integral;
import com.tly.model.MemCorresonding;
import com.tly.model.Member;
import com.tly.service.IEquipmentMaintenanceService;
import com.tly.service.IFinanceService;
import com.tly.service.IIntegralService;
import com.tly.service.IMemCorresondingService;
import com.tly.service.IMemberService;
import com.tly.util.StringTools;

/**
 * 维修工程师
 * @ClassName MaintenanceEngineer
 * @Author yangweihang
 * @Date 2018年8月28日 下午6:52:15
 */
@Controller
@RequestMapping("/maintenanceengineer")
public class MaintenanceEngineer {
	
	@Autowired
	private IIntegralService iis;
	
	@Autowired
	private IFinanceService ifs;
	
	@Autowired
	private IEquipmentMaintenanceService iems;
	
	@Autowired
	private IMemberService ims;
	
	@Autowired
	private IMemCorresondingService imcs;
	
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
	 * 修改为已读然后查询没有处理的共享的维修工单
	 * yangweihang
	 * @Date 2018年8月28日 下午8:44:55
	 * @return
	 */
	@RequestMapping("/notwid")
	@ResponseBody
	public JSONObject selectNotWid(String wxid) {
		JSONObject jo = new JSONObject();
		Member m = ims.selectOneMemberByWxid(wxid);
		//查询共享的未读数据
		List<EquipmentMaintenance> emlist = iems.selectByGxNotLookByEm(m.getId());
		jo.put("emlist", emlist);
		//增加维修工单和会员的对应关系
		int result = 0;
		for (int i = 0; i < emlist.size(); i++) {
			MemCorresonding mc = new MemCorresonding(null,m.getId(), emlist.get(i).getEmid());
			result = imcs.insert(mc);
		}
		jo.put("result", result);
		//查询没有处理的共享的维修工单
		List<Map<String, Object>> list = iems.selectByNotWid();
		jo.put("list", list);
		return jo;
	}
	
	/**
	 * 接单
	 * yangweihang
	 * @Date 2018年8月28日 下午9:00:57
	 * @param em
	 * @return
	 */
	@RequestMapping("/updatewid")
	@ResponseBody
	public JSONObject updatewid(String wxid,EquipmentMaintenance em) {
		JSONObject jo = new JSONObject();
		Member m = ims.selectOneMemberByWxid(wxid);
		em.setWid(m.getId());
		int result = iems.updatewid(em);
		jo.put("result", result);
		return jo;
	}
	
	/**
	 * 修改维修结果
	 * yangweihang
	 * @Date 2018年8月28日 下午9:10:54
	 * @param em
	 * @return
	 */
	@RequestMapping("/updateresult")
	@ResponseBody
	public JSONObject updateresult(EquipmentMaintenance em) {
		JSONObject jo = new JSONObject();
		em.setEndtime(new Date());
		int result = iems.updateresult(em);
		jo.put("result", result);
		return jo;
	}
	
	/**
	 * 按工程师id查询维修明细
	 * yangweihang
	 * @Date 2018年8月28日 下午9:26:18
	 * @param wid
	 * @return
	 */
	@RequestMapping("/selectBywid")
	@ResponseBody
	public JSONObject selectBywid(String wxid) {
		JSONObject jo = new JSONObject();
		Member m = ims.selectOneMemberByWxid(wxid);
		List<Map<String, Object>> list = iems.selectBywid(m.getId());
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
	
	/**
	 * 查询维修工单未读的数量
	 * yangweihang
	 * @Date 2018年8月29日 下午1:05:16
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/selectemcount")
	@ResponseBody
	public JSONObject selectEmCount(String wxid) {
		JSONObject jo = new JSONObject();
		Member m = ims.selectOneMemberByWxid(wxid);
		int i = iems.selectByNotLook(m.getId());
		jo.put("count", i);
		return jo;
	}
	
	/**
	 * 修改维修工单为已读
	 * yangweihang
	 * @Date 2018年8月29日 下午1:35:18
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/updatelook")
	@ResponseBody
	public JSONObject updatelook(String wxid) {
		JSONObject jo = new JSONObject();
		Member m = ims.selectOneMemberByWxid(wxid);
		int i = iems.updatelook(m.getId());
		jo.put("result", i);
		return jo;
	}
	
	/**
	 * 查询共享数据的未读数据数量
	 * yangweihang
	 * @Date 2018年8月29日 下午2:30:52
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/selectByGxNotLook")
	@ResponseBody
	public JSONObject selectByGxNotLook(String wxid) {
		JSONObject jo = new JSONObject();
		Member m = ims.selectOneMemberByWxid(wxid);
		int i = iems.selectByGxNotLook(m.getId());
		jo.put("count", i);
		return jo;
	}
}
