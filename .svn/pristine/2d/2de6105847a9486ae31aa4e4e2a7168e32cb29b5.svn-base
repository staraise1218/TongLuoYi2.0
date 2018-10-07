package com.tly.service;

import java.util.List;
import java.util.Map;

import com.tly.model.UserStatistics;

/**
 * 会员使用
 * @ClassName IUserStatisticsService
 * @Author yangweihang
 * @Date 2018年8月26日 下午4:18:23
 */
public interface IUserStatisticsService {

	/**
	 * 查询会员使用
	 * yangweihang
	 * @Date 2018年8月26日 下午4:15:32
	 * @param mid
	 * @return
	 */
	List<Map<String,Object>> selectByUs(int mid);

	/**
	 * 录入会员使用统计
	 * @param wxid 扫码人微信id
	 * @param equipmentnumber 设备编号
	 * @return 0为录入不成功 1为录入成功
	 */
	Integer insert(String wxid, String equipmentnumber);

	/**
	 * 该用户的使用总次数和总时长
	 * @param wxid 
	 * @return 总次数和总时长
	 */
	Map selectSumuserstatistics(String wxid);

	/**
	 * 修改该用户的结束时间和使用时间
	 * 硬件发送使用完毕的信号 这边结束时间就是系统当前时间
	 * @param wxid 用户微信id
	 * @return 0.不成功 1.成功
	 */
	Integer updateTime(String wxid);

	/**
	 * 查询该用户近30天的使用记录
	 * @param wxid 该用户的微信id
	 * @return 使用记录list
	 */
	List selectUserstatisticsListByWxid(String wxid);
	
	/**
	 * 按管理员微信id查询该店铺没有开机的设备
	 * yangweihang
	 * @Date 2018年8月29日 下午5:02:44
	 * @param wxid
	 * @return
	 */
	List<Map<String,Object>> selectNotStartingByWxid(String wxid);
	
	/**
	 * 按管理员微信id查询该店铺没有开机的设备的未读数量
	 * yangweihang
	 * @Date 2018年8月29日 下午5:43:34
	 * @param wxid
	 * @return
	 */
	int selectNotStartingByWxidcount(String wxid);
	
	/**
	 * 按管理员微信id查询店铺没有开机的设备修改为已读
	 * yangweihang
	 * @Date 2018年8月29日 下午5:44:21
	 * @param wxid
	 * @return
	 */
	int updateNotStartingByLook(String wxid);
	
	/**
	 * 按合伙人微信id查询该店铺没有开机的设备
	 * yangweihang
	 * @Date 2018年8月29日 下午5:02:44
	 * @param wxid
	 * @return
	 */
	List<Map<String,Object>> selectNotStartingByPwxid(String wxid);
	
	/**
	 * 按合伙人微信id查询该店铺没有开机的设备的未读数量
	 * yangweihang
	 * @Date 2018年8月31日 下午1:45:23
	 * @param wxid
	 * @return
	 */
	int selectNotStartingBypwxidcount(String wxid);
	
	/**
	 * 按合伙人微信id查询店铺没有开机的设备修改为已读
	 * yangweihang
	 * @Date 2018年8月31日 下午1:56:15
	 * @param wxid
	 * @return
	 */
	int updateNotStartingByPlook(String wxid);
	
	/**
	 * 查询当前用户的最后一条记录
	 * yangweihang
	 * @Date 2018年9月11日 下午2:55:44
	 * @param wxid
	 * @return
	 */
	UserStatistics selectByLast(String wxid);
	
}
