package com.tly.service.impl;

import java.util.List;
import java.util.Map;

import com.tly.dao.IEquipmentMaintenanceDao;
import com.tly.model.EquipmentMaintenance;
import com.tly.service.IEquipmentMaintenanceService;

/**
 * 故障设备维修明细
 * @ClassName EquipmentMaintenanceService
 * @Author yangweihang
 * @Date 2018年8月26日 下午11:57:26
 */
public class EquipmentMaintenanceService implements IEquipmentMaintenanceService {

	private IEquipmentMaintenanceDao iemdao;
	
	public IEquipmentMaintenanceDao getIemdao() {
		return iemdao;
	}

	public void setIemdao(IEquipmentMaintenanceDao iemdao) {
		this.iemdao = iemdao;
	}


	/**
	 * 查询维修明细
	 * yangweihang
	 * @Date 2018年8月26日 下午11:58:00
	 * @param pid
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByEm() {
		return iemdao.selectByEm();
	}

	/**
	 * 查询没有处理的维修工单
	 * yangweihang
	 * @Date 2018年8月28日 下午8:42:38
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByNotWid() {
		return iemdao.selectByNotWid();
	}

	/**
	 * 接单
	 * yangweihang
	 * @Date 2018年8月28日 下午8:58:36
	 * @param em
	 * @return
	 */
	@Override
	public int updatewid(EquipmentMaintenance em) {
		return iemdao.updatewid(em);
	}

	/**
	 * 修改维修结果
	 * yangweihang
	 * @Date 2018年8月28日 下午9:09:08
	 * @param em
	 * @return
	 */
	@Override
	public int updateresult(EquipmentMaintenance em) {
		return iemdao.updateresult(em);
	}

	/**
	 * 按工程师id查询维修明细
	 * yangweihang
	 * @Date 2018年8月28日 下午9:23:54
	 * @param wid
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectBywid(int wid) {
		return iemdao.selectBywid(wid);
	}

	/**
	 * 查询故障维修明细未读
	 * yangweihang
	 * @Date 2018年8月29日 下午1:23:38
	 * @param wid
	 * @return
	 */
	@Override
	public int selectByNotLook(int wid) {
		return iemdao.selectByNotLook(wid);
	}

	/**
	 * 修改维修明细为已读
	 * yangweihang
	 * @Date 2018年8月29日 下午1:24:23
	 * @param wid
	 * @return
	 */
	@Override
	public int updatelook(int wid) {
		return iemdao.updatelook(wid);
	}

	/**
	 * 查询共享数据的未读数量
	 * yangweihang
	 * @Date 2018年8月29日 下午2:27:31
	 * @param wid
	 * @return
	 */
	@Override
	public int selectByGxNotLook(int wid) {
		return iemdao.selectByGxNotLook(wid);
	}

	/**
	 * 查询共享的未读数据
	 * yangweihang
	 * @Date 2018年8月29日 下午2:46:39
	 * @param wid
	 * @return
	 */
	@Override
	public List<EquipmentMaintenance> selectByGxNotLookByEm(int wid) {
		return iemdao.selectByGxNotLookByEm(wid);
	}

	/**
	 * 申报故障
	 * yangweihang
	 * @Date 2018年8月31日 上午11:39:44
	 * @param em
	 * @return
	 */
	@Override
	public int insertByEm(EquipmentMaintenance em) {
		return iemdao.insertByEm(em);
	}

}
