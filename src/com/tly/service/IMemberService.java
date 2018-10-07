package com.tly.service;

import java.util.List;
import java.util.Map;

import com.tly.model.Member;
import com.tly.model.MemberWallet;
import com.tly.model.Partner;

public interface IMemberService {

	/**
	 * 通过电话号码查询会员id
	 * @param phonenum
	 * @return 会员id
	 */
	Integer selectOneByPhone(String phonenum);

	/**
	 * 查询码该会员的使用次数，用来判断他的体验资格到了没
	 * @param mid
	 * @return 使用次数
	 */
	Integer selectUseSumByMid(int mid);
	
	/**
	 * 会员管理
	 * yangweihang
	 * @Date 2018年8月26日 下午1:51:21
	 * @return
	 */
	List<Map<String,Object>> selectByMember();
	
	/**
	 * 查询一级上线 
	 * yangweihang
	 * @Date 2018年8月26日 下午3:05:06
	 * @param wxid
	 * @return
	 */
	Member selectonone(String wxid);
	
	/**
	 * 查询二级上线
	 * yangweihang
	 * @Date 2018年8月26日 下午3:06:48
	 * @param wxid
	 * @return
	 */
	Member selectontwo(String wxid);
	
	/**
	 * 查询一级下线
	 * yangweihang
	 * @Date 2018年8月26日 下午3:07:52
	 * @param wxid
	 * @return
	 */
	List<Member> selectupone(String wxid);
	
	/**
	 * 查询二级 下线
	 * yangweihang
	 * @Date 2018年8月26日 下午3:08:57
	 * @param wxid
	 * @return
	 */
	List<Member> selectuptwo(String wxid);
	
	/**
	 * 查询一级下线总人数
	 * yangweihang
	 * @Date 2018年8月26日 下午3:07:52
	 * @param wxid
	 * @return
	 */
	Integer selectByCount(String wxid);
	
	/**
	 * 查询不是本月加入的会员
	 * yangweihang
	 * @Date 2018年8月26日 下午3:07:52
	 * @param wxid
	 * @return
	 */
	List<Member> selectByNotMonth(Map<String,Object> map);
	
	/**
	 * 修改级别
	 * yangweihang
	 * @Date 2018年8月26日 下午3:07:52
	 * @param wxid
	 * @return
	 */
	int updateByLevel(Member m);

	/**
	 * 根据用户的微信id查询该用户对象
	 * @param wxid 微信id
	 * @return 该对象
	 */
	Member selectOneMemberByWxid(String wxid);
	
	/**
	 * 按设备编号关联查询合伙人的一级上线
	 * yangweihang
	 * @Date 2018年8月28日 下午4:22:00
	 * @param number
	 * @return
	 */
	Member selectponone(String number);
	
	/**
	 * 按设备编号关联查询合伙人二级上线
	 * yangweihang
	 * @Date 2018年8月28日 下午4:22:30
	 * @param number
	 * @return
	 */
	Member selectpontwo(String number);

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
	 * 查询该账户余额
	 * @param wxid 微信id
	 * @return 账户余额
	 */
	Double selectRemainMoney(String wxid);

	/**
	 * 前台传来钱数 ，然后将他钱包扣钱
	 * @param wxid 微信id
	 * @param wmoney 要扣的钱数
	 * @return 是否扣成功
	 */
	Integer updateMoneyByWxid(String wxid, Double money);

	/**
	 * 通过扫描设备二维码注册的会员 该设备的租赁者为该会员的一级上线
	 * @param mem 会员对象
	 * @param equipmentnumber 设备编码
	 * @param from 通过什么方式录入的
	 * @return 是否录入成功
	 */
	Integer insertOneMemberAndRelation(Member mem,String equipmentnumber, Integer from);

	/**
	 * 根据该扫码人的好友推荐二维码 来录入
	 * @param mem 会员对象 
	 * @param from 通过什么方式录入的
	 * @param otherWxid 分享人微信id
	 * @return 是否录入成功
	 */
	Integer insertOneMemberAndRelation(Member mem, Integer from, String otherWxid);

	/**
	 * 修改一个会员的任意一个属性
	 * @param mem 会员对象
	 * @return 是否成功
	 */
	Integer updateOneMember(Member mem);
	
	/**
	 * 修改会员钱包
	 * yangweihang
	 * @Date 2018年8月31日 下午4:55:38
	 * @param mw
	 * @return
	 */
	int updateByMemberWallet(MemberWallet mw);
	
	/**
	 * 查询该会员的本月消费金额
	* yangweihang
	* @date: 2018年9月1日 上午3:30:49
	* @param map
	* @return
	* Double
	*/
	Double selectbymoney(Map<String,Object> map);
	
	/**
	 * 查询合伙人的本月在租押金加累计购买
	* yangweihang
	* @date: 2018年9月1日 上午3:55:19
	* @param map
	* @return
	* Double
	*/
	Double selectbyzjandgm(Map<String,Object> map);
	
	/**
	 * 查询不是本月加入的合伙人
	* yangweihang
	* @date: 2018年9月1日 上午3:59:44
	* @param map
	* @return
	* Partner
	*/
	List<Partner> selectByNotMonthbyp(Map<String,Object> map);
	
	/**
	 * 修改合伙人级别
	* yangweihang
	* @date: 2018年9月1日 上午4:09:09
	* @param p
	* @return
	* int
	*/
	int updatebyplevel(Partner p);
	
	/**
	 * 按手机号或微信号查找店铺管理员
	 * yangweihang
	 * @Date 2018年9月1日 上午8:56:27
	 * @param wp
	 * @return
	 */
	Member selectByPhonenumOrWxid(String wp);
	
	/**
	 * 修改角色
	 * yangweihang
	 * @Date 2018年9月1日 下午2:20:11
	 * @param wp
	 * @return
	 */
	int updatetype(Map<String,Object> map);
	
	/**
	 * 查找全部会员
	 * yangweihang
	 * @Date 2018年9月1日 下午5:52:37
	 * @return
	 */
	List<Member> selectByMembers();
	
	/**
	 * 查询还不是合伙人的会员
	 * yangweihang
	 * @Date 2018年9月1日 下午6:44:12
	 * @return
	 */
	List<Member> selectByNotp();
}
