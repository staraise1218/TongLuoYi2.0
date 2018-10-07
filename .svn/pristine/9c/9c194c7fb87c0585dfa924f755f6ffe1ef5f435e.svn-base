package com.tly.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IMemCorresondingDao;
import com.tly.model.MemCorresonding;

/**
 * 维修工单和维修人员对应查看已读或未读
 * @ClassName MemCorresondingDao
 * @Author yangweihang
 * @Date 2018年8月29日 下午2:52:51
 */
public class MemCorresondingDao extends SqlSessionDaoSupport implements IMemCorresondingDao {

	/**
	 * 新增对应关系
	 * yangweihang
	 * @Date 2018年8月29日 下午2:53:29
	 * @param mc
	 * @return
	 */
	@Override
	public int insert(MemCorresonding mc) {
		return getSqlSession().insert("com.tly.dao.IMemCorresondingDao.insert", mc);
	}

}
