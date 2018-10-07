package com.tly.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;
import org.junit.runners.Parameterized.Parameters;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IEquipmentDao;
import com.tly.model.Equipment;


/**
 * 设备
 * @ClassName EquipmentDao
 * @Author yangweihang
 * @Date 2018年8月24日 上午11:21:47
 */
public class EquipmentDao extends SqlSessionDaoSupport implements IEquipmentDao {

	
	/**
	 * 新增
	 * yangweihang
	 * @Date 2018年8月24日 上午11:22:09
	 * @param e
	 * @return
	 */
	@Override
	public int insert(Equipment e) {
		return getSqlSession().insert("com.tly.dao.IEquipmentDao.insert", e);
	}
	
	/**
	 * 按设备型号查询
	 * yangweihang
	 * @Date 2018年8月24日 下午4:36:35
	 * @param map
	 * @return
	 */
	@Override
	public Equipment selectByCondition(Map<String,Object> map) {
		return getSqlSession().selectOne("com.tly.dao.IEquipmentDao.selectByCondition", map);
	}
	
	/**
	 * 查询设备名称
	 * yangweihang
	 * @Date 2018年8月25日 上午9:19:17
	 * @return
	 */
	@Override
	public List<String> selectEByName() {
		return getSqlSession().selectList("com.tly.dao.IEquipmentDao.selectEByName", null);
	}
	
	/**
	 * 按名称查询设备编号
	 * yangweihang
	 * @Date 2018年8月25日 上午10:00:33
	 * @param map
	 * @return
	 */
	@Override
	public List<Equipment> selectEByType(Map<String, Object> map) {
		return getSqlSession().selectList("com.tly.dao.IEquipmentDao.selectByCondition", map);
	}
	
	/**
	 * 查询库存设备
	 * yangweihang
	 * @Date 2018年8月25日 下午3:01:57
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByEquipment() {
		return getSqlSession().selectList("com.tly.dao.IEquipmentDao.selectByEquipment", null);
	}

	/**
	 * 按id查询
	 * yangweihang
	 * @Date 2018年8月25日 下午3:29:54
	 * @param id
	 * @return
	 */
	@Override
	public Equipment selectOne(int id) {
		return getSqlSession().selectOne("com.tly.dao.IEquipmentDao.selectOne", id);
	}

	/**
	 * 修改设备
	 * yangweihang
	 * @Date 2018年8月25日 下午4:27:55
	 * @param e
	 * @return
	 */
	@Override
	public int update(Equipment e) {
		return getSqlSession().update("com.tly.dao.IEquipmentDao.update", e);
	}

	/**
	 * 按设备编号查询
	 * yangweihang
	 * @Date 2018年8月28日 下午5:10:41
	 * @param number
	 * @return
	 */
	@Override
	public Equipment selectByNumber(String number) {
		return getSqlSession().selectOne("com.tly.dao.IEquipmentDao.selectByNumber", number);
	}

	@Override
	public List selectList(String type) {
		return getSqlSession().selectList("com.tly.dao.IEquipmentDao.selectList",type);
	}

}
