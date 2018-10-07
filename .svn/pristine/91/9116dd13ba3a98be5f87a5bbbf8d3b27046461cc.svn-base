package com.tly.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tly.dao.IEquipmentSublistDao;
import com.tly.dao.IMemberDao;
import com.tly.dao.IPartnerEquipmentDao;
import com.tly.dao.IUserStatisticsDao;
import com.tly.model.UserStatistics;
import com.tly.service.IUserStatisticsService;
import com.tly.util.DateUtil;

/**
 * 会员使用统计
 * @ClassName UserStatisticsService
 * @Author yangweihang
 * @Date 2018年8月26日 下午4:19:37
 */
public class UserStatisticsService implements IUserStatisticsService {
	
	private IUserStatisticsDao iusdao;
	
	private IMemberDao imdao;
	
	private IEquipmentSublistDao iesdao;
	
	private IPartnerEquipmentDao ipedao;
	
	public IUserStatisticsDao getIusdao() {
		return iusdao;
	}

	public void setIusdao(IUserStatisticsDao iusdao) {
		this.iusdao = iusdao;
	}

	public IMemberDao getImdao() {
		return imdao;
	}

	public void setImdao(IMemberDao imdao) {
		this.imdao = imdao;
	}

	public IEquipmentSublistDao getIesdao() {
		return iesdao;
	}

	public void setIesdao(IEquipmentSublistDao iesdao) {
		this.iesdao = iesdao;
	}

	public IPartnerEquipmentDao getIpedao() {
		return ipedao;
	}

	public void setIpedao(IPartnerEquipmentDao ipedao) {
		this.ipedao = ipedao;
	}

	/**
	 * 查询会员使用
	 * yangweihang
	 * @Date 2018年8月26日 下午4:23:21
	 * @param mid
	 * @return
	 */
	@Override
	public List<Map<String,Object>> selectByUs(int mid) {
		return iusdao.selectByUs(mid);
	}

	@Override
	public Integer insert(String wxid, String equipmentnumber) {
		Integer mid = imdao.selectMidByWxid(wxid);//根据微信id查询会员的mid
		Integer eid = iesdao.selectZiIdByEquipmentnumber(equipmentnumber);
		Double smoney = ipedao.selectSmoneyByEid(eid);
		Date starttime = DateUtil.getDate(DateUtil.getTime(), "yyyy-MM-dd HH:mm:ss"); 
		UserStatistics ust = new UserStatistics();
		ust.setMid(mid);
		ust.setEid(eid);
		ust.setMoney(smoney);
		ust.setStarttime(starttime);
		ust.setUtilitytime(new Integer(0).longValue());//使用时长默认为0
		ust.setEndtime(starttime);//默认结束时间和开始时间一样
		Integer suc = iusdao.insert(ust);
		return suc;
	}

	@Override
	public Map selectSumuserstatistics(String wxid) {
		Map map = iusdao.selectSumuserstatistics(wxid);
		Long count = (Long) map.get("count");//该用户使用次数
		int countReal = count.intValue();
		
		java.math.BigDecimal sumUseTime = (java.math.BigDecimal) map.get("sumUseTime");//该用户总时长
		Object sumUseTimeNew = sumUseTime;
		Long valueOf = Long.valueOf(sumUseTimeNew.toString());
		Map mapr = new HashMap();
		mapr.put("count", countReal);
		mapr.put("sumUseTime", valueOf);
		System.out.println(mapr);
		return mapr;
	}

	@Override
	public Integer updateTime(String wxid) {
		UserStatistics us = iusdao.selectLast(wxid);//查询该用户最后一条的使用记录得到一个使用记录对象
		Date d = DateUtil.getDate(DateUtil.getTime(), "yyyy-MM-dd HH:mm:ss");
		us.setEndtime(d);//设置结束时间为当前系统时间
		//System.out.println("当前时间："+d.getTime() + "取到的开始时间："+us.getStarttime().getTime());
		us.setUtilitytime(d.getTime() - us.getStarttime().getTime());//除1000是秒,再除60是分,再除60是小时.
		System.out.println("使用的分钟数：" + (d.getTime() - us.getStarttime().getTime())/60000);
		Integer suc = iusdao.updateTime(us);//修改上面查到的对象的使用时间和结束时间
		return suc;
	}

	@Override
	public List selectUserstatisticsListByWxid(String wxid) {
		List list = iusdao.selectUserstatisticsListByWxid(wxid);
		return list;
	}
	
	/**
	 * 按管理员微信id查询该店铺没有开机的设备
	 * yangweihang
	 * @Date 2018年8月29日 下午5:02:44
	 * @param wxid
	 * @return
	 */
	public List<Map<String,Object>> selectNotStartingByWxid(String wxid){
		return iusdao.selectNotStartingByWxid(wxid);
	}

	/**
	 * 按管理员微信id查询该店铺没有开机的设备的未读数量
	 * yangweihang
	 * @Date 2018年8月29日 下午5:46:44
	 * @param wxid
	 * @return
	 */
	@Override
	public int selectNotStartingByWxidcount(String wxid) {
		return iusdao.selectNotStartingByWxidcount(wxid);
	}

	/**
	 * 按管理员微信id查询店铺没有开机的设备修改为已读
	 * yangweihang
	 * @Date 2018年8月29日 下午5:47:14
	 * @param wxid
	 * @return
	 */
	@Override
	public int updateNotStartingByLook(String wxid) {
		return iusdao.updateNotStartingByLook(wxid);
	}

	/**
	 * 按合伙人微信id查询该店铺没有开机的设备
	 * yangweihang
	 * @Date 2018年8月31日 下午1:37:12
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectNotStartingByPwxid(String wxid) {
		return iusdao.selectNotStartingByPwxid(wxid);
	}

	/**
	 * 按合伙人微信id查询该店铺没有开机的设备的未读数量
	 * yangweihang
	 * @Date 2018年8月31日 下午1:47:45
	 * @param wxid
	 * @return
	 */
	@Override
	public int selectNotStartingBypwxidcount(String wxid) {
		return iusdao.selectNotStartingBypwxidcount(wxid);
	}

	/**
	 * 按合伙人微信id查询店铺没有开机的设备修改为已读
	 * yangweihang
	 * @Date 2018年8月31日 下午1:57:33
	 * @param wxid
	 * @return
	 */
	@Override
	public int updateNotStartingByPlook(String wxid) {
		return iusdao.updateNotStartingByPlook(wxid);
	}
	
	/**
	 * 查询当前用户的最后一条记录
	 * yangweihang
	 * @Date 2018年9月11日 下午2:55:44
	 * @param wxid
	 * @return
	 */
	public UserStatistics selectByLast(String wxid) {
		return iusdao.selectByLast(wxid);
	}
	
}
