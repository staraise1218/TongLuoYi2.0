package com.tly.service.impl;

import java.util.List;

import com.tly.dao.IFundDao;
import com.tly.model.Fund;
import com.tly.service.IFundService;

/**
* 公益金、基金账户支出明细
* @ClassName: FundDao.java
* @author: yangweihang
* @date: 2018年8月31日 下午10:38:57
*/
public class FundService implements IFundService {

	private IFundDao ifudao;
	
	public IFundDao getIfudao() {
		return ifudao;
	}

	public void setIfudao(IFundDao ifudao) {
		this.ifudao = ifudao;
	}

	/**
	* 新增
	* yangweihang
	* @date: 2018年8月31日 下午10:34:30
	* @param f
	* @return int
	*/
	@Override
	public int insert(Fund f) {
		return ifudao.insert(f);
	}

	/**
	 * 查询余额
	 * yangweihang
	 * @date: 2018年8月31日 下午10:34:30
	 * @param type
	 * @return Double
	 */
	@Override
	public Double selectByYe(int type) {
		return ifudao.selectByYe(type);
	}

	/**
	 * 查询
	 * yangweihang
	 * @date: 2018年8月31日 下午10:34:30
	 * @param type
	 * @return Double
	 */
	@Override
	public List<Fund> select() {
		return ifudao.select();
	}

}
