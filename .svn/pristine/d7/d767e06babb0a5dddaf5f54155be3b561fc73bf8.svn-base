package com.tly.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tly.model.Commissionreward;
import com.tly.service.ICommissionrewardService;
import com.tly.util.RoleUtil;
import com.tly.util.YesOrNo;

/**
 * 会员合伙人提成奖励对应
 * @ClassName CommissionrewardController
 * @Author yangweihang
 * @Date 2018年8月26日 下午8:02:50
 */
@Controller
@RequestMapping("/commissionreward")
public class CommissionrewardController {
	
	@Autowired
	private ICommissionrewardService ics;
	
	@Autowired
	private HttpServletRequest request;
	
	/**
	 * 查询奖励对应
	 * yangweihang
	 * @Date 2018年8月26日 下午8:05:13
	 * @return
	 */
	@RequestMapping("/select")
	public String selectByC(){
		List<Commissionreward> list = ics.selectByC();
		for(Commissionreward c : list){
			if(c.getIdentity() == YesOrNo.YES){
				c.setStrlevel(RoleUtil.memberlevel(c.getLevel()));
				c.setStridentity(RoleUtil.identity(c.getIdentity()));
			}
			if(c.getIdentity() == YesOrNo.ON){
				c.setStrlevel(RoleUtil.partnerlevel(c.getLevel()));
				c.setStridentity(RoleUtil.identity(c.getIdentity()));
			}
		}
		request.setAttribute("list", list);
		return "commissionreward/manage";
	}
	
}
