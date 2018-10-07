package com.tly.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.ICommissionrewardDao;
import com.tly.model.Commissionreward;

/**
 * 会员合伙人提成奖励对应
 * @ClassName CommissionrewardDao
 * @Author yangweihang
 * @Date 2018年8月26日 下午7:52:46
 */
public class CommissionrewardDao extends SqlSessionDaoSupport implements ICommissionrewardDao {

	/**
	 * 查询合伙人对应
	 * yangweihang
	 * @Date 2018年8月26日 下午7:53:46
	 * @return
	 */
	@Override
	public List<Commissionreward> selectByC() {
		return getSqlSession().selectList("com.tly.dao.ICommissionrewardDao.selectByC", null);
	}

	@Override
	public Commissionreward selectMoneyByRank(Integer id) {
		Commissionreward money = getSqlSession().selectOne("com.tly.dao.ICommissionrewardDao.selectMoneyByRank",id);
		return money;
	}

	/**
	 * 查询级别和身份查询
	 * yangweihang
	 * @Date 2018年8月28日 下午3:22:18
	 * @param map
	 * @return
	 */
	@Override
	public Commissionreward selectByLevelAndIdentity(Map<String, Object> map) {
		return getSqlSession().selectOne("com.tly.dao.ICommissionrewardDao.selectByLevelAndIdentity",map);
	}
	
	
	
}
