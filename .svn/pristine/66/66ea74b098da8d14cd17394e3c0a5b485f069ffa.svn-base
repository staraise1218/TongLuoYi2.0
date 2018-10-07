package com.tly.dao;

import java.util.List;
import java.util.Map;

import com.tly.model.PartnerEquipment;

/**
 * 合伙人设备对应
 * @ClassName IPartnerEquipmentDao
 * @Author yangweihang
 * @Date 2018年8月26日 下午6:09:19
 */
public interface IPartnerEquipmentDao {
	
	/**
	 * 查询合伙人设备
	 * yangweihang
	 * @Date 2018年8月26日 下午6:17:31
	 * @param pid
	 * @return
	 */
	List<Map<String,Object>> selectByPe(int pid);

	/**
	 * 查询该设备是租用的还是购买的
	 * @param equipmentnumber 设备编号 
	 * @return 1：设备租用 2。设备购买
	 */
	Integer selectEquipmentForm(String equipmentnumber);

	/**
	 * 根据设备子表id查询设备的扫码价格
	 * @param eid 设备子表id
	 * @return 扫码价格
	 */
	Double selectSmoneyByEid(Integer eid);
	
	/**
	 * 按设备编号查询
	 * yangweihang
	 * @Date 2018年8月28日 下午4:50:15
	 * @param number
	 * @return
	 */
	PartnerEquipment selectByNumber(String number);
	
	/**
	 * 按店铺管理员微信id查询设备
	 * yangweihang
	 * @Date 2018年8月29日 下午6:12:29
	 * @param wxid
	 * @return
	 */
	List<Map<String,Object>> selectwxidByEs(Map<String,Object> map);
	
	/**
	 * 按合伙人微信id查询设备
	 * yangweihang
	 * @Date 2018年8月29日 下午6:12:29
	 * @param wxid
	 * @return
	 */
	List<Map<String,Object>> selectpwxidByEs(Map<String,Object> map);
	
	/**
	 * 修改名称
	 * yangweihang
	 * @Date 2018年8月31日 下午2:50:32
	 * @param pe
	 * @return
	 */
	int updatebyname(PartnerEquipment pe);
	
	/**
	 * 按合伙人微信id查询已经修改过价格的设备
	 * yangweihang
	 * @Date 2018年8月31日 下午2:49:19
	 * @param pe
	 * @return
	 */
	List<Map<String,Object>> selectByMoney(String wxid);
	
	/**
	 * 修改为已读
	 * yangweihang
	 * @Date 2018年8月31日 下午3:04:30
	 * @param wxid
	 * @return
	 */
	int updatelookByYd(String wxid);
	
	/**
	 * 按合伙人微信id查询已经修改过价格的设备未读数量
	 * yangweihang
	 * @Date 2018年8月31日 下午3:14:03
	 * @param wxid
	 * @return
	 */
	int selectbylookcount(String wxid);
	
	/**
	 * 修改设备价格
	 * yangweihang
	 * @Date 2018年8月31日 下午3:37:50
	 * @param pe
	 * @return
	 */
	int updatesmoney(PartnerEquipment pe);
	
	/**
	 * 修改为未读
	 * yangweihang
	 * @Date 2018年8月31日 下午3:45:44
	 * @param eid
	 * @return
	 */
	int updatelookbywd(int eid);
	
	/**
	 * 新增设备合伙人关联
	 * yangweihang
	 * @Date 2018年9月1日 下午5:43:33
	 * @param pe
	 * @return
	 */
	int insert(PartnerEquipment pe);
}
