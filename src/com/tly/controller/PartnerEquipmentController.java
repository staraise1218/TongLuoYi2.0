package com.tly.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tly.model.EquipmentSublist;
import com.tly.model.Partner;
import com.tly.model.PartnerEquipment;
import com.tly.service.IEquipmentSublistService;
import com.tly.service.IPartnerEquipmentService;
import com.tly.service.IPartnerService;
import com.tly.util.ProductUtil;
import com.tly.util.StringTools;

/**
 * 合伙人设备
 * @ClassName PartnerEquipmentController
 * @Author yangweihang
 * @Date 2018年8月26日 下午6:21:19
 */
@Controller
@RequestMapping("/partnerequipment")
public class PartnerEquipmentController {
	
	@Autowired
	private IPartnerEquipmentService ipes;
	
	@Autowired
	private IPartnerService ips;
	
	@Autowired
	private IEquipmentSublistService iess;
	
	@Autowired
	private HttpServletRequest request;
	
	/**
	 * 查询合伙人设备
	 * yangweihang
	 * @Date 2018年8月26日 下午6:23:36
	 * @param pid
	 * @return
	 */
	@RequestMapping("/selectByPe")
	public String selectByPe(int pid){
		StringTools st = StringTools.getFactory();
		List<Map<String, Object>> list = ipes.selectByPe(pid);
		for(Map<String,Object> m : list){
			//使用形式
			if(!st.isNull(m.get("form"))){
				String form = ProductUtil.proform((int)m.get("form"));
				m.replace("form", form);
			}
			//设备状态
			if(!st.isNull(m.get("status"))) {
				String status = ProductUtil.propestatus((int)m.get("status"));
				m.replace("status", status);
			}
		}
		request.setAttribute("list", list);
		return "partnerequipment/manage";
	}
	
	/**
	 * 新增设备合伙人关联
	 * yangweihang
	 * @Date 2018年9月1日 下午5:46:43
	 * @param pe
	 * @return
	 */
	@RequestMapping("/insert")
	public String insert(PartnerEquipment pe) {
		int insert = ipes.insert(pe);
		return "partnerequipment/manage";
	}
	
	/**
	 * 查询全部合伙人和还没有合伙人的产品
	 * yangweihang
	 * @Date 2018年9月1日 下午6:06:54
	 * @return
	 */
	@RequestMapping("selectallp")
	public String selectallp() {
		List<Partner> pl = ips.selectall();
		List<EquipmentSublist> esl = iess.selectbynotp();
		request.setAttribute("pl", pl);
		request.setAttribute("esl", esl);
		return "partnerequipment/insert";
	}
	
}
