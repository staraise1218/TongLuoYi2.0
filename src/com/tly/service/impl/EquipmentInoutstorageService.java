package com.tly.service.impl;

import java.util.List;
import java.util.Map;

import com.tly.dao.IEquipmentInoutstorageDao;
import com.tly.model.EquipmentInoutstorage;
import com.tly.service.IEquipmentInoutstorageService;

/**
 * 设备出入明细
 * @ClassName EquipmentInoutstorageService
 * @Author yangweihang
 * @Date 2018年8月25日 上午11:35:57
 */
public class EquipmentInoutstorageService implements IEquipmentInoutstorageService  {

	private IEquipmentInoutstorageDao ieidao;
	
	public IEquipmentInoutstorageDao getIeidao() {
		return ieidao;
	}

	public void setIeidao(IEquipmentInoutstorageDao ieidao) {
		this.ieidao = ieidao;
	}

	/**
	 * 新增设备出入库明细
	 * yangweihang
	 * @Date 2018年8月25日 上午11:36:43
	 * @param ei
	 * @return
	 */
	@Override
	public int insertei(EquipmentInoutstorage ei) {
		return ieidao.insertei(ei);
	}

	/**
	 * 按条件查询
	 * yangweihang
	 * @Date 2018年8月25日 下午8:06:24
	 * @param map
	 * @return
	 */
	@Override
	public List<Map<String,Object>> selectByEi(Map<String, Object> map) {
		return ieidao.selectByEi(map);
	}

}
