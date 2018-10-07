package com.tly.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IAdministratorDao;
import com.tly.model.Administrator;

/**
 * 查询店铺管理员
 * @ClassName AdministratorDao
 * @Author yangweihang
 * @Date 2018年8月26日 下午7:06:09
 */
public class AdministratorDao extends SqlSessionDaoSupport implements IAdministratorDao {

	/**
	 * 查询店铺管理员
	 * yangweihang
	 * @Date 2018年8月26日 下午7:06:54
	 * @param pid
	 * @return
	 */
	@Override
	public List<Administrator> selectByA(int pid) {
		return getSqlSession().selectList("com.tly.dao.IAdministratorDao.selectByA", pid);
	}
	
	/**
	 * 添加管理员
	 * yangweihang
	 * @Date 2018年9月1日 上午9:07:11
	 * @param a
	 * @return
	 */
	public int inserta(Administrator a){
		return getSqlSession().insert("com.tly.dao.IAdministratorDao.inserta", a);
	}
	
	/**
	 * 修改角色
	 * yangweihang
	 * @Date 2018年9月1日 上午9:34:38
	 * @param a
	 * @return
	 */
	public int updatetype(Administrator a){
		return getSqlSession().update("com.tly.dao.IAdministratorDao.updatetype", a);
	}
	
	/**
	 * 删除管理员
	 * yangweihang
	 * @Date 2018年9月1日 上午9:39:56
	 * @param id
	 * @return
	 */
	public int deletea(int id){
		return getSqlSession().delete("com.tly.dao.IAdministratorDao.deletea", id);
	}
	
	/**
	 * 按合伙人微信id查询店铺管理员
	 * yangweihang
	 * @Date 2018年9月1日 上午9:46:40
	 * @param wxid
	 * @return
	 */
	public List<Administrator> selectpwxidbya(String wxid){
		return getSqlSession().selectList("com.tly.dao.IAdministratorDao.selectpwxidbya", wxid);
	}
	
	/**
	 * 按微信id查询
	 * yangweihang
	 * @Date 2018年9月1日 下午2:48:37
	 * @param wxid
	 * @return
	 */
	public Administrator selectonebywxid(int id) {
		return getSqlSession().selectOne("com.tly.dao.IAdministratorDao.selectonebywxid", id);
	}
}
