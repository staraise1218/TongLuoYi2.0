package com.tly.service;

import java.util.List;
import java.util.Map;

import com.tly.model.Integral;

/**
 * 积分明细
 * @ClassName IIntegralService
 * @Author yangweihang
 * @Date 2018年8月26日 下午3:41:39
 */
public interface IIntegralService {
	
	/**
	 * 查询积分明细
	 * yangweihang
	 * @Date 2018年8月26日 下午3:40:34
	 * @param wxid
	 * @return
	 */
	List<Integral> selectByIntegral(Map<String,Object> map);
	
	/**
	 * 修改星评
	 * yangweihang
	 * @Date 2018年8月27日 下午5:01:32
	 * @param usid
	 * @return
	 */
	int updatestarrating(Integral i);
	
	/**
	 * 修改留言
	 * yangweihang
	 * @Date 2018年8月27日 下午5:01:32
	 * @param usid
	 * @return
	 */
	int updateleaveword(Integral i);
	
	/**
	 * 查询7天内的数据
	 * yangweihang
	 * @Date 2018年8月28日 下午8:24:51
	 * @param wxid
	 * @return
	 */
	List<Integral> selectByTime(String wxid);

	/**
	 * 录入积分
	 * @param wxid 扫码人微信id
	 * @param type 什么渠道来获取的积分
	 * @param num 具体是多少积分
	 * 时间就是当前时间
	 * 会员使用统计id自己查该会员最后一条
	 * @return 是否录入成功
	 */
	Integer insertIntegral(String wxid, Integer type, Long num, String equipmentnumber);
	
	/**
	 * 查询没有读的数量
	 * yangweihang
	 * @Date 2018年8月29日 上午9:33:36
	 * @param wxid
	 * @return
	 */
	Integer selectByNotLook(String wxid);
	
	/**
	 * 修改成已读
	 * yangweihang
	 * @Date 2018年8月29日 上午9:46:12
	 * @param wxid
	 * @return
	 */
	int updateBylook(String wxid);

	/**
	 * 根据用户微信id查询该用户总积分
	 * @param wxid 用户微信id
	 * @return 该用户的总积分
	 */
	Long selectSumIntegralByWxid(String wxid);
}	
