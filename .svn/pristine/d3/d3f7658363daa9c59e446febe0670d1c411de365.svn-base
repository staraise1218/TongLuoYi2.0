package com.tly.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IIntegralDao;
import com.tly.model.Integral;

/**
 * 积分明细
 * @ClassName IntegralDao
 * @Author yangweihang
 * @Date 2018年8月26日 下午3:39:14
 */
public class IntegralDao extends SqlSessionDaoSupport implements IIntegralDao {

	/**
	 * 查询积分明细
	 * yangweihang
	 * @Date 2018年8月26日 下午3:39:47
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Integral> selectByIntegral(Map<String,Object> map) {
		return getSqlSession().selectList("com.tly.dao.IIntegralDao.selectByIntegral", map);
	}

	/**
	 * 修改星评
	 * yangweihang
	 * @Date 2018年8月27日 下午5:01:49
	 * @param usid
	 * @return
	 */
	@Override
	public int updatestarrating(Integral i) {
		return getSqlSession().update("com.tly.dao.IIntegralDao.updatestarrating", i);
	}

	/**
	 * 追加留言
	 * yangweihang
	 * @Date 2018年8月27日 下午6:43:07
	 * @param i
	 * @return
	 */
	@Override
	public int updateleaveword(Integral i) {
		return getSqlSession().update("com.tly.dao.IIntegralDao.updateleaveword", i);
	}

	/**
	 * 查询7天内的数据
	 * yangweihang
	 * @Date 2018年8月28日 下午8:25:30
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Integral> selectByTime(String wxid) {
		return getSqlSession().selectList("com.tly.dao.IIntegralDao.selectByTime", wxid);
	}

	@Override
	public Integer insertIntegral(Integral in) {
		int suc = getSqlSession().insert("com.tly.dao.IIntegralDao.insertIntegral", in);
		return suc;
	}

	/**
	 * 查询没有读的数量
	 * yangweihang
	 * @Date 2018年8月29日 上午9:34:13
	 * @param wxid
	 * @return
	 */
	@Override
	public Integer selectByNotLook(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.IIntegralDao.selectByNotLook", wxid);
	}

	/**
	 * 修改成已读
	 * yangweihang
	 * @Date 2018年8月29日 上午9:46:33
	 * @param wxid
	 * @return
	 */
	@Override
	public int updateBylook(String wxid) {
		return getSqlSession().update("com.tly.dao.IIntegralDao.updateBylook", wxid);
	}

	@Override
	public Long selectSumIntegralByWxid(String wxid) {
		// TODO Auto-generated method stub
		Long SumIntegral = getSqlSession().selectOne("com.tly.dao.IIntegralDao.selectSumIntegralByWxid", wxid);
		return SumIntegral;
	}

}
