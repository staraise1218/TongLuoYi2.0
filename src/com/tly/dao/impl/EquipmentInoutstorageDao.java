package com.tly.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IEquipmentInoutstorageDao;
import com.tly.model.EquipmentInoutstorage;

/**
 * 新增设备出入库明细
 * @ClassName EquipmentInoutstorageDao
 * @Author yangweihang
 * @Date 2018年8月25日 上午11:32:34
 */
public class EquipmentInoutstorageDao extends SqlSessionDaoSupport implements IEquipmentInoutstorageDao {

	/**
	 * 新增设备出入库明细
	 * yangweihang
	 * @Date 2018年8月25日 上午11:33:27
	 * @param ei
	 * @return
	 */
	@Override
	public int insertei(EquipmentInoutstorage ei) {
		return getSqlSession().insert("com.tly.dao.IEquipmentInoutstorageDao.insertei", ei);
	}

	/**
	 * 按条件查询
	 * yangweihang
	 * @Date 2018年8月25日 下午8:03:57
	 * @param map
	 * @return
	 */
	@Override
	public List<Map<String,Object>> selectByEi(Map<String, Object> map) {
		return getSqlSession().selectList("com.tly.dao.IEquipmentInoutstorageDao.selectByEi", map);
	}
}
