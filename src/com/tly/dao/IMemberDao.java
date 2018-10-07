package com.tly.dao;

import java.util.List;
import java.util.Map;

import com.tly.model.Member;
import com.tly.model.Partner;

/**
 * @author moxiuchuan
 * 会员dao
 * 11点33分
 */
public interface IMemberDao {

	/**
	 * 根据手机号查询一个会员id
	 * @param phonenum
	 * @return 会员id
	 */
	Integer selectOneByPhone(String phonenum);
	
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
	 * 根据用户的微信id查询整个用户对象
	 * @param wxid 该用户微信id
	 * @return 该用户对象
	 */
	Member selectOneMemberByWxid(String wxid);

	/**
	 * 根据用户微信id查询该用户的mid
	 * @param wxid  用户微信id
	 * @return 用户mid
	 */
	Integer selectMidByWxid(String wxid);
	
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
	 * 录入一个会员对象
	 * @param mem 会员对象
	 * @return 是否录入成功
 	 */
	Integer insertOneMember(Member mem);

	/**
	 * 修改一个会员的任意一个属性
	 * @param mem 会员对象
	 * @return 是否成功
	 */
	Integer updateOneMember(Member mem);
	
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
	 * @Date 2018年9月1日 下午2:18:50
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
