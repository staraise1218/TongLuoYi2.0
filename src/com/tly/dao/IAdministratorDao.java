package com.tly.dao;

import java.util.List;

import com.tly.model.Administrator;

/**
 * 店铺管理员
 * @ClassName IAdministratorDao
 * @Author yangweihang
 * @Date 2018年8月26日 下午7:04:03
 */
public interface IAdministratorDao {
	
	/**
	 * 查询店铺管理员
	 * yangweihang
	 * @Date 2018年8月26日 下午7:05:40
	 * @param pid
	 * @return
	 */
	List<Administrator> selectByA(int pid);
	
	/**
	 * 添加管理员
	 * yangweihang
	 * @Date 2018年9月1日 上午9:07:11
	 * @param a
	 * @return
	 */
	int inserta(Administrator a);
	
	/**
	 * 修改角色
	 * yangweihang
	 * @Date 2018年9月1日 上午9:34:38
	 * @param a
	 * @return
	 */
	int updatetype(Administrator a);
	
	/**
	 * 删除管理员
	 * yangweihang
	 * @Date 2018年9月1日 上午9:39:56
	 * @param id
	 * @return
	 */
	int deletea(int id);
	
	/**
	 * 按合伙人微信id查询店铺管理员
	 * yangweihang
	 * @Date 2018年9月1日 上午9:46:40
	 * @param wxid
	 * @return
	 */
	List<Administrator> selectpwxidbya(String wxid);
	
	/**
	 * 按微信id查询
	 * yangweihang
	 * @Date 2018年9月1日 下午2:48:37
	 * @param wxid
	 * @return
	 */
	Administrator selectonebywxid(int id);
	
}
