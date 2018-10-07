package com.tly.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tly.dao.IShopDao;
import com.tly.model.Shop;
import com.tly.service.IShopService;

/**
 * 店铺管理
 * @ClassName ShopService
 * @Author yangweihang
 * @Date 2018年8月26日 下午1:13:39
 */
public class ShopService implements IShopService {
	
	private IShopDao isdao;

	public IShopDao getIsdao() {
		return isdao;
	}


	public void setIsdao(IShopDao isdao) {
		this.isdao = isdao;
	}


	/**
	 * 查询店铺
	 * yangweihang
	 * @Date 2018年8月26日 下午1:14:09
	 * @return
	 */
	@Override
	public List<Shop> selectByShop() {
		return isdao.selectByShop();
	}
	
	/**
	 * 按合伙人查找店铺
	 * yangweihang
	 * @Date 2018年9月1日 上午9:23:13
	 * @param wxid
	 * @return
	 */
	public Shop selectpwxidbyshop(String wxid){
		return isdao.selectpwxidbyshop(wxid);
	}


	@Override
	public List<Map> selectNearby(String location, int num, int page) {
		// TODO Auto-generated method stub
		String jingdu = location.substring(0, 13);
		String weidu = location.substring(location.indexOf(",")+1);
		System.out.println("经度："+jingdu +"------------" +"纬度：" + weidu);
		Map map = new HashMap();
		map.put("jingdu", jingdu);
		map.put("weidu", weidu);
		map.put("first", num* (page - 1));
		map.put("last", num);
		System.out.println(num+"ddddddd"+page);
		List<Map> list = isdao.selectNearby(map);
		return list;
	}


	@Override
	public Shop selectOneBySid(Integer sid) {
		// TODO Auto-generated method stub
		Shop shop = isdao.selectOneBySid(sid);
		return shop;
	}

}
