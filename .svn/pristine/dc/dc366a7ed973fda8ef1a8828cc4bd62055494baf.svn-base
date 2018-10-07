package com.tly.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IFinanceDao;
import com.tly.model.Finance;

/**
 * 财务管理
 * @ClassName FinanceDao
 * @Author yangweihang
 * @Date 2018年8月26日 下午10:05:57
 */
public class FinanceDao extends SqlSessionDaoSupport implements IFinanceDao {

	/**
	 * 查询钱包明细
	 * yangweihang
	 * @Date 2018年8月26日 下午10:08:32
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByFinance(String wxid) {
		return getSqlSession().selectList("com.tly.dao.IFinanceDao.selectByFinance", wxid);
	}

	/**
	 * 查询下线明细
	 * yangweihang
	 * @Date 2018年8月26日 下午10:57:07
	 * @param map
	 * @return
	 */
	@Override
	public List<Finance> selectByUp(Map<String, Object> map) {
		return getSqlSession().selectList("com.tly.dao.IFinanceDao.selectByUp", map);
	}

	/**
	 * 查询平台收入日报
	 * yangweihang
	 * @Date 2018年8月27日 上午3:09:47
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectrb() {
		return getSqlSession().selectList("com.tly.dao.IFinanceDao.selectrb", null);
	}

	/**
	 * 查询平台收入周报
	 * yangweihang
	 * @Date 2018年8月27日 上午3:10:58
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectzb() {
		return getSqlSession().selectList("com.tly.dao.IFinanceDao.selectzb", null);
	}

	/**
	 * 查询平台收入月报
	 * yangweihang
	 * @Date 2018年8月27日 上午3:11:11
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectyb() {
		return getSqlSession().selectList("com.tly.dao.IFinanceDao.selectyb", null);
	}
	
	/**
	 * 查询平台收入季报
	 * yangweihang
	 * @Date 2018年8月27日 上午3:11:11
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectjb() {
		return getSqlSession().selectList("com.tly.dao.IFinanceDao.selectjb", null);
	}

	/**
	 * 查询平台收入半年报
	 * yangweihang
	 * @Date 2018年8月27日 上午3:11:24
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectbnb() {
		return getSqlSession().selectList("com.tly.dao.IFinanceDao.selectbnb", null);
	}

	/**
	 * 查询平台收入年报
	 * yangweihang
	 * @Date 2018年8月27日 上午3:11:36
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectnb() {
		return getSqlSession().selectList("com.tly.dao.IFinanceDao.selectnb", null);
	}

	/**
	 * 查询销售明细
	 * yangweihang
	 * @Date 2018年8月27日 上午4:09:33
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByXs() {
		return getSqlSession().selectList("com.tly.dao.IFinanceDao.selectByXs", null);
	}

	/**
	 * 押金收入明细
	 * yangweihang
	 * @Date 2018年8月27日 上午4:40:15
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByYj() {
		return getSqlSession().selectList("com.tly.dao.IFinanceDao.selectByYj", null);
	}

	/**
	 * 扫码收入分账、提成、公益金、基金明细
	 * yangweihang
	 * @Date 2018年8月27日 上午8:15:32
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectfz() {
		return getSqlSession().selectList("com.tly.dao.IFinanceDao.selectfz", null);
	}

	/**
	 * 公益金基金明细
	 * yangweihang
	 * @Date 2018年8月27日 上午10:47:07
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByFund() {
		return getSqlSession().selectList("com.tly.dao.IFinanceDao.selectByFund", null);
	}

	/**
	 * 新增财务
	 * yangweihang
	 * @Date 2018年8月28日 下午6:04:06
	 * @param f
	 * @return
	 */
	@Override
	public int insertfinance(Finance f) {
		return getSqlSession().insert("com.tly.dao.IFinanceDao.insertfinance", f);
	}

	/**
	 * 按微信id查询收益记录
	 * yangweihang
	 * @Date 2018年8月28日 下午7:51:15
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByWxid(String wxid) {
		return getSqlSession().selectList("com.tly.dao.IFinanceDao.selectByWxid", wxid);
	}

	/**
	 * 查询没有看的财务数量
	 * yangweihang
	 * @Date 2018年8月29日 上午10:46:35
	 * @param wxid
	 * @return
	 */
	@Override
	public int selectByNotLookcount(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.IFinanceDao.selectByNotLookcount", wxid);
	}

	/**
	 * 按微信id查询财务
	 * yangweihang
	 * @Date 2018年8月29日 上午10:47:41
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Finance> selectByNotLook(String wxid) {
		return getSqlSession().selectList("com.tly.dao.IFinanceDao.selectByNotLook", wxid);
	}

	/**
	 * 修改消费一级上线为已读
	 * yangweihang
	 * @Date 2018年8月29日 上午11:11:55
	 * @param id
	 * @return
	 */
	@Override
	public int updatexfone(int id) {
		return getSqlSession().update("com.tly.dao.IFinanceDao.updatexfone", id);
	}

	/**
	 * 修改消费二级上线为已读
	 * yangweihang
	 * @Date 2018年8月29日 上午11:08:26
	 * @param id
	 * @return
	 */
	@Override
	public int updatexftwo(int id) {
		return getSqlSession().update("com.tly.dao.IFinanceDao.updatexftwo", id);
	}

	/**
	 * 修改租用一级上线为已读
	 * yangweihang
	 * @Date 2018年8月29日 上午11:11:05
	 * @param id
	 * @return
	 */
	@Override
	public int updatezyone(int id) {
		return getSqlSession().update("com.tly.dao.IFinanceDao.updatezyone", id);
	}

	/**
	 * 修改租用二级上线为已读
	 * yangweihang
	 * @Date 2018年8月29日 上午11:08:51
	 * @param id
	 * @return
	 */
	@Override
	public int updatezytwo(int id) {
		return getSqlSession().update("com.tly.dao.IFinanceDao.updatezytwo", id);
	}

	/**
	 * 修改购买一级上线为已读
	 * yangweihang
	 * @Date 2018年8月29日 上午11:09:16
	 * @param id
	 * @return
	 */
	@Override
	public int updategmone(int id) {
		return getSqlSession().update("com.tly.dao.IFinanceDao.updategmone", id);
	}

	/**
	 * 修改购买二级上线为已读
	 * yangweihang
	 * @Date 2018年8月29日 上午11:10:09
	 * @param id
	 * @return
	 */
	@Override
	public int updategmtwo(int id) {
		return getSqlSession().update("com.tly.dao.IFinanceDao.updategmtwo", id);
	}

	@Override
	public List<Map> selectEarningsByWxid(String wxid) {
		// TODO Auto-generated method stub
		List<Map> list = getSqlSession().selectList("com.tly.dao.IFinanceDao.selectEarningsByWxid", wxid);
		return list;
	}
	
}
