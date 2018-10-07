package com.tly.dao;

import com.tly.model.EquipmentApply;

/**
 * @author moxiuichuan
 * 设备申请dao接口
 * 10点18分
 */
public interface IEquipmentApplyDao {

    /**
     * 插入一条设备申请
     * @param ea 申请对象
     * @return 是否录入成功
     */
	Integer insertOneApple(EquipmentApply ea);
	
}
