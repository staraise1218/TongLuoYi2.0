package com.tly.dao;

import com.tly.model.MemberWallet;

import java.util.Map;

/**
 * 会员钱包dao接口
 * @author moxiuchuan
 * 17点15分
 */
public interface IMemberWalletDao {

	/**
	 * 根据用户微信id查询该用户账户余额
	 * @param wxid 微信id
	 * @return 账户余额
	 */
	Double selectRemainMoney(String wxid);

	/**
	 * 前台传来钱数 ，然后将他钱包扣钱
	 * @param wxid 微信id
	 * @param wmoney 要扣的钱数
	 * @return 是否扣成功
	 */
	Integer updateMoneyByWxid(Map map);
	
	/**
	 * 修改会员钱包
	 * yangweihang
	 * @Date 2018年8月31日 下午4:51:18
	 * @param mw
	 * @return
	 */
	int updateByMemberWallet(MemberWallet mw);
}
