package com.tly.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IMemberonupLevelDao;

public class MemberonupLevelDao extends SqlSessionDaoSupport implements IMemberonupLevelDao{

	@Override
	public List<Map> selectDownOneWxidAndType(String wxid) {
		List<Map> list = getSqlSession().selectList("com.tly.dao.IMemberonupLevelDao.selectDownOneWxidAndType", wxid);
		return list;
	}

	@Override
	public List<Map> selectDownOneWxidAndSumTwo(String wxid) {
		List<Map> list = getSqlSession().selectList("com.tly.dao.IMemberonupLevelDao.selectDownOneWxidAndSumTwo", wxid);
		return list;
	}

	@Override
	public Integer insertRelation(Map<String,Object> map) {
		Integer suc = getSqlSession().insert("com.tly.dao.IMemberonupLevelDao.insertRelation", map);
		return suc;
	}

	@Override
	public Integer insertRelationFromTwo(Map<String, Object> map) {
		Integer suc = getSqlSession().insert("com.tly.dao.IMemberonupLevelDao.insertRelationFromTwo", map);
		return suc;
	}

}
