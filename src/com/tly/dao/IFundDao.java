package com.tly.dao;

import java.util.List;

import com.tly.model.Fund;

/**
* 公益金、基金账户支出明细
* @ClassName: IFundDao
* @author: yangweihang
* @date: 2018年8月31日 下午10:31:23
*/
public interface IFundDao {
	
   /**
	* 新增
	* yangweihang
	* @date: 2018年8月31日 下午10:34:30
	* @param f
	* @return int
	*/
	int insert(Fund f);
	
	/**
	 * 查询余额
	 * yangweihang
	 * @date: 2018年8月31日 下午10:34:30
	 * @param type
	 * @return Double
	 */
	Double selectByYe(int type);
	
	/**
	 * 查询
	 * yangweihang
	 * @date: 2018年8月31日 下午10:34:30
	 * @param type
	 * @return Double
	 */
	List<Fund> select();
}
