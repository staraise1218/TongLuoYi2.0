package com.tly.service;

import java.util.List;
import java.util.Map;

import com.tly.model.EquipmentInoutstorage;
import com.tly.model.EquipmentSublist;

/**
 * 设备子表
 * @ClassName IEquipmentSublistService
 * @Author yangweihang
 * @Date 2018年8月25日 上午9:22:19
 */
public interface IEquipmentSublistService {
	
	/**
	 * 新增产品
	 * yangweihang
	 * @Date 2018年8月25日 上午11:03:04
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
	 * 查询没有合伙人的产品
	 * yangweihang
	 * @Date 2018年9月1日 下午6:21:04
	 * @return
	 */
	List<EquipmentSublist> selectbynotp();
	
}
