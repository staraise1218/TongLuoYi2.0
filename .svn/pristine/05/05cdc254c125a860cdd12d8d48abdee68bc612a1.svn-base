package com.tly.util;


import java.util.HashMap;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tly.model.Commissionreward;
import com.tly.model.EquipmentSublist;
import com.tly.model.Finance;
import com.tly.model.Member;
import com.tly.model.MemberWallet;
import com.tly.model.Partner;
import com.tly.model.PartnerEquipment;
import com.tly.service.ICommissionrewardService;
import com.tly.service.IEquipmentService;
import com.tly.service.IEquipmentSublistService;
import com.tly.service.IFinanceService;
import com.tly.service.IIntegralService;
import com.tly.service.IMemberService;
import com.tly.service.IPartnerEquipmentService;
import com.tly.service.IPartnerService;
import com.tly.service.IUserStatisticsService;

/**
 * @author moxiuchuan
 * 扫码之后产生的服务
 * 19点21分
 */
@Component
public class ScanServer implements Runnable{

	private IMemberService ims;//会员服务
	private String wxid;//扫码会员微信id
	private IPartnerService ips; //合伙人服务
	private String equipmentnumber;//被扫码设备编号
	private IEquipmentService ies;//设备服务
	private IFinanceService ifs;//订单服务
	private ICommissionrewardService ics;//提成对应服务
	private IEquipmentSublistService iess;//设备子表
	private IPartnerEquipmentService ipes;//合伙人设备
	private IIntegralService iis;//积分服务
	private IUserStatisticsService ius;//使用记录
	
	public ScanServer(IMemberService ims, String wxid, IPartnerService ips, String equipmentnumber,
			IEquipmentService ies, IFinanceService ifs, ICommissionrewardService ics, IEquipmentSublistService iess,
			IPartnerEquipmentService ipes, IIntegralService iis, IUserStatisticsService ius) {
		super();
		this.ims = ims;
		this.wxid = wxid;
		this.ips = ips;
		this.equipmentnumber = equipmentnumber;
		this.ies = ies;
		this.ifs = ifs;
		this.ics = ics;
		this.iess = iess;
		this.ipes = ipes;
		this.iis = iis;
		this.ius = ius;
	}
	public ScanServer() {
	}
	@Override
	public void run() {
		Finance f = new Finance();
		f.setWxid(wxid);
		insertcommission(f);
		iis.insertIntegral(wxid, 1, 1L, equipmentnumber);//录入积分
		ius.insert(wxid, equipmentnumber);//录入该会员使用情况
	}
	
	/**
	 * 录入提成
	 * yangweihang
	 * @Date 2018年8月28日 下午2:16:48
	 * @param f
	 */
	public void insertcommission(Finance f) {
		Map<String,Object> map = new HashMap<String,Object>();
		//经营收益
		Double operatingincome = 0.0;
		//消费一级上线奖励
		Double xfonemoney1 = 0.0;
		//消费二级上线奖励
		Double xftwomoney1 = 0.0;
		//租赁一级上线奖励
		Double zyonemoney1 = 0.0;
		//租赁二级上线奖励
		Double zytwomoney1 = 0.0;
		//公益金
		Double fund = 0.0;
		//维修基金
		Double wxfund = 0.0;
		//运维基金
		Double ywfund = 0.0;
		//查询消费一级上线
		Member xfone = ims.selectonone(wxid);
		if(xfone != null) {
			//消费一级上线微信ID
			f.setXfonewxid(xfone.getWxid());
			//查询消费一级上线的会员级别
			Member xfonem = ims.selectOneMemberByWxid(xfone.getWxid());
			//查询消费一级上线合伙人级别
			Partner xfonep = ips.selectByWxid(xfone.getWxid());
			//获取消费一级上线的提成
			Double xfonemoney = calculationcommission(xfonem, xfonep, "xfone");
			//消费一级获得金额
			f.setXfonemoney(xfonemoney);
			xfonemoney1 = f.getXfonemoney();
			//修改钱包
			updateByMemberWallet(xfonemoney, xfone.getWxid());
		}
		//查询消费二级上线
		Member xftwo = ims.selectontwo(wxid);
		if(xftwo != null) {
			//消费二级上线微信ID
			f.setXftwowxid(xftwo.getWxid());
			//查询消费二级上线的会员级别
			Member xftwom = ims.selectOneMemberByWxid(xftwo.getWxid());
			//查询消费二级上线合伙人级别
			Partner xftwop = ips.selectByWxid(xftwo.getWxid());
			//获取消费二级上线的提成
			Double xftwomoney = calculationcommission(xftwom, xftwop, "xftwo");
			//消费二级获得金额
			f.setXftwomoney(xftwomoney);
			xftwomoney1 = f.getXftwomoney(); 
			//修改钱包
			updateByMemberWallet(xftwomoney, xftwo.getWxid());
		}
		//查询租用一级上线
		Member zyone = ims.selectponone(equipmentnumber);
		if(zyone != null) {
			//租用一级上线微信ID
			f.setZyonewxid(zyone.getWxid());
			//查询租用一级上线的会员级别
			Member zyonem = ims.selectOneMemberByWxid(zyone.getWxid());
			//查询租用一级上线合伙人级别
			Partner zyonep = ips.selectByWxid(zyone.getWxid());
			//获取租用一级上线的提成
			Double zyonemoney = calculationcommission(zyonem, zyonep, "zyone");
			//租用一级获得金额
			f.setZyonemoney(zyonemoney);
			zyonemoney1 = f.getZyonemoney();
			//修改钱包
			updateByMemberWallet(zyonemoney, zyone.getWxid());
		}
		//查询租用二级上线
		Member zytwo = ims.selectponone(equipmentnumber);
		if(zytwo != null) {
			//租用二级上线微信ID
			f.setZytwowxid(zytwo.getWxid());
			//查询租用二级上线的会员级别
			Member zytwom = ims.selectOneMemberByWxid(zytwo.getWxid());
			//查询租用二级上线合伙人级别
			Partner zytwop = ips.selectByWxid(zytwo.getWxid());
			//获取租用二级上线的提成
			Double zytwomoney = calculationcommission(zytwom, zytwop, "zytwo");
			//消费二级获得金额
			f.setZytwomoney(zytwomoney);
			zytwomoney1 = f.getZytwomoney();
			//修改钱包
			updateByMemberWallet(zytwomoney, zytwo.getWxid());
		}
		//类型
		f.setType(YesOrNo.YES);
		//按设备编号查询
		map.put("number", equipmentnumber);
		EquipmentSublist es = iess.selectByNumber(map);
		//设备id
		f.setEid(es.getId());
		//按设备编号查询扫码价格
		PartnerEquipment pe = ipes.selectByNumber(equipmentnumber);
		//单价
		f.setEmoney(pe.getSmoney());
		//数量
		f.setNum(YesOrNo.YES);
		//公益金
		f.setFund(MoneyUtil.FUND);
		fund = f.getFund();
		//运维基金
		f.setYwfund(MoneyUtil.YWFUND);
		ywfund = f.getYwfund();
		//维修基金
		f.setWxfund(MoneyUtil.WXFUND);
		wxfund = f.getWxfund();
		//经营收益
		f.setOperatingincome(operatingincome(pe.getSmoney(), equipmentnumber));
		operatingincome = f.getOperatingincome();
		//平台收益
		Double platformincome = platformincome(f.getEmoney(), operatingincome, xfonemoney1, xftwomoney1, zyonemoney1, zytwomoney1, fund, wxfund, ywfund);
		f.setPlatformincome(platformincome);
		//新增财务
		ifs.insertfinance(f);
	}
	
	/**
	 * 按不同的级别和身份返回不同的钱数
	 * yangweihang
	 * @Date 2018年8月28日 下午3:49:00
	 * @param m 会员
	 * @param p	合伙人
	 * @param type	类型
	 * @return
	 */
	public Double calculationcommission(Member m,Partner p,String type) {
		Map<String,Object> map = new HashMap<String,Object>();
		//判断最高级别
		int level = 0;//级别
		int identity = 0;//身份
		//即是会员又是合伙人
		if(m != null && p != null) {
			//会员级别大于合伙人级别
			if(m.getMlid() > p.getPlid()) {
				level = m.getMlid();
				identity = YesOrNo.YES;
			//合伙人级别大于会员级别
			}else if(m.getMlid() < p.getPlid()) {
				level = p.getPlid();
				identity = YesOrNo.ON;
			//会员级别合伙人级别相等
			}else if(m.getMlid() == p.getPlid()) {
				level = m.getMlid();
				identity = YesOrNo.YES;
			}
		}else {
			//是会员
			if(m != null) {
				level = m.getMlid();
				identity = YesOrNo.YES;
			}
			//是合伙人
			if(p != null) {
				level = p.getPlid();
				identity = YesOrNo.ON;
			}
		}
		map.put("level", level);
		map.put("identity", identity);
		Commissionreward c = ics.selectByLevelAndIdentity(map);
		//按不同的级别返回不同的钱数
		if(type.equals("xfone")) {
			return c.getXfone();
		}else if(type.equals("xftwo")) {
			return c.getXftwo();
		}else if(type.equals("zyone")) {
			return c.getZyone();
		}else if(type.equals("zytwo")) {
			return c.getZytwo();
		}
		return MoneyUtil.DEFAULT;
	}
	
	/**
	 * 计算经营收益
	 * yangweihang
	 * @Date 2018年8月28日 下午5:05:04
	 * @param emoney 扫码价格
	 * @param equipmentnumber 设备编号
	 * @return
	 */
	public Double operatingincome(Double smoney,String equipmentnumber) {
		String sdfsd = "dfsdf";
		Map<String,Object> map = new HashMap<String,Object>();
		//按设备编号查询平台价格
		map.put("number", equipmentnumber);
		EquipmentSublist es = iess.selectByNumber(map);
		//计算经营收益      扫码价格-平台价格
		Double money = smoney - es.getPlatformprice();
		return money;
	}
	
	/**
	 * 计算平台收益
	 * yangweihang
	 * @Date 2018年8月28日 下午5:45:16
	 * @param smoney 扫码价格
	 * @param operatingincome 经营收益
	 * @param xfonemoney1 消费一级上线提成
	 * @param xftwomoney1 消费二级上线提成
	 * @param zyonemoney1 租赁一级上线提成
	 * @param zytwomoney1 租赁二级上线提成
	 * @param fund 公益金
	 * @param wxfund 维修基金
	 * @param ywfund 运维基金
	 * @return
	 */
	public Double platformincome(Double smoney,Double operatingincome,Double xfonemoney1,Double xftwomoney1,Double zyonemoney1,Double zytwomoney1,Double fund,Double wxfund,Double ywfund) {
		Double money = smoney - (operatingincome + xfonemoney1 + xftwomoney1 + zyonemoney1 + zytwomoney1 + fund + wxfund + ywfund);
		return money;
	}
	
	/**
	 * 修改钱包
	 * yangweihang
	 * @Date 2018年8月31日 下午5:09:22
	 * @param money
	 * @param wxid
	 */
	public void updateByMemberWallet(Double money,String wxid){
		MemberWallet mw = new MemberWallet();
		mw.setMoney(money);
		mw.setWxid(wxid);
		ims.updateByMemberWallet(mw);
	}
	
	public Integer insertJifen() {
		return null;
	}
}
