package com.tly.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.tly.model.EvaluationMessage;
import com.tly.model.Integral;
import com.tly.service.IEvaluationMessageService;
import com.tly.service.IIntegralService;
import com.tly.util.SensitiveWordUtil;
import com.tly.util.StringTools;
import com.tly.util.YesOrNo;

/**
 * 会员评价留言
 * @ClassName EvaluationMassageController
 * @Author yangweihang
 * @Date 2018年8月27日 下午3:26:59
 */
@Controller
@RequestMapping("/evaluationmassage")
public class EvaluationMessageController {
	
	@Autowired
	private IEvaluationMessageService ievms;
	
	@Autowired
	private IIntegralService iis;
	
	/**
	 * 新增会员评价留言
	 * yangweihang
	 * @Date 2018年8月27日 下午3:57:07
	 * @param em
	 * @return
	 */
	@RequestMapping("/insertem")
	@ResponseBody
	public JSONObject insertem(EvaluationMessage em){
		JSONObject jo = new JSONObject();
		Map<String,Object> map = new HashMap<String,Object>();
		//判断功效是否选择了
		if(em.getEffect() == 0) {
			jo.put("result", "功效必须选择！");
			return jo;
		}
		//增加会员评价
		int result = ievms.updateem(em);
		if(result > 0) {
			//修改积分星评
			Integral i = new Integral();
			i.setStarrating((long)YesOrNo.YES);
			i.setUsid(em.getUsid());
			int result1 = iis.updatestarrating(i);
			jo.put("resulti", result1);
		}
		jo.put("result", result);
		return jo;
	}
	
	/**
	 * 留言
	 * yangweihang
	 * @Date 2018年8月27日 下午5:24:49
	 * @param em
	 * @return
	 */
	@RequestMapping("/updateByleavemessage")
	@ResponseBody
	public JSONObject updateByleavemessage(EvaluationMessage em) {
		JSONObject jo = new JSONObject();
		StringTools st = StringTools.getFactory();
		//留言不能超过50字
		if(em.getLeavemessage().length() > 50) {
			jo.put("result", "留言不能超过50字！");
			return jo;
		}
		//判断理疗部位是否选择了
		if(st.isNullOrEmpty(em.getPart())) {
			jo.put("result", "理疗部位必须选择！");
			return jo;
		}
		//判断是否提交过星评
		EvaluationMessage selem = ievms.selectByOneNotnull(em.getEmid());
		if(selem == null) {
			jo.put("result", "没有提交星评不可以留言！");
			return jo;
		}
		//限制30天内可留言和追加留言
		EvaluationMessage sele = ievms.selectBytime(em.getEmid());
		System.out.println("sele"+sele);
		if(sele == null) {
			jo.put("result", "留言已过时不可更改");
			return jo;
		}
		//留言
		int result = ievms.updateByleavemessage(em);
		if(result > 0) {
			//修改积分留言
			Integral i = new Integral();
			i.setLeaveword((long)YesOrNo.YES);
			i.setUsid(sele.getUsid());
			int result1 = iis.updatestarrating(i);
			jo.put("result1", result1);
		}
		jo.put("result", result);
		return jo;
	}
	
	/**
	 * 追加留言
	 * yangweihang
	 * @Date 2018年8月27日 下午6:30:54
	 * @param em
	 * @return
	 */
	@RequestMapping("/updateByadditionalcomments")
	@ResponseBody
	public JSONObject updateByadditionalcomments(EvaluationMessage em) {
		JSONObject jo = new JSONObject();
		//追加留言不能超过50字
		if(em.getAdditionalcomments().length() > 50) {
			jo.put("result", "追加留言不能超过50字！");
			return jo;
		}
		//判断是否留过言
		EvaluationMessage selem = ievms.selectByac(em.getEmid());
		if(selem == null) {
			jo.put("result", "只有留过言才可以追加留言！");
			return jo;
		}
		//追加留言
		int result = ievms.updateByadditionalcomments(em);
		jo.put("result", result);
		return jo;
	}
	
	/**
	 * 按所有人查找留言
	 * yangweihang
	 * @Date 2018年8月27日 下午7:31:17
	 * @param mid
	 * @return
	 */
	@RequestMapping("/selectByLeavmessage")
	@ResponseBody
	public JSONObject selectByLeavmessage(int pageNum,int pageSize) {
		JSONObject jo = new JSONObject();
		StringTools st = StringTools.getFactory();
		Map<String,Object> map = new HashMap<String,Object>();
		pageNum = (pageNum - 1) * pageSize;
		map.put("pageNum", pageNum);
		map.put("pageSize", pageSize);
		List<Map<String, Object>> list = ievms.selectByLeavmessage(map);
		//初始化敏感词
		SensitiveWordUtil.sensitiveword();
		String leavemessage = "";
		//敏感词替换
		for(Map<String,Object> m : list) {
			if(m.get("leavemessage") != null) {
				leavemessage = SensitiveWordUtil.replaceSensitiveWord((String)m.get("leavemessage"), "**");
			}
			m.replace("leavemessage", leavemessage);
		}
		jo.put("list", list);
		return jo;
	}
	
	/**
	 * 按某人查找留言
	 * yangweihang
	 * @Date 2018年9月11日 上午11:03:31
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/selectByWxid")
	@ResponseBody
	public JSONObject selectByWxid(String wxid,Integer pageNum,Integer pageSize){
		JSONObject jo = new JSONObject();
		pageNum = (pageNum - 1) * pageSize;
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("wxid", wxid);
		map.put("pageNum", pageNum);
		map.put("pageSize", pageSize);
		List<Map<String, Object>> list = ievms.selectByWxid(map);
		jo.put("list", list);
		return jo;
	}
	
}
