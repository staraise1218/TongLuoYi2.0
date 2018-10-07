package com.tly.dao.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IUserStatisticsDao;
import com.tly.model.UserStatistics;

public class UserStatisticsDao extends SqlSessionDaoSupport implements IUserStatisticsDao{

	@Override
	public Integer selectUseSumByMid(int mid) {
		Integer sum = getSqlSession().selectOne("com.tly.dao.IUserStatisticsDao.selectUseSumByMid",mid);
		return sum;
	}

	/**
	 * 查询会员使用
	 * yangweihang
	 * @Date 2018年8月26日 下午4:16:55
	 * @param mid
	 * @return
	 */
	@Override
	public List<Map<String,Object>> selectByUs(int mid) {
		return getSqlSession().selectList("com.tly.dao.IUserStatisticsDao.selectByUs", mid);
	}

	@Override
	public Integer insert(UserStatistics ust) {
		Integer insert = getSqlSession().insert("com.tly.dao.IUserStatisticsDao.insert",ust);//1.成功 0.不成功
		return insert;
	}

	@Override
	public Integer selectUsidByWxidAndFirstTime(String wxid) {
		Integer usid = getSqlSession().selectOne("com.tly.dao.IUserStatisticsDao.selectUsidByWxidAndFirstTime", wxid);
		return usid;
	}

	@Override
	public Map selectSumuserstatistics(String wxid) {
		Map map = getSqlSession().selectOne("com.tly.dao.IUserStatisticsDao.selectSumuserstatistics",wxid);
		return map;
	}

	@Override
	public UserStatistics selectLast(String wxid) {
		UserStatistics us = getSqlSession().selectOne("com.tly.dao.IUserStatisticsDao.selectLast", wxid);
		return us;
	}

	@Override
	public Integer updateTime(UserStatistics us) {
		Integer suc = getSqlSession().update("com.tly.dao.IUserStatisticsDao.updateTime", us);
		return suc;
	}

	@Override
	public List selectUserstatisticsListByWxid(String wxid) {
		List list = getSqlSession().selectList("com.tly.dao.IUserStatisticsDao.selectUserstatisticsListByWxid", wxid);
		return list;
	}

	/**
	 * 按管理员微信id查询该店铺没有开机的设备
	 * yangweihang
	 * @Date 2018年8月29日 下午5:03:18
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectNotStartingByWxid(String wxid) {
		return getSqlSession().selectList("com.tly.dao.IUserStatisticsDao.selectNotStartingByWxid", wxid);
	}

	/**
	 * 按管理员微信id查询该店铺没有开机的设备的未读数量
	 * yangweihang
	 * @Date 2018年8月29日 下午5:44:55
	 * @param wxid
	 * @return
	 */
	@Override
	public int selectNotStartingByWxidcount(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.IUserStatisticsDao.selectNotStartingByWxidcount", wxid);
	}

	/**
	 * 按管理员微信id查询店铺没有开机的设备修改为已读
	 * yangweihang
	 * @Date 2018年8月29日 下午5:48:18
	 * @param wxid
	 * @return
	 */
	@Override
	public int updateNotStartingByLook(String wxid) {
		return getSqlSession().update("com.tly.dao.IUserStatisticsDao.updateNotStartingByLook", wxid);
	}

	/**
	 * 按合伙人微信id查询该店铺没有开机的设备
	 * yangweihang
	 * @Date 2018年8月31日 下午1:35:33
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectNotStartingByPwxid(String wxid) {
		return getSqlSession().selectList("com.tly.dao.IUserStatisticsDao.selectNotStartingByPwxid", wxid);
	}

	/**
	 * 按合伙人微信id查询该店铺没有开机的设备的未读数量
	 * yangweihang
	 * @Date 2018年8月31日 下午1:46:34
	 * @param wxid
	 * @return
	 */
	@Override
	public int selectNotStartingBypwxidcount(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.IUserStatisticsDao.selectNotStartingBypwxidcount", wxid);
	}

	/**
	 * 按合伙人微信id查询店铺没有开机的设备修改为已读
	 * yangweihang
	 * @Date 2018年8月31日 下午1:56:45
	 * @param wxid
	 * @return
	 */
	@Override
	public int updateNotStartingByPlook(String wxid) {
		return getSqlSession().update("com.tly.dao.IUserStatisticsDao.updateNotStartingByPlook", wxid);
	}
	
	/**
	 * 查询当前用户的最后一条记录
	 * yangweihang
	 * @Date 2018年9月11日 下午2:55:44
	 * @param wxid
	 * @return
	 */
	public UserStatistics selectByLast(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.IUserStatisticsDao.selectByLast", wxid);
	}
}
