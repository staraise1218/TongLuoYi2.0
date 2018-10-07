package com.tly.service.impl;

import java.util.List;
import java.util.Map;

import com.tly.dao.IEvaluationMessageDao;
import com.tly.model.EvaluationMessage;
import com.tly.service.IEvaluationMessageService;

/**
 * 会员评价留言
 * @ClassName EvaluationMassageService
 * @Author yangweihang
 * @Date 2018年8月27日 下午3:22:58
 */
public class EvaluationMessageService implements IEvaluationMessageService {

	private IEvaluationMessageDao ievmdao;
	
	public IEvaluationMessageDao getIevmdao() {
		return ievmdao;
	}

	public void setIevmdao(IEvaluationMessageDao ievmdao) {
		this.ievmdao = ievmdao;
	}


	/**
	 * 新增会员评价留言
	 * yangweihang
	 * @Date 2018年8月27日 下午3:24:24
	 * @param em
	 * @return
	 */
	@Override
	public int insertem(EvaluationMessage em) {
		return ievmdao.insertem(em);
	}
	
	/**
	 * 修改会员评价留言
	 * yangweihang
	 * @Date 2018年8月27日 下午3:04:08
	 * @param em
	 * @return
	 */
	public int updateem(EvaluationMessage em) {
		return ievmdao.updateem(em);
	}

	/**
	 * 留言
	 * yangweihang
	 * @Date 2018年8月27日 下午5:23:22
	 * @param em
	 * @return
	 */
	@Override
	public int updateByleavemessage(EvaluationMessage em) {
		return ievmdao.updateByleavemessage(em);
	}

	/**
	 * 按id查询
	 * yangweihang
	 * @Date 2018年8月27日 下午5:40:29
	 * @param emid
	 * @return
	 */
	@Override
	public EvaluationMessage selectByOneNotnull(int emid) {
		return ievmdao.selectByOneNotnull(emid);
	}

	/**
	 * 查询该数据是否是30天内的
	 * yangweihang
	 * @Date 2018年8月27日 下午5:53:04
	 * @param emid
	 * @return
	 */
	@Override
	public EvaluationMessage selectBytime(int emid) {
		return ievmdao.selectBytime(emid);
	}

	/**
	 * 追加留言
	 * yangweihang
	 * @Date 2018年8月27日 下午6:29:28
	 * @param em
	 * @return
	 */
	@Override
	public int updateByadditionalcomments(EvaluationMessage em) {
		return ievmdao.updateByadditionalcomments(em);
	}

	/**
	 * 判断是否留过言
	 * yangweihang
	 * @Date 2018年8月27日 下午6:39:21
	 * @param emid
	 * @return
	 */
	@Override
	public EvaluationMessage selectByac(int emid) {
		return ievmdao.selectByac(emid);
	}

	/**
	 * 按某人查询留言
	 * yangweihang
	 * @Date 2018年8月27日 下午7:29:06
	 * @param mid
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByLeavmessage(Map<String,Object> map) {
		return ievmdao.selectByLeavmessage(map);
	}
	
	/**
	 * 查询某人的留言
	 * yangweihang
	 * @Date 2018年9月11日 上午10:59:26
	 * @return
	 */
	public List<Map<String,Object>> selectByWxid(Map<String,Object> map){
		return ievmdao.selectByWxid(map);
	}
}
