package com.tly.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.tly.model.Fund;
import com.tly.service.IFundService;
import com.tly.util.DateTools;
import com.tly.util.MoneyUtil;

/**
* 公益金、基金账户支出明细
* @ClassName: IFundDao
* @author: yangweihang
* @date: 2018年8月31日 下午10:31:23
*/
@Controller
@RequestMapping("/fund")
public class FundController {
	
	@Autowired
	private IFundService ifus;
	
	@Autowired
	private HttpServletRequest request;
	
	/**
	* 新增
	* yangweihang
	* @date: 2018年8月31日 下午10:49:01
	* @param type
	* @param d
	* @return String
	*/
	@RequestMapping("/insert")
	@ResponseBody
	public String insert(int type,Double money) {
		JSONObject jo = new JSONObject();
		//判断余额是否充足
		Double selmoney = ifus.selectByYe(type);
		if(money > selmoney) {
			return "1";
		}
		//计算余额
		Double yue = selmoney - money;
		//新增
		Fund f = new Fund();
		f.setType(type);
		f.setFundmoney(money);
		f.setFundtime(new Date());
		f.setYue(yue);
		int i = ifus.insert(f);
		return "2";
	}
	
	/**
	 * 查询
	 * yangweihang
	 * @date: 2018年8月31日 下午10:34:30
	 * @param type
	 * @return Double
	 */
	@RequestMapping("/select")
	public String select() {
		DateTools dt = DateTools.getFactory();
		List<Fund> list = ifus.select();
		for(Fund f : list) {
			String type = MoneyUtil.type(f.getType());
			f.setStrtype(type);
			String time = dt.formatDate(f.getFundtime(), "yyyy-MM-dd HH:mm:ss");
			f.setStrtime(time);
		}
		request.setAttribute("list", list);
		return "fund/manage";
	}
}
