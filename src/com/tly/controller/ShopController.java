package com.tly.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tly.model.Shop;
import com.tly.service.IShopService;

/**
 * 店铺管理
 * @ClassName ShopController
 * @Author yangweihang
 * @Date 2018年8月26日 下午1:15:51
 */
@Controller
@RequestMapping("/shop")
public class ShopController {
	
	@Autowired
	private IShopService iss;
	
	@Autowired
	private HttpServletRequest request;
	
	/**
	 * 查询店铺
	 * yangweihang
	 * @Date 2018年8月26日 下午1:18:29
	 * @return
	 */
	@RequestMapping("/selectbyshop")
	public String selectByShop(){
		List<Shop> list = iss.selectByShop();
		request.setAttribute("list", list);
		return "shop/manage";
	}
	
	/**
	 * 接口服务 返回一个对象 + juli
	 * 调用距离当前位置20km以内的店铺
	 * 查询该用户附近的店铺
	 * @return list 店铺地址和距离的米数
	 */
	@RequestMapping("/selectNearby")
	@ResponseBody
	public List<Map> selectNearby(String location,int num,int page) {
		List<Map> list = iss.selectNearby(location,num,page);//查询20以内各个商家的位置
		return list;
	}

	/**
	 * 根据sid查询一个商家
	 * @param sid
	 * @return 一个商家对象
	 */
	@RequestMapping("/selectOneBySid")
	@ResponseBody
	public Shop selectOneBySid(Integer sid) {
		
		Shop shop = iss.selectOneBySid(sid);
		return shop;
	}
}
