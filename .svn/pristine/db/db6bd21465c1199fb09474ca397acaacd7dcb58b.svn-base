package com.tly.service;

import java.util.List;
import java.util.Map;

import com.tly.model.Shop;

/**
 * 店铺管理
 * @ClassName IShopService
 * @Author yangweihang
 * @Date 2018年8月26日 下午1:12:52
 */
public interface IShopService {
	
	/**
	 * 查询店铺
	 * yangweihang
	 * @Date 2018年8月26日 下午1:08:36
	 * @return
	 */
	List<Shop> selectByShop();

	/**
	 * 查询该用户附近的店铺
	 * @param page 页码
	 * @param num 一页多少条
	 * @return list 店铺地址和距离的米数
	 */
	List<Map> selectNearby(String location, int num, int page);
	
	/**
	 * 按合伙人查找店铺
	 * yangweihang
	 * @Date 2018年9月1日 上午9:23:13
	 * @param wxid
	 * @return
	 */
	Shop selectpwxidbyshop(String wxid);

	/**
	 * 根据sid查询一个商家
	 * @param sid
	 * @return 一个商家对象
	 */
	Shop selectOneBySid(Integer sid);
	
}
