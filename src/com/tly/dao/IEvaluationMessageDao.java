package com.tly.dao;

import java.util.List;
import java.util.Map;

import com.tly.model.EvaluationMessage;

/**
 * 会员评价留言
 * @ClassName IEvaluationMassageDao
 * @Author yangweihang
 * @Date 2018年8月27日 下午3:03:11
 */
public interface IEvaluationMessageDao {
	
	/**
	 * 新增会员评价留言
	 * yangweihang
	 * @Date 2018年8月27日 下午3:04:08
	 * @param em
	 * @return
	 */
	int insertem(EvaluationMessage em);
	
	/**
	 * 修改会员评价留言
	 * yangweihang
	 * @Date 2018年8月27日 下午3:04:08
	 * @param em
	 * @return
	 */
	int updateem(EvaluationMessage em);
	
	/**
	 * 留言
	 * yangweihang
	 * @Date 2018年8月27日 下午5:21:05
	 * @param em
	 * @return
	 */
	int updateByleavemessage(EvaluationMessage em);
	
	/**
	 * 按id查询
	 * yangweihang
	 * @Date 2018年8月27日 下午5:38:44
	 * @param emid
	 * @return
	 */
	EvaluationMessage selectByOneNotnull(int emid);
	
	/**
	 * 查询该数据是否是30天内的
	 * yangweihang
	 * @Date 2018年8月27日 下午5:51:15
	 * @param emid
	 * @return
	 */
	EvaluationMessage selectBytime(int emid);
	
	/**
	 * 追加留言
	 * yangweihang
	 * @Date 2018年8月27日 下午6:27:08
	 * @param em
	 * @return
	 */
	int updateByadditionalcomments(EvaluationMessage em);
	
	/**
	 * 判断是否留过言
	 * yangweihang
	 * @Date 2018年8月27日 下午6:37:36
	 * @param emid
	 * @return
	 */
	EvaluationMessage selectByac(int emid);
	
	/**
	 * 查询所有人的留言
	 * yangweihang
	 * @Date 2018年8月27日 下午7:15:59
	 * @param mid
	 * @return
	 */
	List<Map<String,Object>> selectByLeavmessage(Map<String,Object> map);
	
	/**
	 * 查询某人的留言
	 * yangweihang
	 * @Date 2018年9月11日 上午10:59:26
	 * @return
	 */
	List<Map<String,Object>> selectByWxid(Map<String,Object> map);
}
