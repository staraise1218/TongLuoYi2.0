package com.tly.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tly.model.EquipmentInoutstorage;
import com.tly.service.IEquipmentInoutstorageService;
import com.tly.util.ProductUtil;
import com.tly.util.StringTools;

/**
 * 设备出入库明细
 * @ClassName EquipmentInoutstorageController
 * @Author yangweihang
 * @Date 2018年8月25日 下午8:33:47
 */
@Controller
@RequestMapping("/equipmentinoutstorage")
public class EquipmentInoutstorageController {
	
	@Autowired
	private IEquipmentInoutstorageService ieis;
	
	@Autowired
	private HttpServletRequest request;
	
	/**
	 * 按设备编号查询
	 * yangweihang
	 * @Date 2018年8月25日 下午8:39:37
	 * @param number
	 * @return
	 */
	@RequestMapping("/selectByNumber")
	public String selectByNumber(String number) {
		Map<String,Object> map = new HashMap<String,Object>();
		StringTools st = StringTools.getFactory();
		if(!st.isNullOrEmpty(number)) {
			map.put("number", number);
		}
		List<Map<String, Object>> list = ieis.selectByEi(map);
		//替换汉字
		for(Map<String,Object> m : list){
			//设备来源
			if(!st.isNull(m.get("source"))) {
				String source = ProductUtil.prosource((int)m.get("source"));
				m.replace("source", source);
			}
			//使用形式
			if(!st.isNull(m.get("form"))){
				String form = ProductUtil.proform((int)m.get("form"));
				m.replace("form", form);
			}
		}
		request.setAttribute("list", list);
		return "equipmentinoutstorage/manage";
	}
	
}
