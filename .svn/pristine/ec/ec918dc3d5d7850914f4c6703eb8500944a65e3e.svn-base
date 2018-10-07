package com.tly.service.impl;

import java.util.List;
import java.util.Map;

import com.tly.dao.ICommissionrewardDao;
import com.tly.model.Commissionreward;
import com.tly.service.ICommissionrewardService;

/**
 * 会员合伙人提成奖励对应
 * @ClassName CommissionrewardService
 * @Author yangweihang
 * @Date 2018年8月26日 下午8:00:21
 */
public class CommissionrewardService implements ICommissionrewardService {

	private ICommissionrewardDao icdao;
	
	public ICommissionrewardDao getIcdao() {
		return icdao;
	}

	public void setIcdao(ICommissionrewardDao icdao) {
		this.icdao = icdao;
	}



	/**
	 * 会员合伙人提成奖励对应
	 * yangweihang
	 * @Date 2018年8月26日 下午8:01:05
	 * @return
	 */
	@Override
	public List<Commissionreward> selectByC() {
		return icdao.selectByC();
	}

	/**
	 * 按级别和身份查询
	 * yangweihang
	 * @Date 2018年8月28日 下午3:23:41
	 * @param map
	 * @return
	 */
	@Override
	public Commissionreward selectByLevelAndIdentity(Map<String, Object> map) {
		return icdao.selectByLevelAndIdentity(map);
	}

}
