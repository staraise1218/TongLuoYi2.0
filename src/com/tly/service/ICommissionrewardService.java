package com.tly.service;

import java.util.List;
import java.util.Map;

import com.tly.model.Commissionreward;

/**
 * 会员合伙人提成奖励对应
 * @ClassName ICommissionrewardService
 * @Author yangweihang
 * @Date 2018年8月26日 下午7:59:29
 */
public interface ICommissionrewardService {
	
	/**
	 * 查询奖励对应
	 * yangweihang
	 * @Date 2018年8月26日 下午7:52:15
	 * @return
	 */
	List<Commissionreward> selectByC();
	
	/**
	 * 按级别和身份查询
	 * yangweihang
	 * @Date 2018年8月28日 下午3:21:01
	 * @param map
	 * @return
	 */
	Commissionreward selectByLevelAndIdentity(Map<String,Object> map);
}
