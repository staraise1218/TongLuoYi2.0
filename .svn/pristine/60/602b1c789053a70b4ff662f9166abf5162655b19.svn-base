package com.tly.dao;

import java.util.List;
import java.util.Map;

import com.tly.model.EquipmentMaintenance;

/**
 * 故障设备维修明细
 * @ClassName IEquipmentMaintenanceDao
 * @Author yangweihang
 * @Date 2018年8月26日 下午11:46:45
 */
public interface IEquipmentMaintenanceDao {
	
	/**
	 * 查询维修明细
	 * yangweihang
	 * @Date 2018年8月26日 下午11:47:37
	 * @param pid
	 * @return
	 */
	List<Map<String,Object>> selectByEm();
	
	/**
	 * 查询没有处理的维修工单
	 * yangweihang
	 * @Date 2018年8月28日 下午8:39:36
	 * @return
	 */
	List<Map<String,Object>> selectByNotWid();
	
	/**
	 * 接单
	 * yangweihang
	 * @Date 2018年8月28日 下午8:56:39
	 * @param em
	 * @return
	 */
	int updatewid(EquipmentMaintenance em);
	
	/**
	 * 修改维修结果
	 * yangweihang
	 * @Date 2018年8月28日 下午9:07:13
	 * @param em
	 * @return
	 */
	int updateresult(EquipmentMaintenance em);
	
	/**
	 * 按工程师id查询维修明细
	 * yangweihang
	 * @Date 2018年8月28日 下午9:22:56
	 * @param wid
	 * @return
	 */
	List<Map<String,Object>> selectBywid(int wid);
	
	/**
	 * 查询故障维修明细未读
	 * yangweihang
	 * @Date 2018年8月29日 下午1:14:39
	 * @param wid
	 * @return
	 */
	int selectByNotLook(int wid);
	
	/**
	 * 修改维修明细为已读
	 * yangweihang
	 * @Date 2018年8月29日 下午1:15:06
	 * @param wid
	 * @return
	 */
	int updatelook(int wid);
	
	/**
	 * 查询共享数据的未读数量
	 * yangweihang
	 * @Date 2018年8月29日 下午2:25:45
	 * @param wid
	 * @return
	 */
	int selectByGxNotLook(int wid);
	
	/**
	 * 查询共享的未读数据
	 * yangweihang
	 * @Date 2018年8月29日 下午2:44:40
	 * @param wid
	 * @return
	 */
	List<EquipmentMaintenance> selectByGxNotLookByEm(int wid);
	
	/**
	 * 申报故障
	 * yangweihang
	 * @Date 2018年8月31日 上午9:40:11
	 * @param em
	 * @return
	 */
	int insertByEm(EquipmentMaintenance em);
	
}
