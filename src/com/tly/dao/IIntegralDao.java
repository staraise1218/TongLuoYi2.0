package com.tly.dao;

import java.util.List;
import java.util.Map;

import com.tly.model.Integral;

/**
 * 积分明细
 * @ClassName IIntegralDao
 * @Author yangweihang
 * @Date 2018年8月26日 下午3:35:46
 */
public interface IIntegralDao {
	
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
	 * 录入一条数据
	 * @param in 对象
	 * @return 是否成功
	 */
	Integer insertIntegral(Integral in);

	/**
	 * 根据用户微信id查询该用户总积分
	 * @param wxid 用户微信id
	 * @return 该用户的总积分
	 */
	Long selectSumIntegralByWxid(String wxid);
	
	/**
	 * 查询7天内的数据
	 * yangweihang
	 * @Date 2018年8月28日 下午8:24:51
	 * @param wxid
	 * @return
	 */
	List<Integral> selectByTime(String wxid);
	
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
	
}
