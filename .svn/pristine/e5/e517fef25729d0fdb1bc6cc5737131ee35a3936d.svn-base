package com.tly.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IShopDao;
import com.tly.model.Shop;

/**
 * 附近店铺管理
 * @ClassName ShopDao
 * @Author yangweihang
 * @Date 2018年8月26日 下午1:11:24
 */
public class ShopDao extends SqlSessionDaoSupport implements IShopDao {

	/**
	 * 查询店铺
	 * yangweihang
	 * @Date 2018年8月26日 下午1:11:37
	 * @return
	 */
	@Override
	public List<Shop> selectByShop() {
		return getSqlSession().selectList("com.tly.dao.IShopDao.selectByShop", null);
	}
	
	/**
	 * 按合伙人查找店铺
	 * yangweihang
	 * @Date 2018年9月1日 上午9:23:13
	 * @param wxid
	 * @return
	 */
	public Shop selectpwxidbyshop(String wxid){
		return getSqlSession().selectOne("com.tly.dao.IShopDao.selectpwxidbyshop", wxid);
	}

	@Override
	public List<Map> selectNearby(Map map) {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("com.tly.dao.IShopDao.selectNearby", map);
	}

	@Override
	public Shop selectOneBySid(Integer sid) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("com.tly.dao.IShopDao.selectOneBySid",sid);
	}

}
