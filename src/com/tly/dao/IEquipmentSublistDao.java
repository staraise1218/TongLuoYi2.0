package com.tly.dao;

import java.util.List;
import java.util.Map;

import com.tly.model.EquipmentSublist;

/**
 * @author moxiuchuan
 * 设备子表dao接口
 * 15点10分
 */
public interface IEquipmentSublistDao {

	/**
	 * 根据设备码查询该台设备的状态
	 * @param equipmentnumber
	 * @return 设备状态
	 */
	Integer selectStateByEquipmentnumber(String equipmentnumber);
	
	/**
	 * 新增产品
	 * yangweihang
	 * @Date 2018年8月25日 上午11:01:07
	 * @param es
	 * @return
	 */
	int insertes(EquipmentSublist es);
	
	/**
	 * 查询设备编号
	 * yangweihang
	 * @Date 2018年8月25日 上午11:13:30
	 * @param map
	 * @return
	 */
	EquipmentSublist selectByNumber(Map<String,Object> map);

	/**
	 * 根据设备编号查查询该台设备多少钱
	 * @param equipmentnumber 设备编号
	 * @return 该台设备多少钱
	 */
	Double selectMoneyByEquipmentnumber(String equipmentnumber);
	
	/**
	 * 查询产品管理
	 * yangweihang
	 * @Date 2018年8月25日 下午5:21:06
	 * @param map
	 * @return
	 */
	List<Map<String,Object>> selectByProduct(Map<String,Object> map);
	
	/**
	 * 修改产品编码
	 * yangweihang
	 * @Date 2018年8月25日 下午7:19:58
	 * @param es
	 * @return
	 */
	int updatepro(EquipmentSublist es);
	
	/**
	 * 批量删除产品
	 * yangweihang
	 * @Date 2018年8月26日 下午12:52:14
	 * @param arr
	 * @return
	 */
	int deletepro(Integer[] arr);

	/**
	 * 根据该台设备的编号 查询他在子表的id
	 * @param equipmentnumber 该台设备编号
	 * @return 子表id
	 */
	Integer selectZiIdByEquipmentnumber(String equipmentnumber);
	
	/**
	 * 查询没有合伙人的产品
	 * yangweihang
	 * @Date 2018年9月1日 下午6:21:04
	 * @return
	 */
	List<EquipmentSublist> selectbynotp();
	
}
