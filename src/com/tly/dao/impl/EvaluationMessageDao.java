package com.tly.dao.impl;


import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IEvaluationMessageDao;
import com.tly.model.EvaluationMessage;

/**
 * 会员评价留言
 * @ClassName EvaluationMassageDao
 * @Author yangweihang
 * @Date 2018年8月27日 下午3:16:35
 */
public class EvaluationMessageDao extends SqlSessionDaoSupport implements IEvaluationMessageDao {

	/**
	 * 新增会员评价留言
	 * yangweihang
	 * @Date 2018年8月27日 下午3:17:44
	 * @return
	 */
	@Override
	public int insertem(EvaluationMessage em) {
		return getSqlSession().insert("com.tly.dao.IEvaluationMessageDao.insertem", em);
	}
	
	/**
	 * 修改会员评价留言
	 * yangweihang
	 * @Date 2018年8月27日 下午3:04:08
	 * @param em
	 * @return
	 */
	public int updateem(EvaluationMessage em) {
		return getSqlSession().update("com.tly.dao.IEvaluationMessageDao.updateem", em);
	}

	/**
	 * 留言
	 * yangweihang
	 * @Date 2018年8月27日 下午5:21:55
	 * @param em
	 * @return
	 */
	@Override
	public int updateByleavemessage(EvaluationMessage em) {
		return getSqlSession().update("com.tly.dao.IEvaluationMessageDao.updateByleavemessage", em);
	}

	/**
	 * 按id查询
	 * yangweihang
	 * @Date 2018年8月27日 下午5:39:12
	 * @param emid
	 * @return
	 */
	@Override
	public EvaluationMessage selectByOneNotnull(int emid) {
		return getSqlSession().selectOne("com.tly.dao.IEvaluationMessageDao.selectByOneNotnull", emid);
	}

	/**
	 * 查询该数据是否是30天内的
	 * yangweihang
	 * @Date 2018年8月27日 下午5:54:13
	 * @param emid
	 * @return
	 */
	@Override
	public EvaluationMessage selectBytime(int emid) {
		return getSqlSession().selectOne("com.tly.dao.IEvaluationMessageDao.selectBytime", emid);
	}

	/**
	 * 追加留言
	 * yangweihang
	 * @Date 2018年8月27日 下午6:27:28
	 * @param em
	 * @return
	 */
	@Override
	public int updateByadditionalcomments(EvaluationMessage em) {
		return getSqlSession().update("com.tly.dao.IEvaluationMessageDao.updateByadditionalcomments", em);
	}

	/**
	 * 判断是否留过言
	 * yangweihang
	 * @Date 2018年8月27日 下午6:37:56
	 * @param emid
	 * @return
	 */
	@Override
	public EvaluationMessage selectByac(int emid) {
		return getSqlSession().selectOne("com.tly.dao.IEvaluationMessageDao.selectByac", emid);
	}

	/**
	 * 查询所有人的留言
	 * yangweihang
	 * @Date 2018年8月27日 下午7:27:23
	 * @param mid
	 * @return
	 */
	@Override
	public List<Map<String, Object>> selectByLeavmessage(Map<String,Object> map) {
		return getSqlSession().selectList("com.tly.dao.IEvaluationMessageDao.selectByLeavmessage", map);
	}
	
	/**
	 * 查询某人的留言
	 * yangweihang
	 * @Date 2018年9月11日 上午10:59:26
	 * @return
	 */
	public List<Map<String,Object>> selectByWxid(Map<String,Object> map){
		return getSqlSession().selectList("com.tly.dao.IEvaluationMessageDao.selectByWxid",map);
	}
	
}
