package com.tly.dao.impl;

import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IMemberWalletDao;
import com.tly.model.MemberWallet;

/**
 * 会员钱包dao接口
 * @author moxiuchuan
 * 17点15分
 */
public class MemberWalletDao extends SqlSessionDaoSupport implements IMemberWalletDao{

	@Override
	public Double selectRemainMoney(String wxid) {
		Double remainMoney = getSqlSession().selectOne("com.tly.dao.IMemberWalletDao.selectRemainMoney", wxid);
		return remainMoney;
	}

	/**
	 * 修改会员钱包
	 * yangweihang
	 * @Date 2018年8月31日 下午4:51:36
	 * @param mw
	 * @return
	 */
	@Override
	public int updateByMemberWallet(MemberWallet mw) {
		return getSqlSession().update("com.tly.dao.IMemberWalletDao.updateByMemberWallet", mw);
	}

	@Override
	public Integer updateMoneyByWxid(Map map) {
		Integer suc = getSqlSession().update("com.tly.dao.IMemberWalletDao.updateMoneyByWxid", map);
		return suc;
	}

}
