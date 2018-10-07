package com.tly.service.impl;

import java.util.List;
import java.util.Map;

import com.tly.dao.IEquipmentApplyDao;
import com.tly.dao.IEquipmentDao;
import com.tly.dao.IEquipmentSublistDao;
import com.tly.model.Equipment;
import com.tly.model.EquipmentApply;
import com.tly.service.IEquipmentService;

/**
 * 设备
 * @ClassName EquipmentService
 * @Author yangweihang
 * @Date 2018年8月24日 上午11:35:19
 */
public class EquipmentService implements IEquipmentService {

	private IEquipmentDao iedao;
	private IEquipmentSublistDao iesdao;//设备子表
	private IEquipmentApplyDao ieadao;//设备申请dao
	
	public IEquipmentApplyDao getIeadao() {
		return ieadao;
	}

	public void setIeadao(IEquipmentApplyDao ieadao) {
		this.ieadao = ieadao;
	}

	public IEquipmentDao getIedao() {
		return iedao;
	}
	
	public void setIedao(IEquipmentDao iedao) {
		this.iedao = iedao;
	}
	public IEquipmentSublistDao getIesdao() {
		return iesdao;
	}

	public void setIesdao(IEquipmentSublistDao iesdao) {
		this.iesdao = iesdao;
	}
	
	/**
	 * 新增设备
	 * yangweihang
	 * @Date 2018年8月24日 上午11:35:54
	 * @param e
	 * @return
	 */
	@Override
	public int insert(Equipment e) {
		return iedao.insert(e);
	}

	/**
	 * 按设备型号查询
	 * yangweihang
	 * @Date 2018年8月24日 下午4:41:47
	 * @param map
	 * @return
	 */
	@Override
	public Equipment selectByCondition(Map<String,Object> map) {
		return iedao.selectByCondition(map);
	}
	
	/**
	 * 查询设备名称
	 * yangweihang
	 * @Date 2018年8月25日 上午9:24:26
	 * @return
	 */
	@Override
	public List<String> selectEByName() {
		return iedao.selectEByName();
	}

	/**
	 * 按设备名称查询
	 * yangweihang
	 * @Date 2018年8月25日 上午10:02:48
	 * @param map
	 * @return
	 */
	@Override
	public List<Equipment> selectEByType(Map<String, Object> map) {
		return iedao.selectEByType(map);
	}


	@Override
	public Integer selectStateByEquipmentnumber(String Equipmentnumber) {
		// TODO Auto-generated method stub

		Integer state = iesdao.selectStateByEquipmentnumber(Equipmentnumber);
		return state;
	}

	/**
	 * 查询库存设备
	 * yangweihang
	 * @Date 2018年8月25日 下午3:03:49
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByEquipment() {
		return iedao.selectByEquipment();
	}

	/**
	 * 按id查询
	 * yangweihang
	 * @Date 2018年8月25日 下午3:31:42
	 * @param id
	 * @return
	 */
	@Override
	public Equipment selectOne(int id) {
		return iedao.selectOne(id);
	}

	/**
	 * 修改设备
	 * yangweihang
	 * @Date 2018年8月25日 下午4:32:21
	 * @param e
	 * @return
	 */
	@Override
	public int update(Equipment e) {
		return iedao.update(e);
	}

	@Override
	public Double selectMoneyByEquipmentnumber(String equipmentnumber) {
		Double money = iesdao.selectMoneyByEquipmentnumber(equipmentnumber);
		return money;
	}

	@Override
	public Integer selectZiIdByEquipmentnumber(String equipmentnumber) {
		Integer ziId = iesdao.selectZiIdByEquipmentnumber(equipmentnumber);
		return ziId;
	}

	/**
	 * 按设备编号查询
	 * yangweihang
	 * @Date 2018年8月28日 下午5:13:04
	 * @param number
	 * @return
	 */
	@Override
	public Equipment selectByNumber(String number) {
		return iedao.selectByNumber(number);
	}

	@Override
	public Integer insertOneApple(EquipmentApply ea) {
		// TODO Auto-generated method stub
		Integer suc = ieadao.insertOneApple(ea);
		return suc;
	}

	@Override
	public List selectList(String type) {
		List list = iedao.selectList(type);
		return list;
	}
}
