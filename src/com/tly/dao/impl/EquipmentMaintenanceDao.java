package com.tly.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IEquipmentMaintenanceDao;
import com.tly.model.EquipmentMaintenance;

/**
 * 故障设备维修明细
 * @ClassName EquipmentMaintenanceDao
 * @Author yangweihang
 * @Date 2018年8月26日 下午11:48:19
 */
public class EquipmentMaintenanceDao extends SqlSessionDaoSupport implements IEquipmentMaintenanceDao {

	/**
	 * 查询维修明细
	 * yangweihang
	 * @Date 2018年8月26日 下午11:49:06
	 * @param pid
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByEm() {
		return getSqlSession().selectList("com.tly.dao.IEquipmentMaintenanceDao.selectByEm", null);
	}

	/**
	 * 查询没有处理的维修工单
	 * yangweihang
	 * @Date 2018年8月28日 下午8:41:18
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByNotWid() {
		return getSqlSession().selectList("com.tly.dao.IEquipmentMaintenanceDao.selectByNotWid", null);
	}

	/**
	 * 接单
	 * yangweihang
	 * @Date 2018年8月28日 下午8:56:59
	 * @param em
	 * @return
	 */
	@Override
	public int updatewid(EquipmentMaintenance em) {
		return getSqlSession().update("com.tly.dao.IEquipmentMaintenanceDao.updatewid", em);
	}

	/**
	 * 修改维修结果
	 * yangweihang
	 * @Date 2018年8月28日 下午9:07:34
	 * @param em
	 * @return
	 */
	@Override
	public int updateresult(EquipmentMaintenance em) {
		return getSqlSession().update("com.tly.dao.IEquipmentMaintenanceDao.updateresult", em);
	}

	/**
	 * 按工程师id查询维修明细
	 * yangweihang
	 * @Date 2018年8月28日 下午9:23:09
	 * @param wid
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectBywid(int wid) {
		return getSqlSession().selectList("com.tly.dao.IEquipmentMaintenanceDao.selectBywid", wid);
	}

	/**
	 * 查询故障维修明细未读
	 * yangweihang
	 * @Date 2018年8月29日 下午1:15:27
	 * @param wid
	 * @return
	 */
	@Override
	public int selectByNotLook(int wid) {
		return getSqlSession().selectOne("com.tly.dao.IEquipmentMaintenanceDao.selectByNotLook", wid);
	}

	/**
	 * 修改维修明细为已读
	 * yangweihang
	 * @Date 2018年8月29日 下午1:15:47
	 * @param wid
	 * @return
	 */
	@Override
	public int updatelook(int wid) {
		return getSqlSession().update("com.tly.dao.IEquipmentMaintenanceDao.updatelook", wid);
	}

	/**
	 * 查询共享数据的未读数量
	 * yangweihang
	 * @Date 2018年8月29日 下午2:26:16
	 * @param wid
	 * @return
	 */
	@Override
	public int selectByGxNotLook(int wid) {
		return getSqlSession().selectOne("com.tly.dao.IEquipmentMaintenanceDao.selectByGxNotLook", wid);
	}

	/**
	 * 查询共享的未读数据
	 * yangweihang
	 * @Date 2018年8月29日 下午2:45:19
	 * @param wid
	 * @return
	 */
	@Override
	public List<EquipmentMaintenance> selectByGxNotLookByEm(int wid) {
		return getSqlSession().selectList("com.tly.dao.IEquipmentMaintenanceDao.selectByGxNotLookByEm", wid);
	}

	/**
	 * 申报故障
	 * yangweihang
	 * @Date 2018年8月31日 上午9:40:31
	 * @param em
	 * @return
	 */
	@Override
	public int insertByEm(EquipmentMaintenance em) {
		return getSqlSession().insert("com.tly.dao.IEquipmentMaintenanceDao.insertByEm", em);
	}
}
