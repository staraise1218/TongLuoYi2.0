package com.tly.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IMemberDao;
import com.tly.model.Member;
import com.tly.model.Partner;

/**
 * @author moxiuchuan
 * 会员dao
 * 11点38分
 */
public class MemberDao extends SqlSessionDaoSupport implements IMemberDao{

	@Override
	public Integer selectOneByPhone(String phonenum) {
		Integer mid = getSqlSession().selectOne("com.tly.dao.IMemberDao.selectOneByPhone", phonenum);
		return mid;
	}

	/**
	 * 会员管理
	 * yangweihang
	 * @Date 2018年8月26日 下午1:51:41
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByMember() {
		return getSqlSession().selectList("com.tly.dao.IMemberDao.selectByMember", null);
	}

	/**
	 * 查询一级上线
	 * yangweihang
	 * @Date 2018年8月26日 下午3:05:36
	 * @param wxid
	 * @return
	 */
	@Override
	public Member selectonone(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.IMemberDao.selectonone", wxid);
	}

	/**
	 * 查询二级上线
	 * yangweihang
	 * @Date 2018年8月26日 下午3:07:06
	 * @param wxid
	 * @return
	 */
	@Override
	public Member selectontwo(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.IMemberDao.selectontwo", wxid);
	}

	/**
	 * 查询一级下线
	 * yangweihang
	 * @Date 2018年8月26日 下午3:08:11
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Member> selectupone(String wxid) {
		return getSqlSession().selectList("com.tly.dao.IMemberDao.selectupone", wxid);
	}

	/**
	 * 查询二级下线	
	 * yangweihang
	 * @Date 2018年8月26日 下午3:09:28
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Member> selectuptwo(String wxid) {
		return getSqlSession().selectList("com.tly.dao.IMemberDao.selectuptwo", wxid);
	}
	
	/**
	 * 查询一级下线总人数
	 * yangweihang
	 * @Date 2018年8月26日 下午3:08:11
	 * @param wxid
	 * @return
	 */
	@Override
	public Integer selectByCount(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.IMemberDao.selectByCount", wxid);
	}
	
	/**
	 * 查询不是本月加入的会员
	 * yangweihang
	 * @Date 2018年8月26日 下午3:07:52
	 * @param wxid
	 * @return
	 */
	public List<Member> selectByNotMonth(Map<String,Object> map){
		return getSqlSession().selectList("com.tly.dao.IMemberDao.selectByNotMonth", map);
	}
	
	/**
	 * 修改级别
	 * yangweihang
	 * @Date 2018年8月26日 下午3:07:52
	 * @param wxid
	 * @return
	 */
	public int updateByLevel(Member m) {
		return getSqlSession().update("com.tly.dao.IMemberDao.updateByLevel", m);
	}

	@Override
	public Member selectOneMemberByWxid(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.IMemberDao.selectOneMemberByWxid", wxid);
	}

	/**
	 * 按设备编号关联查询合伙人的一级上线
	 * yangweihang
	 * @Date 2018年8月28日 下午4:23:00
	 * @param number
	 * @return
	 */
	@Override
	public Member selectponone(String number) {
		return getSqlSession().selectOne("com.tly.dao.IMemberDao.selectponone", number);
	}

	/**
	 * 按设备编号关联查询合伙人二级上线
	 * yangweihang
	 * @Date 2018年8月28日 下午4:23:54
	 * @param number
	 * @return
	 */
	@Override
	public Member selectpontwo(String number) {
		return getSqlSession().selectOne("com.tly.dao.IMemberDao.selectpontwo", number);
	}

	@Override
	public Integer selectMidByWxid(String wxid) {
		Integer mid = getSqlSession().selectOne("com.tly.dao.IMemberDao.selectMidByWxid",wxid);
		return mid;
	}

	@Override
	public Integer insertOneMember(Member mem) {
		Integer suc = getSqlSession().insert("com.tly.dao.IMemberDao.insertOneMember", mem);
		return suc;
	}

	@Override
	public Integer updateOneMember(Member mem) {
		Integer suc = getSqlSession().update("com.tly.dao.IMemberDao.updateOneMember", mem);
		return suc;
	}
	
	/**
	 * 查询该会员的本月消费金额
	* yangweihang
	* @date: 2018年9月1日 上午3:30:49
	* @param map
	* @return
	* Double
	*/
	public Double selectbymoney(Map<String,Object> map) {
		return getSqlSession().selectOne("com.tly.dao.IMemberDao.selectbymoney", map);
	}
	
	/**
	 * 查询合伙人的本月在租押金加累计购买
	* yangweihang
	* @date: 2018年9月1日 上午3:55:19
	* @param map
	* @return
	* Double
	*/
	public Double selectbyzjandgm(Map<String,Object> map) {
		return getSqlSession().selectOne("com.tly.dao.IMemberDao.selectbyzjandgm", map);
	}
	
	/**
	 * 查询不是本月加入的合伙人
	* yangweihang
	* @date: 2018年9月1日 上午3:59:44
	* @param map
	* @return
	* Partner
	*/
	public List<Partner> selectByNotMonthbyp(Map<String,Object> map) {
		return getSqlSession().selectList("com.tly.dao.IMemberDao.selectByNotMonthbyp", map);
	}
	
	/**
	 * 修改合伙人级别
	* yangweihang
	* @date: 2018年9月1日 上午4:09:09
	* @param p
	* @return
	* int
	*/
	public int updatebyplevel(Partner p) {
		System.out.println("pppppppppppppppp"+p);
		return getSqlSession().update("com.tly.dao.IMemberDao.updatebyplevel", p);
	}
	
	/**
	 * 按手机号或微信号查找店铺管理员
	 * yangweihang
	 * @Date 2018年9月1日 上午8:56:27
	 * @param wp
	 * @return
	 */
	public Member selectByPhonenumOrWxid(String wp){
		return getSqlSession().selectOne("com.tly.dao.IMemberDao.selectByPhonenumOrWxid", wp);
	}
	
	/**
	 * 修改角色
	 * yangweihang
	 * @Date 2018年9月1日 下午2:18:50
	 * @param wp
	 * @return
	 */
	public int updatetype(Map<String,Object> map) {
		return getSqlSession().update("com.tly.dao.IMemberDao.updatetype", map);
	}

	/**
	 * 
	 * yangweihang
	 * @Date 2018年9月1日 下午5:53:06
	 * @return
	 */
	@Override
	public List<Member> selectByMembers() {
		return getSqlSession().selectList("com.tly.dao.IMemberDao.selectByMembers", null);
	}

	/**
	 * 查询还不是合伙人的会员
	 * yangweihang
	 * @Date 2018年9月1日 下午6:44:43
	 * @return
	 */
	@Override
	public List<Member> selectByNotp() {
		return getSqlSession().selectList("com.tly.dao.IMemberDao.selectByNotp", null);
	}
}
