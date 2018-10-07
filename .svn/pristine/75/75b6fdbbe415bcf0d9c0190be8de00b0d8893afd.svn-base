package com.tly.dao;

import java.util.List;
import java.util.Map;

import com.tly.model.Shop;

/**
 * 附近店铺管理
 * @ClassName IShopDao
 * @Author yangweihang
 * @Date 2018年8月26日 下午1:07:47
 */
public interface IShopDao {
	
	/**
	 * 查询店铺
	 * yangweihang
	 * @Date 2018年8月26日 下午1:08:36
	 * @return
	 */
	List<Shop> selectByShop();

	/**
	 * 
	 * @param map
	 * @return
	 */
	List<Map> selectNearby(Map map);
	
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
