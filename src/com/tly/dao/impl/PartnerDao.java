package com.tly.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IPartnerDao;
import com.tly.model.Member;
import com.tly.model.Partner;

/**
 * 合伙人
 * @ClassName PartnerDao
 * @Author yangweihang
 * @Date 2018年8月26日 下午5:09:13
 */
public class PartnerDao extends SqlSessionDaoSupport implements IPartnerDao {

	/**
	 * 合伙人详情
	 * yangweihang
	 * @Date 2018年8月26日 下午5:09:49
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByPartner() {
		return getSqlSession().selectList("com.tly.dao.IPartnerDao.selectByPartner", null);
	}
	
	/**
	 * 查询一级上线
	 * yangweihang
	 * @Date 2018年8月26日 下午3:05:36
	 * @param wxid
	 * @return
	 */
	@Override
	public Partner selectonone(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.IPartnerDao.selectonone", wxid);
	}

	/**
	 * 查询二级上线
	 * yangweihang
	 * @Date 2018年8月26日 下午3:07:06
	 * @param wxid
	 * @return
	 */
	@Override
	public Partner selectontwo(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.IPartnerDao.selectontwo", wxid);
	}

	/**
	 * 查询一级下线
	 * yangweihang
	 * @Date 2018年8月26日 下午3:08:11
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Partner> selectupone(String wxid) {
		return getSqlSession().selectList("com.tly.dao.IPartnerDao.selectupone", wxid);
	}

	/**
	 * 查询二级下线	
	 * yangweihang
	 * @Date 2018年8月26日 下午3:09:28
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Partner> selectuptwo(String wxid) {
		return getSqlSession().selectList("com.tly.dao.IPartnerDao.selectuptwo", wxid);
	}

	@Override
	public String selectPeoByEquipmentnumber(String equipmentnumber) {
		String wxid = getSqlSession().selectOne("com.tly.dao.IPartnerDao.selectPeoByEquipmentnumber", equipmentnumber);
		return wxid;
	}

	/**
	 * 按微信id查询
	 * yangweihang
	 * @Date 2018年8月28日 下午3:01:43
	 * @param wxid
	 * @return
	 */
	@Override
	public Partner selectByWxid(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.IPartnerDao.selectByWxid", wxid);
	}

	/**
	 * 按管理员微信id查询合伙人id
	 * yangweihang
	 * @Date 2018年8月31日 上午11:59:32
	 * @param wxid
	 * @return
	 */
	@Override
	public Integer selectawxidbypid(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.IPartnerDao.selectawxidbypid", wxid);
	}
	
	/**
	* 查询
	* yangweihang
	* @date: 2018年9月1日 上午12:27:30
	* @return List<Map<String,Object>>
	*/
	public List<Map<String,Object>> selectbytx(){
		return getSqlSession().selectList("com.tly.dao.IPartnerDao.selectbytx", null);
	}

	/**
	 * 新增合伙人
	 * yangweihang
	 * @Date 2018年9月1日 下午6:05:14
	 * @param p
	 * @return
	 */
	@Override
	public int insertbyp(Partner p) {
		return getSqlSession().insert("com.tly.dao.IPartnerDao.insertbyp", p);
	}

	/**
	 * 查询全部合伙人
	 * yangweihang
	 * @Date 2018年9月1日 下午6:10:36
	 * @return
	 */
	@Override
	public List<Partner> selectall() {
		return getSqlSession().selectList("com.tly.dao.IPartnerDao.selectall", null);
	}
	
}
