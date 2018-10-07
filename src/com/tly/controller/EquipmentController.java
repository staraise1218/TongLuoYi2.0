package com.tly.controller;

import java.io.BufferedOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.tly.model.Equipment;
import com.tly.service.IEquipmentService;
import com.tly.util.StringTools;
import com.tly.util.YesOrNo;

/**
 * 设备
 * @ClassName EquipmentController
 * @Author yangweihang
 * @Date 2018年8月24日 上午11:46:05
 */
@Controller
@RequestMapping("/equipment")
public class EquipmentController {
	
	@Autowired
	private IEquipmentService ies;
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private  ServletContext application;
	
	/**
	 * 上传图片新增设备
	 * yangweihang
	 * @Date 2018年8月24日 上午11:58:14
	 * @param e
	 * @return
	 */
	@RequestMapping("/insert")
	public String insert(Equipment e,MultipartFile filename){
		//获得项目路径
		String pUrl = application.getRealPath("/img/");
		StringBuffer url = new StringBuffer(pUrl);
        BufferedOutputStream out = null;
		try {
			String name = filename.getOriginalFilename();
			byte[] bytes = filename.getBytes();
			url.append(name);
			out = new BufferedOutputStream(new FileOutputStream(new File(url.toString())));
			out.write(bytes);
			System.out.println("url"+url);
			out.flush();
			out.close();
		} catch (Exception e1) {
			e1.getMessage();
		}
		System.out.println(url.toString());
		e.setEimg(url.toString());
		int result = ies.insert(e);
		return "equipment/insert";
	}
	
	/**
	 * 按设备型号查询是否存在
	 * yangweihang
	 * @Date 2018年8月24日 下午3:38:48
	 * @param type
	 * @return
	 */
	@RequestMapping("/selectByCondition")
	@ResponseBody
	public String selectByCondition(String type){
		Map<String,Object> map = new HashMap<String,Object>();
		StringTools st = StringTools.getFactory();
		if(!st.isNullOrEmpty(type)){
			map.put("type", type);
		}
		//默认是存在
		String str = YesOrNo.YES.toString();
		Equipment e = ies.selectByCondition(map);
		//不存在
		if(e == null){
			str = YesOrNo.NO.toString();
		}
		return str;
	}
	
	/**
	 * 按设备编号查询除了他本身是否还有相同的设备
	 * yangweihang
	 * @Date 2018年8月25日 下午4:05:53
	 * @param types
	 * @param type
	 * @return
	 */
	@RequestMapping("/selectEByTypes")
	@ResponseBody
	public String selectEByTypes(String types,String type){
		Map<String,Object> map = new HashMap<String,Object>();
		StringTools st = StringTools.getFactory();
		if(!st.isNullOrEmpty(types) && !st.isNullOrEmpty(type)){
			map.put("typep", type);
			map.put("types", types);
		}
		//默认是存在
		String str = YesOrNo.YES.toString();
		Equipment e = ies.selectByCondition(map);
		//不存在
		if(e == null){
			str = YesOrNo.NO.toString();
		}
		return str;
	}
	
	/**
	 * 查询设备名称
	 * yangweihang
	 * @Date 2018年8月25日 上午9:30:58
	 * @return
	 */
	@RequestMapping("/selectEByName")
	public String selectEByName() {
		List<String> list = ies.selectEByName();
		request.setAttribute("list", list);
		return "equipmentsublist/insert";
	}
	
	/**
	 * 按设备名称查询
	 * yangweihang
	 * @Date 2018年8月25日 上午10:03:59
	 * @param name
	 * @return
	 */
	@RequestMapping("/selectEByType")
	@ResponseBody
	public List selectEByType(String name) {
		Map<String, Object> map = new HashMap<String,Object>();
		StringTools st = StringTools.getFactory();
		if(!st.isNullOrEmpty(name)) {
			map.put("name", name);
		}
		List<Equipment> result = ies.selectEByType(map);
		return result;
	}
	
	/**
	 * 查询库存设备
	 * yangweihang
	 * @Date 2018年8月25日 下午3:04:58
	 * @return
	 */
	@RequestMapping("/selectByEquipment")
	public String selectByEquipment() {
		List<Map<String, Object>> list = ies.selectByEquipment();
		request.setAttribute("list", list);
		return "equipment/manage";
	}
	
	/**
	 * 按设备id查询
	 * yangweihang
	 * @Date 2018年8月25日 下午3:34:01
	 * @param id
	 * @return
	 */
	@RequestMapping("/selectOne")
	public String selectOne(int id) {
		Equipment e = ies.selectOne(id);
		request.setAttribute("e", e);
		return "equipment/update";
	}
	
	/**
	 * 修改
	 * yangweihang
	 * @Date 2018年8月25日 下午4:36:50
	 * @param e
	 * @return
	 */
	@RequestMapping("/update")
	public String update(Equipment e) {
		int result = ies.update(e);
		request.setAttribute("result", result);
		return selectByEquipment();
	}
	
	@RequestMapping("/selectList")
	@ResponseBody
	public List selectList(String type ) {
		List list = ies.selectList(type);
		return list;
		
	}
}
