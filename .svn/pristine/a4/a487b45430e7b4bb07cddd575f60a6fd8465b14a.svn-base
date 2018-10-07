package com.tly.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.tly.model.UserStatistics;

/**
 * 会员使用统计dao接口
 * @author moxiuchuan
 * 17点48分
 */
public interface IUserStatisticsDao {
	/**
	 * 查询码该会员的使用次数，用来判断他的体验资格到了没
	 * @param mid
	 * @return 使用次数
	 */
	Integer selectUseSumByMid(int mid);
	
	/**
	 * 查询会员使用
	 * yangweihang
	 * @Date 2018年8月26日 下午4:15:32
	 * @param mid
	 * @return
	 */
	List<Map<String,Object>> selectByUs(int mid);

	/**
	 * 插入一条会员统计
	 * @param ust 对象
	 * @return 成功
	 */
	Integer insert(UserStatistics ust);

	/**
	 * 录入积分
	 * @param wxid 扫码人微信id
	 * @param type 什么渠道来获取的积分
	 * @param num 具体是多少积分
	 * 时间就是当前时间
	 * 会员使用统计id自己查该会员最后一条
	 * @return 是否录入成功
	 */
	Integer selectUsidByWxidAndFirstTime(String wxid);

	/**
	 * 该用户的使用总次数和总时长
	 * @param wxid 
	 * @return 总次数和总时长
	 */
	Map selectSumuserstatistics(String wxid);

	/**
	 * 查询该用户最后一条的使用记录得到一个使用记录对象
	 * @param wxid 用户微信id
	 * @return 使用记录对象
	 */
	UserStatistics selectLast(String wxid);

	/**
	 * 根据一个会员使用对象来修改该对象的使用时间
	 * @param us
	 * @return
	 */
	Integer updateTime(UserStatistics us);

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
