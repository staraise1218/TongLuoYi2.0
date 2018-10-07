package com.tly.service.impl;

import java.util.List;

import com.tly.dao.IAdministratorDao;
import com.tly.model.Administrator;
import com.tly.service.IAdministratorService;

/**
 * 店铺管理员
 * @ClassName IAdministratorService
 * @Author yangweihang
 * @Date 2018年8月26日 下午7:12:16
 */
public class AdministratorService implements IAdministratorService {
	
	private IAdministratorDao iadao;

	public IAdministratorDao getIadao() {
		return iadao;
	}

	public void setIadao(IAdministratorDao iadao) {
		this.iadao = iadao;
	}
	
	/**
	 * 查询店铺管理员
	 * yangweihang
	 * @Date 2018年8月26日 下午7:16:05
	 * @param pid
	 * @return
	 */
	public List<Administrator> selectByA(int pid){
		return iadao.selectByA(pid);
	}
	
	/**
	 * 添加管理员
	 * yangweihang
	 * @Date 2018年9月1日 上午9:07:11
	 * @param a
	 * @return
	 */
	public int inserta(Administrator a){
		return iadao.inserta(a);
	}
	
	/**
	 * 修改角色
	 * yangweihang
	 * @Date 2018年9月1日 上午9:34:38
	 * @param a
	 * @return
	 */
	public int updatetype(Administrator a){
		return iadao.updatetype(a);
	}

	/**
	 * 删除管理员
	 * yangweihang
	 * @Date 2018年9月1日 上午9:39:56
	 * @param id
	 * @return
	 */
	public int deletea(int id){
		return iadao.deletea(id);
	}
	
	/**
	 * 按合伙人微信id查询店铺管理员
	 * yangweihang
	 * @Date 2018年9月1日 上午9:46:40
	 * @param wxid
	 * @return
	 */
	public List<Administrator> selectpwxidbya(String wxid){
		return iadao.selectpwxidbya(wxid);
	}
	
	/**
	 * 按微信id查询
	 * yangweihang
	 * @Date 2018年9月1日 下午2:48:37
	 * @param wxid
	 * @return
	 */
	public Administrator selectonebywxid(int id) {
		return iadao.selectonebywxid(id);
	}
	
}
