package com.tly.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tly.model.EvaluationMessage;
import com.tly.model.UserStatistics;
import com.tly.service.IEvaluationMessageService;
import com.tly.service.IUserStatisticsService;

/**
 * 会员使用统计
 * @ClassName UserStatisticsController
 * @Author yangweihang
 * @Date 2018年8月26日 下午4:24:29
 */
@Controller
@RequestMapping("/userstatistics")
public class UserStatisticsController {
	
	@Autowired
	private IUserStatisticsService iuss;
	
	@Autowired
	private IEvaluationMessageService ievms;
	
	@Autowired
	private HttpServletRequest request;
	
	/**
	 * 查询会员使用统计
	 * yangweihang
	 * @Date 2018年8月26日 下午4:27:42
	 * @param mid
	 * @return
	 */
	@RequestMapping("/selectbyus")
	public String selectByUs(int mid){
		List<Map<String, Object>> list = iuss.selectByUs(mid);
		request.setAttribute("list", list);
		return "userstatistics/manage";
	}
	
	
	/**
	 * 接口服务
	 * 该用户的使用总次数和总时长
	 * @return 总次数和总时长
	 * 返回这个形式：{sumUseTime=60542428543596, count=3}
	 */
	@RequestMapping("/selectSumuserstatistics")
	@ResponseBody
	public Map selectSumuserstatistics(String wxid) {
		Map map = iuss.selectSumuserstatistics(wxid);
		return map;
	}
	
	/**
	 * 插入一个会员统计
	 * 只要是前台发送信号进入该方法 那么该设备开始时间就是当前系统时间
	 * @param wxid 该用户微信id
	 * @param equipmentnumber 设备的编号
	 * @param starttime 启动开始时间
	 * ,@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")Date starttime
	 * @return 0：不成功 1：成功
	 */
	@RequestMapping("/insertOne")
	@ResponseBody
	public Integer insertOne(String wxid,String equipmentnumber) {
		//Integer insert = iuss.insert(wxid, equipmentnumber);
		//查询增加的记录
		UserStatistics us = iuss.selectByLast(wxid);
		//增加星级评价
		EvaluationMessage em = new EvaluationMessage();
		em.setUsid(us.getId());
		int insertem = ievms.insertem(em);
		return insertem;
	}
 
	
	/**
	 * 修改该用户的结束时间和使用时间
	 * 硬件发送使用完毕的信号 这边结束时间就是系统当前时间
	 * @param wxid 用户微信id
	 * @return 0.不成功 1.成功
	 */
	@RequestMapping("updateTime")
	@ResponseBody
	public Integer updateTime(String wxid) {
		Integer suc = iuss.updateTime(wxid);
		return suc;
	}
	
	/**
	 * 查询该用户近30天的使用记录
	 * @param wxid 该用户的微信id
	 * @return 使用记录list
	 */
	@RequestMapping("selectUserstatisticsListByWxid")
	@ResponseBody
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	public List selectUserstatisticsListByWxid(String wxid) {
		List list = iuss.selectUserstatisticsListByWxid(wxid);
		return list;
	}
}
