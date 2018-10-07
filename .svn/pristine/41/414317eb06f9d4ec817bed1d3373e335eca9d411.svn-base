package com.tly.service;

import java.util.List;
import java.util.Map;

import com.tly.model.Equipment;
import com.tly.model.EquipmentApply;

/**
 * 设备
 * @ClassName IEquipmentService
 * @Author yangweihang
 * @Date 2018年8月24日 上午11:34:12
 */
public interface IEquipmentService {
	
	/**
	 * 新增
	 * yangweihang
	 * @Date 2018年8月24日 上午11:34:51
	 * @param e
	 * @return
	 */
	public int insert(Equipment e);
	
	/**
	 * 按设备型号查询
	 * yangweihang
	 * @Date 2018年8月24日 下午4:35:57
	 * @param map
	 * @return
	 */
	public Equipment selectByCondition(Map<String,Object> map);
	
	/**
	 * 查询设备名称
	 * yangweihang
	 * @Date 2018年8月25日 上午9:23:04
	 * @return
	 */
	public List<String> selectEByName();
	
	/**
	 * 按设备名称查询
	 * yangweihang
	 * @Date 2018年8月25日 上午10:02:15
	 * @param map
	 * @return
	 */
	public List<Equipment> selectEByType(Map<String,Object> map);
	
	/**
	 * 根据设备码查询该设备状态
	 * @param Equipmentnumber
	 * @return 设备状态
	 */
	Integer selectStateByEquipmentnumber(String Equipmentnumber);
	
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
     * 根据设备的编号，查询该设备扫码需要付多少钱
     * @param equipmentnumber 设备编号
     * @return 该台设备需要付多少钱
     */
    Double selectMoneyByEquipmentnumber(String equipmentnumber);

    /**
     * 根据设备编号查询该设备在设备子表id
     * @param equipmentnumber 设备编号
     * @return 设备子表id
     */
    Integer selectZiIdByEquipmentnumber(String equipmentnumber);
    
    /**
	 * 按设备编号查询
	 * yangweihang
	 * @Date 2018年8月28日 下午5:10:09
	 * @param number
	 * @return
	 */
	Equipment selectByNumber(String number);

    /**
     * 插入一条设备申请
     * @param ea 申请对象
     * @return 是否录入成功
     */
    Integer insertOneApple(EquipmentApply ea);

	public List selectList(String type);
}
