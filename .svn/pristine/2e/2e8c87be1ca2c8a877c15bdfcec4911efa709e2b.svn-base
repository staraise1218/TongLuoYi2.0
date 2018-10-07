package com.tly.dao;

import java.util.List;
import java.util.Map;

import com.tly.model.Finance;

/**
 * 财务管理
 * @ClassName IFinanceDao
 * @Author yangweihang
 * @Date 2018年8月26日 下午10:04:37
 */
public interface IFinanceDao {
	
	/**
	 * 查询钱包明细
	 * yangweihang
	 * @Date 2018年8月26日 下午10:07:40
	 * @param wxid
	 * @return
	 */
	List<Map<String,Object>> selectByFinance(String wxid);
	
	/**
	 * 查询下线明细
	 * yangweihang
	 * @Date 2018年8月26日 下午10:56:41
	 * @param map
	 * @return
	 */
	List<Finance> selectByUp(Map<String,Object> map);
	
	/**
	 * 查询平台收入日报
	 * yangweihang
	 * @Date 2018年8月27日 上午3:09:47
	 * @return
	 */
	List<Map<String,Object>> selectrb();
	
	/**
	 * 查询平台收入周报
	 * yangweihang
	 * @Date 2018年8月27日 上午3:10:58
	 * @return
	 */
	List<Map<String,Object>> selectzb();
	
	/**
	 * 查询平台收入月报
	 * yangweihang
	 * @Date 2018年8月27日 上午3:11:11
	 * @return
	 */
	List<Map<String,Object>> selectyb();
	
	/**
	 * 查询平台收入季报
	 * yangweihang
	 * @Date 2018年8月27日 上午3:11:11
	 * @return
	 */
	List<Map<String,Object>> selectjb();
	
	/**
	 * 查询平台收入半年报
	 * yangweihang
	 * @Date 2018年8月27日 上午3:11:24
	 * @return
	 */
	List<Map<String,Object>> selectbnb();
	
	/**
	 * 查询平台收入年报
	 * yangweihang
	 * @Date 2018年8月27日 上午3:11:36
	 * @return
	 */
	List<Map<String,Object>> selectnb();
	
	/**
	 * 查询销售明细
	 * yangweihang
	 * @Date 2018年8月27日 上午4:09:05
	 * @return
	 */
	List<Map<String,Object>> selectByXs();
	
	/**
	 * 查询押金收入明细
	 * yangweihang
	 * @Date 2018年8月27日 上午4:09:05
	 * @return
	 */
	List<Map<String,Object>> selectByYj();
	
	/**
	 * 扫码收入分账、提成、公益金、基金明细表
	 * yangweihang
	 * @Date 2018年8月27日 上午4:09:05
	 * @return
	 */
	List<Map<String,Object>> selectfz();
	
	/**
	 * 公益金基金明细
	 * yangweihang
	 * @Date 2018年8月27日 上午4:09:05
	 * @return
	 */
	List<Map<String,Object>> selectByFund();
	
	/**
	 * 新增财务
	 * yangweihang
	 * @Date 2018年8月28日 下午6:03:46
	 * @param f
	 * @return
	 */
	int insertfinance(Finance f);
	
	/**
	 * 按微信id查询微信id
	 * yangweihang
	 * @Date 2018年8月28日 下午7:50:52
	 * @param wxid
	 * @return
	 */
	List<Map<String,Object>> selectByWxid(String wxid);
	
	/**
	 * 查询没有看的财务数量
	 * yangweihang
	 * @Date 2018年8月29日 上午10:45:28
	 * @param wxid
	 * @return
	 */
	int selectByNotLookcount(String wxid);
	
	/**
	 * 按微信id查询财务
	 * yangweihang
	 * @Date 2018年8月29日 上午10:46:11
	 * @param wxid
	 * @return
	 */
	List<Finance> selectByNotLook(String wxid);
	
	/**
	 * 修改消费一级上线为已读
	 * yangweihang
	 * @Date 2018年8月29日 上午11:07:57
	 * @param id
	 * @return
	 */
	int updatexfone(int id);
	
	/**
	 * 修改消费二级上线为已读
	 * yangweihang
	 * @Date 2018年8月29日 上午11:08:26
	 * @param id
	 * @return
	 */
	int updatexftwo(int id);
	
	/**
	 * 修改租用一级上线为已读
	 * yangweihang
	 * @Date 2018年8月29日 上午11:11:05
	 * @param id
	 * @return
	 */
	int updatezyone(int id);
	
	/**
	 * 修改租用二级上线为已读
	 * yangweihang
	 * @Date 2018年8月29日 上午11:08:51
	 * @param id
	 * @return
	 */
	int updatezytwo(int id);
	
	/**
	 * 修改购买一级上线为已读
	 * yangweihang
	 * @Date 2018年8月29日 上午11:09:16
	 * @param id
	 * @return
	 */
	int updategmone(int id);
	
	/**
	 * 修改购买二级上线为已读
	 * yangweihang
	 * @Date 2018年8月29日 上午11:10:09
	 * @param id
	 * @return
	 */
	int updategmtwo(int id);

	/**
	 * 查询该会员近30天的收益记录
	 * @param wxid 微信id
	 * @return list
	 */
	List<Map> selectEarningsByWxid(String wxid);
}
