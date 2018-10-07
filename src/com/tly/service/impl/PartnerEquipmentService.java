package com.tly.service.impl;

import java.util.List;
import java.util.Map;

import com.tly.dao.IPartnerEquipmentDao;
import com.tly.model.PartnerEquipment;
import com.tly.service.IPartnerEquipmentService;

/**
 * 查询合伙人设备
 * @ClassName PartnerEquipmentService
 * @Author yangweihang
 * @Date 2018年8月26日 下午6:19:13
 */
public class PartnerEquipmentService implements IPartnerEquipmentService {

	private IPartnerEquipmentDao ipedao;
	
	public IPartnerEquipmentDao getIpedao() {
		return ipedao;
	}


	public void setIpedao(IPartnerEquipmentDao ipedao) {
		this.ipedao = ipedao;
	}


	/**
	 * 查询合伙人设备
	 * yangweihang
	 * @Date 2018年8月26日 下午6:19:54
	 * @param pid
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByPe(int pid) {
		return ipedao.selectByPe(pid);
	}


	/**
	 * 按设备编号查询
	 * yangweihang
	 * @Date 2018年8月28日 下午4:52:55
	 * @param number
	 * @return
	 */
	@Override
	public PartnerEquipment selectByNumber(String number) {
		return ipedao.selectByNumber(number);
	}

	/**
	 * 按店铺管理员微信id查询设备
	 * yangweihang
	 * @Date 2018年8月29日 下午6:13:57
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectwxidByEs(Map<String,Object> map) {
		return ipedao.selectwxidByEs(map);
	}
	
	/**
	 * 按合伙人微信id查询设备
	 * yangweihang
	 * @Date 2018年8月29日 下午6:13:57
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectpwxidByEs(Map<String,Object> map) {
		return ipedao.selectpwxidByEs(map);
	}

	/**
	 * 修改名称
	 * @param pe
	 * @return
	 */
	@Override
	public int updatebyname(PartnerEquipment pe) {
		return ipedao.updatebyname(pe);
	}

	/**
	 * 按合伙人微信id查询已经修改过价格的设备
	 * yangweihang
	 * @Date 2018年8月31日 下午2:51:42
	 * @param pe
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByMoney(String wxid) {
		return ipedao.selectByMoney(wxid);
	}

	/**
	 * 修改为已读
	 * yangweihang
	 * @Date 2018年8月31日 下午3:05:48
	 * @param wxid
	 * @return
	 */
	@Override
	public int updatelookByYd(String wxid) {
		return ipedao.updatelookByYd(wxid);
	}

	/**
	 * 按合伙人微信id查询已经修改过价格的设备未读数量
	 * yangweihang
	 * @Date 2018年8月31日 下午3:15:24
	 * @param wxid
	 * @return
	 */
	@Override
	public int selectbylookcount(String wxid) {
		return ipedao.selectbylookcount(wxid);
	}

	/**
	 * 修改设备价格
	 * yangweihang
	 * @Date 2018年8月31日 下午3:39:34
	 * @param pe
	 * @return
	 */
	@Override
	public int updatesmoney(PartnerEquipment pe) {
		return ipedao.updatesmoney(pe);
	}


	/**
	 * 修改为未读
	 * yangweihang
	 * @Date 2018年8月31日 下午3:47:05
	 * @param eid
	 * @return
	 */
	@Override
	public int updatelookbywd(int eid) {
		return ipedao.updatelookbywd(eid);
	}


	/**
	 * 新增设备合伙人关联
	 * yangweihang
	 * @Date 2018年9月1日 下午5:45:21
	 * @param pe
	 * @return
	 */
	@Override
	public int insert(PartnerEquipment pe) {
		return ipedao.insert(pe);
	}
}
