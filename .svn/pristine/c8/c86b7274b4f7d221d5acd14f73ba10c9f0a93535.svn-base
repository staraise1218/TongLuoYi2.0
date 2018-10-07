package com.tly.dao;

import java.util.List;
import java.util.Map;

import com.tly.model.Commissionreward;

/**
 * 会员合伙人提成奖励对应
 * @ClassName ICommissionrewardDao
 * @Author yangweihang
 * @Date 2018年8月26日 下午7:51:13
 */
public interface ICommissionrewardDao {
	
	/**
	 * 查询奖励对应
	 * yangweihang
	 * @Date 2018年8月26日 下午7:52:15
	 * @return
	 */
	List<Commissionreward> selectByC();

	/**
     * 根据他是第几级上线和他的mid查询他应该提多少钱
     * @param i 是第几级上线
     * @param id 他的id
     * @return 应该得到的钱数
     */
	Commissionreward selectMoneyByRank(Integer id);
	
	/**
	 * 按级别和身份查询
	 * yangweihang
	 * @Date 2018年8月28日 下午3:21:01
	 * @param map
	 * @return
	 */
	Commissionreward selectByLevelAndIdentity(Map<String,Object> map);
	
}
