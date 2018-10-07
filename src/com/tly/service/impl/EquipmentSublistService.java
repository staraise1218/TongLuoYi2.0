package com.tly.service.impl;

import java.util.List;
import java.util.Map;

import com.tly.dao.IEquipmentSublistDao;
import com.tly.model.EquipmentSublist;
import com.tly.service.IEquipmentSublistService;

/**
 * 设备子表
 * @ClassName EquipmentSublistService
 * @Author yangweihang
 * @Date 2018年8月25日 上午9:23:48
 */
public class EquipmentSublistService implements IEquipmentSublistService {

	private IEquipmentSublistDao iesdao;
	
	public IEquipmentSublistDao getIesdao() {
		return iesdao;
	}

	public void setIesdao(IEquipmentSublistDao iesdao) {
		this.iesdao = iesdao;
	}

	/**
	 * 新增产品
	 * yangweihang
	 * @Date 2018年8月25日 上午11:03:22
	 * @param es
	 * @return
	 */
	@Override
	public int insertes(EquipmentSublist es) {
		return iesdao.insertes(es);
	}

	/**
	 * 查询设备编号
	 * yangweihang
	 * @Date 2018年8月25日 上午11:16:09
	 * @param map
	 * @return
	 */
	@Override
	public EquipmentSublist selectByNumber(Map<String, Object> map) {
		return iesdao.selectByNumber(map);
	}

	/**
	 * 查询产品管理
	 * yangweihang
	 * @Date 2018年8月25日 下午5:24:12
	 * @param map
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByProduct(Map<String, Object> map) {
		return iesdao.selectByProduct(map);
	}

	/**
	 * 修改产品
	 * yangweihang
	 * @Date 2018年8月25日 下午7:22:04
	 * @param es
	 * @return
	 */
	@Override
	public int updatepro(EquipmentSublist es) {
		return iesdao.updatepro(es);
	}

	/**
	 * 批量删除产品
	 * yangweihang
	 * @Date 2018年8月26日 下午12:54:11
	 * @param arr
	 * @return
	 */
	@Override
	public int deletepro(Integer[] arr) {
		return iesdao.deletepro(arr);
	}

	/**
	 * 查询没有合伙人的设备
	 * yangweihang
	 * @Date 2018年9月1日 下午6:22:45
	 * @return
	 */
	@Override
	public List<EquipmentSublist> selectbynotp() {
		return iesdao.selectbynotp();
	}

}
