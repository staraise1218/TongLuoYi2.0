package com.tly.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IEquipmentApplyDao;
import com.tly.model.EquipmentApply;

/**
 * @author moxiuichuan
 * 设备申请dao实现类
 * 10点18分
 */
public class EquipmentApplyDao extends SqlSessionDaoSupport implements IEquipmentApplyDao{

	@Override
	public Integer insertOneApple(EquipmentApply ea) {
		// TODO Auto-generated method stub
		Integer suc = getSqlSession().insert("com.tly.dao.IEquipmentApplyDao.insertOneApple", ea);
		return suc;
	}
	
}
