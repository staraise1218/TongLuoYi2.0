package com.tly.dao.impl;


import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IEquipmentSublistDao;
import com.tly.model.EquipmentSublist;

/**
 * @author moxiuchuan
 * 设备子表dao实现类
 * 15点19分
 */
public class EquipmentSublistDao  extends SqlSessionDaoSupport implements IEquipmentSublistDao{

	@Override
	public Integer selectStateByEquipmentnumber(String equipmentnumber) {
		Integer state = getSqlSession().selectOne("com.tly.dao.IEquipmentSublistDao.selectStateByEquipmentnumber", equipmentnumber);
		return state;
	}

	/**
	 * 新增产品
	 * yangweihang
	 * @Date 2018年8月25日 上午11:01:28
	 * @param es
	 * @return
	 */
	@Override
	public int insertes(EquipmentSublist es) {
		return getSqlSession().insert("com.tly.dao.IEquipmentSublistDao.insertes", es);
	}

	/**
	 * 查询设备编号
	 * yangweihang
	 * @Date 2018年8月25日 上午11:14:30
	 * @param map
	 * @return
	 */
	@Override
	public EquipmentSublist selectByNumber(Map<String, Object> map) {
		return getSqlSession().selectOne("com.tly.dao.IEquipmentSublistDao.selectByCondition", map);
	}

	@Override
	public Double selectMoneyByEquipmentnumber(String equipmentnumber) {
		Double money = getSqlSession().selectOne("com.tly.dao.IEquipmentSublistDao.selectMoneyByEquipmentnumber",equipmentnumber);
		return money;
	}
	
	/**
	 * 查询产品管理
	 * yangweihang
	 * @Date 2018年8月25日 下午5:21:47
	 * @param map
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByProduct(Map<String, Object> map) {
		return getSqlSession().selectList("com.tly.dao.IEquipmentSublistDao.selectByProduct", map);
	}

	/**
	 * 修改产品编码
	 * yangweihang
	 * @Date 2018年8月25日 下午7:20:40
	 * @param es
	 * @return
	 */
	@Override
	public int updatepro(EquipmentSublist es) {
		return getSqlSession().update("com.tly.dao.IEquipmentSublistDao.updatepro", es);
	}

	/**
	 * 批量删除产品
	 * yangweihang
	 * @Date 2018年8月26日 下午12:52:42
	 * @param arr
	 * @return
	 */
	@Override
	public int deletepro(Integer[] arr) {
		return getSqlSession().delete("com.tly.dao.IEquipmentSublistDao.deletepro", arr);
	}

	@Override
	public Integer selectZiIdByEquipmentnumber(String equipmentnumber) {
		Integer ziId = getSqlSession().selectOne("com.tly.dao.IEquipmentSublistDao.selectZiIdByEquipmentnumber", equipmentnumber);
		return ziId;
	}

	/**
	 * 查询没有合伙人的产品
	 * yangweihang
	 * @Date 2018年9月1日 下午6:21:29
	 * @return
	 */
	@Override
	public List<EquipmentSublist> selectbynotp() {
		return getSqlSession().selectList("com.tly.dao.IEquipmentSublistDao.selectbynotp", null);
	}

}
