package com.tly.dao;

import java.util.List;
import java.util.Map;

import com.tly.model.Equipment;


/**
 * 设备
 * @ClassName IEquipmentDao
 * @Author yangweihang
 * @Date 2018年8月24日 上午11:22:31
 */
public interface IEquipmentDao {
	/**
	 * 新增
	 * yangweihang
	 * @Date 2018年8月24日 上午11:22:42
	 * @param e
	 * @return
	 */
	int insert(Equipment e);
	
	/**
	 * 按设备型号查询
	 * yangweihang
	 * @Date 2018年8月24日 下午4:35:57
	 * @param map
	 * @return
	 */
	Equipment selectByCondition(Map<String,Object> map);
	
	/**
	 * 查询设备名称
	 * yangweihang
	 * @Date 2018年8月25日 上午9:17:30
	 * @return
	 */
	List<String> selectEByName();
	
	/**
	 * 按设备名称查询
	 * yangweihang
	 * @Date 2018年8月25日 上午9:59:57
	 * @param map
	 * @return
	 */
	List<Equipment> selectEByType(Map<String,Object> map);
	
	/**
	 * 查询库存设备
	 * yangweihang
	 * @Date 2018年8月25日 下午3:01:25
	 * @return
	 */
	List<Map<String,Object>> selectByEquipment();
	
	/**
	 * 按id查询
	 * yangweihang
	 * @Date 2018年8月25日 下午3:29:34
	 * @param id
	 * @return
	 */
	Equipment selectOne(int id);
	
	/**
	 * 修改设备
	 * yangweihang
	 * @Date 2018年8月25日 下午4:27:37
	 * @param e
	 * @return
	 */
	int update(Equipment e);
	
	/**
	 * 按设备编号查询
	 * yangweihang
	 * @Date 2018年8月28日 下午5:10:09
	 * @param number
	 * @return
	 */
	Equipment selectByNumber(String number);

	/**
	 * @param type 
	 * @return
	 */
	List selectList(String type);
	
}
