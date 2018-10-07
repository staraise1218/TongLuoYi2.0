package com.tly.service.impl;

import java.util.List;

import java.util.Map;

import com.tly.dao.ICommissionrewardDao;
import com.tly.dao.IPartnerDao;
import com.tly.dao.IPartnerEquipmentDao;
import com.tly.model.Commissionreward;
import com.tly.model.Partner;
import com.tly.service.IPartnerService;

/**
 * 合伙人
 * @ClassName PartnerService
 * @Author yangweihang
 * @Date 2018年8月26日 下午5:19:13
 */
public class PartnerService implements IPartnerService {
	
	private IPartnerDao ipdao;
	
	private IPartnerEquipmentDao ipedao;//合伙人设备对应
	
	private ICommissionrewardDao icdao;//会员合伙人提成奖励对应表
	
	
	
	

	public IPartnerEquipmentDao getIpedao() {
		return ipedao;
	}

	public void setIpedao(IPartnerEquipmentDao ipedao) {
		this.ipedao = ipedao;
	}

	public IPartnerDao getIpdao() {
		return ipdao;
	}

	public void setIpdao(IPartnerDao ipdao) {
		this.ipdao = ipdao;
	}

	
	public ICommissionrewardDao getIcdao() {
		return icdao;
	}

	public void setIcdao(ICommissionrewardDao icdao) {
		this.icdao = icdao;
	}

	/**
	 * 合伙人管理
	 * yangweihang
	 * @Date 2018年8月26日 下午5:20:19
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByPartner() {
		return ipdao.selectByPartner();
	}
	
	/**
	 * 查询一级上线
	 * yangweihang
	 * @Date 2018年8月26日 下午3:11:24
	 * @param wxid
	 * @return
	 */
	@Override
	public Partner selectonone(String wxid) {
		return ipdao.selectonone(wxid);
	}


	/**
	 * 查询二级上线
	 * yangweihang
	 * @Date 2018年8月26日 下午3:11:35
	 * @param wxid
	 * @return
	 */
	@Override
	public Partner selectontwo(String wxid) {
		return ipdao.selectontwo(wxid);
	}


	/**
	 * 查询一级下线
	 * yangweihang
	 * @Date 2018年8月26日 下午3:11:46
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Partner> selectupone(String wxid) {
		return ipdao.selectupone(wxid);
	}


	/**
	 * 查询二级下线
	 * yangweihang
	 * @Date 2018年8月26日 下午3:11:59
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Partner> selectuptwo(String wxid) {
		return ipdao.selectuptwo(wxid);
	}

	@Override
	public Integer selectEquipmentForm(String equipmentnumber) {
		Integer form = ipedao.selectEquipmentForm(equipmentnumber);
		return form;
	}

	@Override
	public Commissionreward selectMoneyByRank(Integer id) {
		Commissionreward money = icdao.selectMoneyByRank(id);
		return money;
	}

	@Override
	public String selectPeoByEquipmentnumber(String equipmentnumber) {
		String wxid = ipdao.selectPeoByEquipmentnumber(equipmentnumber);
		return wxid;
	}

	/**
	 * 按微信id查询
	 * yangweihang
	 * @Date 2018年8月28日 下午3:03:53
	 * @param wxid
	 * @return
	 */
	@Override
	public Partner selectByWxid(String wxid) {
		return ipdao.selectByWxid(wxid);
	}

	/**
	 * 按管理员微信id查询合伙人id
	 * yangweihang
	 * @Date 2018年8月31日 下午12:00:30
	 * @param wxid
	 * @return
	 */
	@Override
	public Integer selectawxidbypid(String wxid) {
		return ipdao.selectawxidbypid(wxid);
	}
	
	/**
	* 查询
	* yangweihang
	* @date: 2018年9月1日 上午12:27:30
	* @return List<Map<String,Object>>
	*/
	public List<Map<String,Object>> selectbytx(){
		return ipdao.selectbytx();
	}
	
	/**
	 * 新增合伙人
	 * yangweihang
	 * @Date 2018年9月1日 下午6:04:56
	 * @param p
	 * @return
	 */
	public int insertbyp(Partner p) {
		return ipdao.insertbyp(p);
	}

	/**
	 * 查询全部合伙人
	 * yangweihang
	 * @Date 2018年9月1日 下午6:11:27
	 * @return
	 */
	@Override
	public List<Partner> selectall() {
		return ipdao.selectall();
	}
}
