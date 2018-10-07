package com.tly.service.impl;

import java.util.List;
import java.util.Map;

import com.tly.dao.IFinanceDao;
import com.tly.model.Finance;
import com.tly.service.IFinanceService;

/**
 * 财务管理
 * @ClassName FinanceService
 * @Author yangweihang
 * @Date 2018年8月26日 下午10:14:27
 */
public class FinanceService implements IFinanceService {

	private IFinanceDao ifdao; 
	
	public IFinanceDao getIfdao() {
		return ifdao;
	}

	public void setIfdao(IFinanceDao ifdao) {
		this.ifdao = ifdao;
	}

	/**
	 * 查询钱包明细
	 * yangweihang
	 * @Date 2018年8月26日 下午10:15:07
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByFinance(String wxid) {
		return ifdao.selectByFinance(wxid);
	}

	/**
	 * 查询下线明细
	 * yangweihang
	 * @Date 2018年8月26日 下午10:58:24
	 * @param map
	 * @return
	 */
	@Override
	public List<Finance> selectByUp(Map<String, Object> map) {
		return ifdao.selectByUp(map);
	}

	/**
	 * 查询平台收入日报
	 * yangweihang
	 * @Date 2018年8月27日 上午3:09:47
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectrb() {
		return ifdao.selectrb();
	}

	/**
	 * 查询平台收入周报
	 * yangweihang
	 * @Date 2018年8月27日 上午3:10:58
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectzb() {
		return ifdao.selectzb();
	}

	/**
	 * 查询平台收入月报
	 * yangweihang
	 * @Date 2018年8月27日 上午3:11:11
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectyb() {
		return ifdao.selectyb();
	}

	/**
	 * 查询平台收入季报
	 * yangweihang
	 * @Date 2018年8月27日 上午3:11:11
	 * @return
	 */
	public List<Map<String,Object>> selectjb(){
		return ifdao.selectjb();
	}
	
	/**
	 * 查询平台收入半年报
	 * yangweihang
	 * @Date 2018年8月27日 上午3:11:24
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectbnb() {
		return ifdao.selectbnb();
	}

	/**
	 * 查询平台收入年报
	 * yangweihang
	 * @Date 2018年8月27日 上午3:11:36
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectnb() {
		return ifdao.selectnb();
	}

	/**
	 * 查询销售明细
	 * yangweihang
	 * @Date 2018年8月27日 上午4:11:17
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByXs() {
		return ifdao.selectByXs();
	}

	/**
	 * 押金收入明细
	 * yangweihang
	 * @Date 2018年8月27日 上午4:42:26
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByYj() {
		return ifdao.selectByYj();
	}

	/**
	 * 扫码收入分账、提成、公益金、基金明细表
	 * yangweihang
	 * @Date 2018年8月27日 上午8:16:31
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectfz() {
		return ifdao.selectfz();
	}

	/**
	 * 公益金基金明细
	 * yangweihang
	 * @Date 2018年8月27日 上午10:48:23
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByFund() {
		return ifdao.selectByFund();
	}

	/**
	 * 新增财务
	 * yangweihang
	 * @Date 2018年8月28日 下午6:05:37
	 * @param f
	 * @return
	 */
	@Override
	public int insertfinance(Finance f) {
		return ifdao.insertfinance(f);
	}

	/**
	 * 按微信id查询
	 * yangweihang
	 * @Date 2018年8月28日 下午7:57:59
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByWxid(String wxid) {
		return ifdao.selectByWxid(wxid);
	}

	/**
	 * 查询没有看的财务数量
	 * yangweihang
	 * @Date 2018年8月29日 上午10:49:01
	 * @param wxid
	 * @return
	 */
	@Override
	public int selectByNotLookcount(String wxid) {
		return ifdao.selectByNotLookcount(wxid);
	}

	/**
	 * 按微信id查询财务
	 * yangweihang
	 * @Date 2018年8月29日 上午10:49:41
	 * @param wxid
	 * @return
	 */
	@Override
	public List<Finance> selectByNotLook(String wxid) {
		return ifdao.selectByNotLook(wxid);
	}

	/**
	 * 修改消费一级上线为已读
	 * yangweihang
	 * @Date 2018年8月29日 上午11:11:55
	 * @param id
	 * @return
	 */
	@Override
	public int updatexfone(int id) {
		return ifdao.updatexfone(id);
	}

	/**
	 * 修改消费二级上线为已读
	 * yangweihang
	 * @Date 2018年8月29日 上午11:08:26
	 * @param id
	 * @return
	 */
	@Override
	public int updatexftwo(int id) {
		return ifdao.updatexftwo(id);
	}

	/**
	 * 修改租用一级上线为已读
	 * yangweihang
	 * @Date 2018年8月29日 上午11:11:05
	 * @param id
	 * @return
	 */
	@Override
	public int updatezyone(int id) {
		return ifdao.updatezyone(id);
	}

	/**
	 * 修改租用二级上线为已读
	 * yangweihang
	 * @Date 2018年8月29日 上午11:08:51
	 * @param id
	 * @return
	 */
	@Override
	public int updatezytwo(int id) {
		return ifdao.updatezytwo(id);
	}

	/**
	 * 修改购买一级上线为已读
	 * yangweihang
	 * @Date 2018年8月29日 上午11:09:16
	 * @param id
	 * @return
	 */
	@Override
	public int updategmone(int id) {
		return ifdao.updategmone(id);
	}

	/**
	 * 修改购买二级上线为已读
	 * yangweihang
	 * @Date 2018年8月29日 上午11:10:09
	 * @param id
	 * @return
	 */
	@Override
	public int updategmtwo(int id) {
		return ifdao.updategmtwo(id);
	}

	@Override
	public List<Map> selectEarningsByWxid(String wxid) {
		// TODO Auto-generated method stub
		List<Map> list = ifdao.selectEarningsByWxid(wxid);
		return list;
	}
}
