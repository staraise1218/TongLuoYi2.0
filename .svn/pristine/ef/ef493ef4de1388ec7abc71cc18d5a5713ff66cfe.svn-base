package com.tly.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IPartnerEquipmentDao;
import com.tly.model.PartnerEquipment;

/**
 * 合伙人设备对应
 * @ClassName PartnerEquipmentDao
 * @Author yangweihang
 * @Date 2018年8月26日 下午6:11:07
 */
public class PartnerEquipmentDao extends SqlSessionDaoSupport implements IPartnerEquipmentDao {

	/**
	 * 查询合伙人设备
	 * yangweihang
	 * @Date 2018年8月26日 下午6:11:43
	 * @param pid
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByPe(int pid) {
		return getSqlSession().selectList("com.tly.dao.IPartnerEquipmentDao.selectByPe", pid);
	}

	@Override
	public Integer selectEquipmentForm(String equipmentnumber) {
		Integer form = getSqlSession().selectOne("com.tly.dao.IPartnerEquipmentDao.selectEquipmentForm", equipmentnumber);
		return form;
	}

	/**
	 * 按设备编号查询
	 * yangweihang
	 * @Date 2018年8月28日 下午4:50:34
	 * @param number
	 * @return
	 */
	@Override
	public PartnerEquipment selectByNumber(String number) {
		return getSqlSession().selectOne("com.tly.dao.IPartnerEquipmentDao.selectByNumber", number);
	}

	@Override
	public Double selectSmoneyByEid(Integer eid) {
		Double smoney = getSqlSession().selectOne("com.tly.dao.IPartnerEquipmentDao.selectSmoneyByEid", eid);
		return smoney;
	}

	/**
	 * 按店铺管理员微信id查询设备
	 * yangweihang
	 * @Date 2018年8月29日 下午6:12:49
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectwxidByEs(Map<String, Object> map) {
		return getSqlSession().selectList("com.tly.dao.IPartnerEquipmentDao.selectwxidByEs", map);
	}
	
	/**
	 * 按合伙人微信id查询设备
	 * yangweihang
	 * @Date 2018年8月29日 下午6:12:49
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectpwxidByEs(Map<String, Object> map) {
		return getSqlSession().selectList("com.tly.dao.IPartnerEquipmentDao.selectpwxidByEs", map);
	}

	
	/**
	 * 修改名称
	 * yangweihang
	 * @Date 2018年8月31日 下午2:50:16
	 * @param pe
	 * @return
	 */
	@Override
	public int updatebyname(PartnerEquipment pe) {
		return getSqlSession().update("com.tly.dao.IPartnerEquipmentDao.updatebyname", pe);
	}

	/**
	 * 按合伙人微信id查询已经修改过价格的设备
	 * yangweihang
	 * @Date 2018年8月31日 下午2:55:22
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByMoney(String wxid) {
		return getSqlSession().selectList("com.tly.dao.IPartnerEquipmentDao.selectByMoney", wxid);
	}

	/**
	 * 修改为已读
	 * yangweihang
	 * @Date 2018年8月31日 下午3:04:53
	 * @param wxid
	 * @return
	 */
	@Override
	public int updatelookByYd(String wxid) {
		return getSqlSession().update("com.tly.dao.IPartnerEquipmentDao.updatelookByYd", wxid);
	}

	/**
	 * 按合伙人微信id查询已经修改过价格的设备未读数量
	 * yangweihang
	 * @Date 2018年8月31日 下午3:14:29
	 * @param wxid
	 * @return
	 */
	@Override
	public int selectbylookcount(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.IPartnerEquipmentDao.selectbylookcount", wxid);
	}

	/**
	 * 修改设备价格
	 * yangweihang
	 * @Date 2018年8月31日 下午3:38:24
	 * @param pe
	 * @return
	 */
	@Override
	public int updatesmoney(PartnerEquipment pe) {
		return getSqlSession().update("com.tly.dao.IPartnerEquipmentDao.updatesmoney", pe);
	}

	/**
	 * 修改为未读
	 * yangweihang
	 * @Date 2018年8月31日 下午3:46:07
	 * @param eid
	 * @return
	 */
	@Override
	public int updatelookbywd(int eid) {
		return getSqlSession().update("com.tly.dao.IPartnerEquipmentDao.updatelookbywd", eid);
	}

	/**
	 * 新增设备合伙人关联
	 * yangweihang
	 * @Date 2018年9月1日 下午5:44:05
	 * @param pe
	 * @return
	 */
	@Override
	public int insert(PartnerEquipment pe) {
		return getSqlSession().update("com.tly.dao.IPartnerEquipmentDao.insert", pe);
	}

}
