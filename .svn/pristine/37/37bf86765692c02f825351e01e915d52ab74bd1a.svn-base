package com.tly.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tly.service.IEquipmentMaintenanceService;

/**
 * 故障设备维修明细
 * @ClassName EquipmentMaintenanceController
 * @Author yangweihang
 * @Date 2018年8月26日 下午11:59:36
 */
@Controller
@RequestMapping("/equipmentmaintenance")
public class EquipmentMaintenanceController {
	
	@Autowired
	private IEquipmentMaintenanceService iems;
	
	@Autowired
	private HttpServletRequest request;
	
	/**
	 * 查询维修明细
	 * yangweihang
	 * @Date 2018年8月27日 上午12:02:10
	 * @param pid
	 * @return
	 */
	@RequestMapping("/selectByEm")
	public String selectByEm(){
		List<Map<String, Object>> list = iems.selectByEm();
		request.setAttribute("list", list);
		return "equipmentmaintenance/manage";
	}
	
}
