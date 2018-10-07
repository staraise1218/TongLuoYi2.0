package com.tly.service.impl;

import java.util.HashMap;
import java.util.List;

import java.util.Map;

import com.tly.dao.IMemberDao;
import com.tly.dao.IMemberWalletDao;
import com.tly.dao.IMemberonupLevelDao;
import com.tly.dao.IUserStatisticsDao;
import com.tly.model.Member;
import com.tly.model.MemberWallet;
import com.tly.model.Partner;
import com.tly.service.IMemberService;

public class MemberService implements IMemberService{
	
	private IMemberDao imdao;
	
	private IUserStatisticsDao iusdao;
	
	private IMemberonupLevelDao imldao;//会员上下级对应dao
	
	private IMemberWalletDao imwdao;//会员钱包dao
	
	
	public IMemberWalletDao getImwdao() {
		return imwdao;
	}


	public void setImwdao(IMemberWalletDao imwdao) {
		this.imwdao = imwdao;
	}


	public IMemberonupLevelDao getImldao() {
		return imldao;
	}


	public void setImldao(IMemberonupLevelDao imldao) {
		this.imldao = imldao;
	}


	public IMemberDao getImdao() {
		return imdao;
	}


	public void setImdao(IMemberDao imdao) {
		this.imdao = imdao;
	}

	public IUserStatisticsDao getIusdao() {
		return iusdao;
	}


	public void setIusdao(IUserStatisticsDao iusdao) {
		this.iusdao = iusdao;
	}


	@Override
	public Integer selectOneByPhone(String phonenum) {
		Integer mid = imdao.selectOneByPhone(phonenum);
		return mid;
	}


	@Override
	public Integer selectUseSumByMid(int mid) {
		Integer sum = iusdao.selectUseSumByMid(mid);
		return sum;
	}


	/**
	 * 会员管理
	 * yangweihang
	 * @Date 2018年8月26日 下午1:53:38
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByMember() {
		return imdao.selectByMember();
	}


	/**
	 * 查询一级上线
	 * yangweihang
	 * @Date 2018年8月26日 下午3:11:24
	 * @param wxid
	 * @return
	 */
	@Override
	public Member selectonone(String wxid) {
		return imdao.selectonone(wxid);
	}


	/**
	 * 查询二级上线
	 * yangweihang
	 * @Date 2018年8月26日 下午3:11:35
	 * @param wxid
	 * @return
	 */
	@Override
	public Member selectontwo(String wxid) {
		return imdao.selectontwo(wxid);
	}


	/**
	 * 查询一级下线
	 * yangweihang
	 * @Date 2018年8月26日 下午3:11:46
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Member> selectupone(String wxid) {
		return imdao.selectupone(wxid);
	}


	/**
	 * 查询二级下线
	 * yangweihang
	 * @Date 2018年8月26日 下午3:11:59
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Member> selectuptwo(String wxid) {
		return imdao.selectuptwo(wxid);
	}

	/**
	 * 查询一级下线总人数
	 * yangweihang
	 * @Date 2018年8月26日 下午3:07:52
	 * @param wxid
	 * @return
	 */
	public Integer selectByCount(String wxid) {
		return imdao.selectByCount(wxid);
	}
	
	/**
	 * 查询不是本月加入的会员
	 * yangweihang
	 * @Date 2018年8月26日 下午3:07:52
	 * @param wxid
	 * @return
	 */
	public List<Member> selectByNotMonth(Map<String,Object> map){
		System.out.println("map"+map);
		try {
			List<Member> list = imdao.selectByNotMonth(map);
			System.out.println("0000000000"+list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return imdao.selectByNotMonth(map);
	}
	
	/**
	 * 修改级别
	 * yangweihang
	 * @Date 2018年8月26日 下午3:07:52
	 * @param wxid
	 * @return
	 */
	public int updateByLevel(Member m) {
		return imdao.updateByLevel(m);
	}

	@Override
	public Member selectOneMemberByWxid(String wxid) {
		Member mem = imdao.selectOneMemberByWxid(wxid);
		return mem;
	}


	/**
	 * 按设备编号关联查询合伙人的一级上线
	 * yangweihang
	 * @Date 2018年8月28日 下午4:24:52
	 * @param number
	 * @return
	 */
	@Override
	public Member selectponone(String number) {
		return imdao.selectponone(number);
	}


	/**
	 * 按设备编号关联查询合伙人二级上线
	 * yangweihang
	 * @Date 2018年8月28日 下午4:24:47
	 * @param number
	 * @return
	 */
	@Override
	public Member selectpontwo(String number) {
		return imdao.selectpontwo(number);
	}


	@Override
	public List<Map> selectDownOneWxidAndType(String wxid) {
		List<Map> list = imldao.selectDownOneWxidAndType(wxid);
		return list;
	}


	@Override
	public List<Map> selectDownOneWxidAndSumTwo(String wxid) {
		List<Map> list = imldao.selectDownOneWxidAndSumTwo(wxid);
		return list;
	}


	@Override
	public Double selectRemainMoney(String wxid) {
		Double remainMoney =  imwdao.selectRemainMoney(wxid);
		return remainMoney;
	}

	/**
	 * 修改会员钱包
	 * yangweihang
	 * @Date 2018年8月31日 下午4:55:38
	 * @param mw
	 * @return
	 */
	@Override
	public int updateByMemberWallet(MemberWallet mw) {
		return imwdao.updateByMemberWallet(mw);
	}

	@Override
	public Integer updateMoneyByWxid(String wxid, Double money) {
		Map map = new  HashMap();
		map.put("wxid", wxid);
		map.put("money",money);
		Integer suc = imwdao.updateMoneyByWxid(map);
		return suc;
	}


	@Override
	public Integer insertOneMemberAndRelation(Member mem, String equipmentnumber, Integer from) {
		Integer suc = null;
		Map<String,Object> map = new HashMap<String,Object>();
		//录入该会员
		Integer sucmem = imdao.insertOneMember(mem);
		//获取会员的微信id
		String wxid = mem.getWxid();
		map.put("wxid", wxid);
		map.put("equipmentnumber", equipmentnumber);
		map.put("from", from);
		//录入上下级
		Integer sucrel = imldao.insertRelation(map);
		if (sucmem == 1 && sucrel ==1) {
			suc = 1;
		}else {
			suc = 0;
		}
		return suc;
	}


	@Override
	public Integer insertOneMemberAndRelation(Member mem, Integer from, String otherWxid) {
		Integer suc = null;
		Map<String,Object> map = new HashMap<String,Object>();
		//录入该会员
		Integer sucmem = imdao.insertOneMember(mem);
		//获取会员的微信id
		String wxid = mem.getWxid();
		map.put("wxid", wxid);
		map.put("from", from);
		map.put("otherWxid", otherWxid);
		//录入会员上下级
		Integer sucrel = imldao.insertRelationFromTwo(map);
		if (sucmem == 1 && sucrel ==1) {
			suc = 1;
		}else {
			suc = 0;
		}
		return suc;
	}

	@Override
	public Integer updateOneMember(Member mem) {
		Integer suc = imdao.updateOneMember(mem);
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
		return imdao.selectbymoney(map);
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
		return imdao.selectbyzjandgm(map);
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
		return imdao.selectByNotMonthbyp(map);
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
		return imdao.updatebyplevel(p);
	}
	
	/**
	 * 按手机号或微信号查找店铺管理员
	 * yangweihang
	 * @Date 2018年9月1日 上午8:56:27
	 * @param wp
	 * @return
	 */
	public Member selectByPhonenumOrWxid(String wp){
		return imdao.selectByPhonenumOrWxid(wp);
	}
	
	/**
	 * 修改角色
	 * yangweihang
	 * @Date 2018年9月1日 下午2:20:11
	 * @param wp
	 * @return
	 */
	public int updatetype(Map<String,Object> map) {
		return imdao.updatetype(map);
	}

	/**
	 * 查找全部会员
	 * yangweihang
	 * @Date 2018年9月1日 下午5:54:18
	 * @return
	 */
	@Override
	public List<Member> selectByMembers() {
		return imdao.selectByMembers();
	}


	/**
	 * 查询还不是合伙人的会员
	 * yangweihang
	 * @Date 2018年9月1日 下午6:46:05
	 * @return
	 */
	@Override
	public List<Member> selectByNotp() {
		return imdao.selectByNotp();
	}
}
