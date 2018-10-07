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
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.tly.model.Integral;
import com.tly.service.IIntegralService;
import com.tly.util.DateTools;

import jdk.nashorn.api.scripting.JSObject;

/**
 * 积分明细
 * @ClassName IntegralController
 * @Author yangweihang
 * @Date 2018年8月26日 下午3:44:14
 */
@Controller
@RequestMapping("/integral")
public class IntegralController {
	
	@Autowired
	private IIntegralService iis;
	
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping("/selectyearandmonth")
	@ResponseBody
	public JSONObject selectByIntegral(String wxid,String year,String month) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("wxid", wxid);
		map.put("year", year);
		map.put("month", month);
		List<Integral> list = iis.selectByIntegral(map);
		JSONObject jo = new JSONObject();
		jo.put("list", list);
		return jo;
	}
	
	/**
	 * 查询积分明细
	 * yangweihang
	 * @Date 2018年8月26日 下午3:46:20
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/selectByIntegral")
	public String selectByIntegral(String wxid){
		DateTools dt = DateTools.getFactory();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("wxid", wxid);
		List<Integral> list = iis.selectByIntegral(map);
		for(Integral i : list){
			String time = dt.formatDate(i.getTime(), "yyyy-MM-dd HH:mm:ss");
			i.setStrtime(time);
		}
		request.setAttribute("list", list);
		return "integral/manage";
	}
	
	/**
	 * 录入积分
	 * @param wxid 扫码人微信id
	 * @param type 什么渠道来获取的积分1.消费 2.星评 3.留言
	 * @param eid  设备编号
	 * @param num 具体是多少积分
	 * 时间就是当前时间
	 * 会员使用统计id自己查该会员最后一条
	 * @return 是否录入成功
	 * 接口服务
	 */
	@RequestMapping("insertIntegral")
	@ResponseBody
	public Integer insertIntegral(String wxid,Integer type,Long num,String equipmentnumber) {
		Integer suc = iis.insertIntegral(wxid,type,num,equipmentnumber);
		return suc;
	}
	
	/**
	 * 接口服务
	 * 查询该用户的总积分
	 * @param wxid 微信id
	 * @return 总积分
	 */
	@RequestMapping("selectSumIntegralByWxid")
	@ResponseBody
	public Long selectSumIntegralByWxid(String wxid) {
		Long sumIntegral = iis.selectSumIntegralByWxid(wxid);
		return sumIntegral;
	}
	
	/**
	 * 根据wxid查询该用户的积分获取列表
	 * @param wxid 用户微信id
	 * @return 该用户积分列表
	 */
	@RequestMapping("selelctIntegralByWxid")
	@ResponseBody
	private List selelctIntegralByWxid(String wxid) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("wxid", wxid);
		List<Integral> list = iis.selectByIntegral(map);
		return list;
	}
}
