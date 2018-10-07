package com.tly.service.impl;

import java.util.Calendar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tly.dao.IMemberDao;
import com.tly.dao.IMemberWalletDao;
import com.tly.dao.IMemberonupLevelDao;
import com.tly.dao.IUserStatisticsDao;
import com.tly.dao.impl.MemberDao;
import com.tly.model.Member;
import com.tly.model.Partner;
import com.tly.service.IEvaluateService;
import com.tly.util.RoleUtil;

/**
 * 会员评价定时任务
 * @ClassName EvaluateService
 * @Author yangweihang
 * @Date 2018年8月28日 上午9:24:22
 */
public class EvaluateService implements IEvaluateService {

	/**
	 * 查询不是本月加入的会员
	 * yangweihang
	 * @Date 2018年9月1日 上午10:52:24
	 * @param map
	 * @return
	 */
	public List<Member> selectByNotMonth(Map<String,Object> map){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
		MemberDao mdao = ac.getBean(MemberDao.class);
		return mdao.selectByNotMonth(map);
	}
	
	/**
	 * 查询一级下线总人数
	 * yangweihang
	 * @Date 2018年9月1日 上午10:52:24
	 * @param map
	 * @return
	 */
	public Integer selectByCount(String wxid){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
		MemberDao mdao = ac.getBean(MemberDao.class);
		return mdao.selectByCount(wxid);
	}
	
	/**
	 * 查询一级下线
	 * yangweihang
	 * @Date 2018年9月1日 上午10:52:24
	 * @param map
	 * @return
	 */
	public List<Member> selectupone(String wxid){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
		MemberDao mdao = ac.getBean(MemberDao.class);
		return mdao.selectupone(wxid);
	}
	
	/**
	 * 查询该会员的消费
	 * yangweihang
	 * @Date 2018年9月1日 上午10:52:24
	 * @param map
	 * @return
	 */
	public Double selectbymoney(Map<String,Object> map){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
		MemberDao mdao = ac.getBean(MemberDao.class);
		return mdao.selectbymoney(map);
	}
	
	/**
	 * 查询该会员的消费
	 * yangweihang
	 * @Date 2018年9月1日 上午10:52:24
	 * @param map
	 * @return
	 */
	public int updateByLevel(Member m){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
		MemberDao mdao = ac.getBean(MemberDao.class);
		return mdao.updateByLevel(m);
	}
	
	/**
	 * 查询不是本月加入的合伙人
	 * yangweihang
	 * @Date 2018年9月1日 上午10:52:24
	 * @param map
	 * @return
	 */
	public List<Partner> selectByNotMonthbyp(Map<String,Object> map){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
		MemberDao mdao = ac.getBean(MemberDao.class);
		return mdao.selectByNotMonthbyp(map);
	}
	
	/**
	 * 查询合伙人的消费金额
	 * yangweihang
	 * @Date 2018年9月1日 上午10:52:24
	 * @param map
	 * @return
	 */
	public Double selectbyzjandgm(Map<String,Object> map){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
		MemberDao mdao = ac.getBean(MemberDao.class);
		return mdao.selectbyzjandgm(map);
	}
	
	/**
	 * 修改合伙人级别
	 * yangweihang
	 * @Date 2018年9月1日 上午10:52:24
	 * @param map
	 * @return
	 */
	public int updatebyplevel(Partner p){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
		MemberDao mdao = ac.getBean(MemberDao.class);
		return mdao.updatebyplevel(p);
	}
	
	/**
	 * 每月会检查会员和管理员的级别
	 * yangweihang
	 * @Date 2018年8月28日 上午9:25:14
	 */
	@Override
	public void timingupdatevisible() {
		Calendar date = Calendar.getInstance();
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH)+1;
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("year", year);
		map.put("month", month);
		//查询不是本月加入的会员
		List<Member> list = null;
		try {
			list = selectByNotMonth(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Member m = new Member();
		for (int i = 0; i < list.size(); i++) {
			//查询一级下线总人数
			Integer count = selectByCount(list.get(i).getWxid());
			//查询一级下线
			List<Member> up = selectupone(list.get(i).getWxid());
			//自第二个月开始，每月考核一级下线活跃度，标准为每月消费≥1次，0消费的一级下线作为不活跃会员，将从活跃人数中减除
			for (Member selm : up) {
				map.put("wxid", selm.getWxid());
				//查询该会员的消费
				Double money = selectbymoney(map);
				if(money <= 0) {
					count--;
				}
			}
			if(count < 100) {
				m.setMlid(RoleUtil.ONE);
			}else if(count >= 100 && count < 500) {
				m.setMlid(RoleUtil.TWO);
			}else if(count >= 500 && count < 1000) {
				m.setMlid(RoleUtil.THREE);
			}else if(count >= 1000) {
				m.setMlid(RoleUtil.FOUR);
			}
			m.setWxid(list.get(i).getWxid());
		}
		//修改级别
		if(m != null) {
			int result = updateByLevel(m);
		}
		//合伙人级别
		selectbyp();
	}
	
	/**
	 * 查询合伙人
	* yangweihang
	* @date: 2018年9月1日 上午4:05:05
	* void
	*/
	public void selectbyp() {
		Calendar date = Calendar.getInstance();
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH)+1;
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("year", year);
		map.put("month", month);
		//查询不是本月加入的合伙人
		List<Partner> list = null;
		try {
			list = selectByNotMonthbyp(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Partner ps = new Partner();
		for(Partner p : list) {
			map.put("wxid", p.getWxid());
			Double money = selectbyzjandgm(map);
			if(money < 100000) {
				ps.setPlid(RoleUtil.ONE);
			}else if(money >= 100000 && money < 200000) {
				ps.setPlid(RoleUtil.TWO);
			}else if(money >= 200000 && money < 500000) {
				ps.setPlid(RoleUtil.THREE);
			}else if(money >= 500000) {
				ps.setPlid(RoleUtil.FOUR);
			}
			ps.setWxid(p.getWxid());
		}
		if(ps != null) {
			int result = 0;
			try {
				result = updatebyplevel(ps);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
