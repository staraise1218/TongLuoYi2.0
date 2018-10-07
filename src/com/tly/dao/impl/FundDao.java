package com.tly.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IFundDao;
import com.tly.model.Fund;

/**
* 公益金、基金账户支出明细
* @ClassName: FundDao.java
* @author: yangweihang
* @date: 2018年8月31日 下午10:38:57
*/
public class FundDao extends SqlSessionDaoSupport implements IFundDao {

	/**
	* 新增
	* yangweihang
	* @date: 2018年8月31日 下午10:34:30
	* @param f
	* @return int
	*/
	@Override
	public int insert(Fund f) {
		return getSqlSession().insert("com.tly.dao.IFundDao.insert", f);
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
		return getSqlSession().selectOne("com.tly.dao.IFundDao.selectByYe", type);
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
		return getSqlSession().selectList("com.tly.dao.IFundDao.select", null);
	}

}
