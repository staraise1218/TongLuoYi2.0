package com.tly.service.impl;

import com.tly.dao.IMemCorresondingDao;
import com.tly.model.MemCorresonding;
import com.tly.service.IMemCorresondingService;

/**
 * 维修工单和维修人员对应查看已读或未读
 * @ClassName MemCorresondingService
 * @Author yangweihang
 * @Date 2018年8月29日 下午2:59:29
 */
public class MemCorresondingService implements IMemCorresondingService {

	private IMemCorresondingDao imcdao;
	
	public IMemCorresondingDao getImcdao() {
		return imcdao;
	}

	public void setImcdao(IMemCorresondingDao imcdao) {
		this.imcdao = imcdao;
	}

	/**
	 * 新增对应关系
	 * yangweihang
	 * @Date 2018年8月29日 下午3:00:14
	 * @param mc
	 * @return
	 */
	@Override
	public int insert(MemCorresonding mc) {
		return imcdao.insert(mc);
	}
}
