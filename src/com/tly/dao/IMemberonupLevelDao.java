package com.tly.dao;

import java.util.List;
import java.util.Map;

/**
 * @author mxc
 * 用户上下级对应关系dao接口
 * 14点37分
 */
public interface IMemberonupLevelDao {

	/**
	 * 根据该用户id查询该用户一级下线的微信id和成为下线方式的列表
	 * @param wxid 该用户的微信id
	 * @return list
	 */
	List<Map> selectDownOneWxidAndType(String wxid);

	/**
	 * 根据该用户微信id查询该用户一级下线微信id和一级下线的二级下线有多少人
	 * @param wxid 该用户的微信id
	 * @return list
	 */
	List<Map> selectDownOneWxidAndSumTwo(String wxid);

	/**
	 * 根据该台设备编号和该用户的微信id来确立他们俩的上下级关系
	 * @param wxid 用户微信id
	 * @param equipmentnumber 该台设备的编号
	 * @return 是否录入成功
	 */
	Integer insertRelation(Map<String,Object> map);

	/**
	 * 根据该扫码人的好友推荐二维码 来录入
	 * @param mem 会员对象 
	 * @param from 通过什么方式录入的
	 * @param otherWxid 分享人微信id
	 * @return 是否录入成功
	 */
	Integer insertRelationFromTwo(Map<String, Object> map);
	
}
