package com.tly.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.tly.dao.IEquipmentSublistDao;
import com.tly.dao.IIntegralDao;
import com.tly.dao.IUserStatisticsDao;
import com.tly.model.Integral;
import com.tly.service.IIntegralService;
import com.tly.util.DateUtil;

/**
 * 查询积分明细
 * @ClassName IntegralService
 * @Author yangweihang
 * @Date 2018年8月26日 下午3:42:41
 */
public class IntegralService implements IIntegralService {
	
	private IIntegralDao iidao;
	
	private IEquipmentSublistDao iesdao;
	
	private IUserStatisticsDao iusdao;
	

	public IUserStatisticsDao getIusdao() {
		return iusdao;
	}

	public void setIusdao(IUserStatisticsDao iusdao) {
		this.iusdao = iusdao;
	}

	public IEquipmentSublistDao getIesdao() {
		return iesdao;
	}

	public void setIesdao(IEquipmentSublistDao iesdao) {
		this.iesdao = iesdao;
	}

	public IIntegralDao getIidao() {
		return iidao;
	}

	public void setIidao(IIntegralDao iidao) {
		this.iidao = iidao;
	}

	/**
	 * 查询积分明细
	 * yangweihang
	 * @Date 2018年8月26日 下午3:43:39
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Integral> selectByIntegral(Map<String,Object> map) {
		return iidao.selectByIntegral(map);
	}

	/**
	 * 修改星评
	 * yangweihang
	 * @Date 2018年8月27日 下午5:05:21
	 * @param usid
	 * @return
	 */
	@Override
	public int updatestarrating(Integral i) {
		return iidao.updatestarrating(i);
	}

	/**
	 * 修改留言
	 * yangweihang
	 * @Date 2018年8月27日 下午6:43:56
	 * @param i
	 * @return
	 */
	@Override
	public int updateleaveword(Integral i) {
		return iidao.updateleaveword(i);
	}

	/**
	 * 查询7天内的数据
	 * yangweihang
	 * @Date 2018年8月28日 下午8:27:03
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Integral> selectByTime(String wxid) {
		return iidao.selectByTime(wxid);
	}

	@Override
	public Integer insertIntegral(String wxid, Integer type, Long num,String equipmentnumber) {
		Integral in = new Integral();
		//根据设备编号查询设备子表id
		Integer eid = iesdao.selectZiIdByEquipmentnumber(equipmentnumber);
		Date time = DateUtil.getDate(DateUtil.getTime(),"yyyy-MM-dd HH:mm:ss");
		Integer usid = iusdao.selectUsidByWxidAndFirstTime(wxid);
		if (type == 1) {//消费
			in.setConsumption(num);
		}else if(type == 2) {
			in.setStarrating(num);
		}else {
			in.setLeaveword(num);
		}
		in.setEid(eid);
		in.setTime(time);
		in.setUsid(usid);
		in.setWxid(wxid);
		Integer suc = iidao.insertIntegral(in);
		return suc;
	}

	/**
	 * 查询没有读的数量
	 * yangweihang
	 * @Date 2018年8月29日 上午9:35:51
	 * @param wxid
	 * @return
	 */
	@Override
	public Integer selectByNotLook(String wxid) {
		return iidao.selectByNotLook(wxid);
	}

	/**
	 * 修改成已读
	 * yangweihang
	 * @Date 2018年8月29日 上午9:47:41
	 * @param wxid
	 * @return
	 */
	@Override
	public int updateBylook(String wxid) {
		return iidao.updateBylook(wxid);
	}

	@Override
	public Long selectSumIntegralByWxid(String wxid) {
		Long SumIntegral = iidao.selectSumIntegralByWxid(wxid);
		return SumIntegral;
	}
	
}
