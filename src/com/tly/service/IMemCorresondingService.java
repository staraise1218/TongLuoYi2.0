package com.tly.service;

import com.tly.model.MemCorresonding;

/**
 * 维修工单和维修人员对应查看已读或未读
 * @ClassName IMemCorresondingService
 * @Author yangweihang
 * @Date 2018年8月29日 下午2:58:29
 */
public interface IMemCorresondingService {
	
	/**
	 * 新增对应关系
	 * yangweihang
	 * @Date 2018年8月29日 下午2:52:09
	 * @param mc
	 * @return
	 */
	int insert(MemCorresonding mc);
}
