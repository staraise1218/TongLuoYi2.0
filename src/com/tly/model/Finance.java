package com.tly.model;

import java.util.Date;

/**
 * 财务管理
 * @ClassName Finance
 * @Author yangweihang
 * @Date 2018年8月24日 上午11:24:10
 */
public class Finance {
	private Integer id;//id
	private String wxid;//微信id
	private String xfonewxid;//消费一级上线微信id 1
	private Double xfonemoney;//消费一级获得金额
	private String xftwowxid;//消费二级上线微信id	 2
	private Double xftwomoney;//消费二级获得金额
	private String zyonewxid;//租赁一级上线微信id 3
	private Double zyonemoney;//租赁一级获得金额
	private String zytwowxid;//租赁二级上线微信id 4
	private Double zytwomoney;//租赁二级获得金额
	private String gmonewxid;//购买一级上线微信id 5
	private Double gmonemoney;//购买一级获得金额
	private String gmtwowxid;//购买二级上线微信id 6
	private Double gmtwomoney;//购买二级获得金额
	private Integer type;//类型  1.消费  2.租用  3.购买
	private Integer eid;//设备id
	private Double emoney;//设备金额(单价)
	private Integer num;//数量
	private Double fund;//公益金		租用0.4元/次	销售400/台
	private Double ywfund;//运维基金	1/次
	private Double wxfund;//维修基金	3/次
	private Date time;//时间
	private Double operatingincome;//经营收益
	private Double platformincome;//平台收益
	private Integer xfonelook;//消费一级上线 1.已读 2.没有读
	private Integer xftwolook;//消费二级上线 1.已读 2.没有读
	private Integer zyonelook;//租用一级上线 1.已读 2.没有读
	private Integer zytwolook;//租用二级上线 1.已读 2.没有读
	private Integer gmonelook;//购买一级上线 1.已读 2.没有读
	private Integer gmtwolook;//购买二级上线 1.已读 2.没有读
	private String strwxid;
	private Double strmoney;
	private Date strtime;
	public Finance() {
	}
	
	public Finance(Integer id, String wxid, String xfonewxid, Double xfonemoney, String xftwowxid, Double xftwomoney,
			String zyonewxid, Double zyonemoney, String zytwowxid, Double zytwomoney, String gmonewxid,
			Double gmonemoney, String gmtwowxid, Double gmtwomoney, Integer type, Integer eid, Double emoney,
			Integer num, Double fund, Double ywfund, Double wxfund, Date time, Double operatingincome,
			Double platformincome, Integer xfonelook, Integer xftwolook, Integer zyonelook, Integer zytwolook,
			Integer gmonelook, Integer gmtwolook, String strwxid, Double strmoney, Date strtime) {
		this.id = id;
		this.wxid = wxid;
		this.xfonewxid = xfonewxid;
		this.xfonemoney = xfonemoney;
		this.xftwowxid = xftwowxid;
		this.xftwomoney = xftwomoney;
		this.zyonewxid = zyonewxid;
		this.zyonemoney = zyonemoney;
		this.zytwowxid = zytwowxid;
		this.zytwomoney = zytwomoney;
		this.gmonewxid = gmonewxid;
		this.gmonemoney = gmonemoney;
		this.gmtwowxid = gmtwowxid;
		this.gmtwomoney = gmtwomoney;
		this.type = type;
		this.eid = eid;
		this.emoney = emoney;
		this.num = num;
		this.fund = fund;
		this.ywfund = ywfund;
		this.wxfund = wxfund;
		this.time = time;
		this.operatingincome = operatingincome;
		this.platformincome = platformincome;
		this.xfonelook = xfonelook;
		this.xftwolook = xftwolook;
		this.zyonelook = zyonelook;
		this.zytwolook = zytwolook;
		this.gmonelook = gmonelook;
		this.gmtwolook = gmtwolook;
		this.strwxid = strwxid;
		this.strmoney = strmoney;
		this.strtime = strtime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getWxid() {
		return wxid;
	}
	public void setWxid(String wxid) {
		this.wxid = wxid;
	}
	public String getXfonewxid() {
		return xfonewxid;
	}
	public void setXfonewxid(String xfonewxid) {
		this.xfonewxid = xfonewxid;
	}
	public Double getXfonemoney() {
		return xfonemoney;
	}
	public void setXfonemoney(Double xfonemoney) {
		this.xfonemoney = xfonemoney;
	}
	public String getXftwowxid() {
		return xftwowxid;
	}
	public void setXftwowxid(String xftwowxid) {
		this.xftwowxid = xftwowxid;
	}
	public Double getXftwomoney() {
		return xftwomoney;
	}
	public void setXftwomoney(Double xftwomoney) {
		this.xftwomoney = xftwomoney;
	}
	public String getZyonewxid() {
		return zyonewxid;
	}
	public void setZyonewxid(String zyonewxid) {
		this.zyonewxid = zyonewxid;
	}
	public Double getZyonemoney() {
		return zyonemoney;
	}
	public void setZyonemoney(Double zyonemoney) {
		this.zyonemoney = zyonemoney;
	}
	public String getZytwowxid() {
		return zytwowxid;
	}
	public void setZytwowxid(String zytwowxid) {
		this.zytwowxid = zytwowxid;
	}
	public Double getZytwomoney() {
		return zytwomoney;
	}
	public void setZytwomoney(Double zytwomoney) {
		this.zytwomoney = zytwomoney;
	}
	public String getGmonewxid() {
		return gmonewxid;
	}
	public void setGmonewxid(String gmonewxid) {
		this.gmonewxid = gmonewxid;
	}
	public Double getGmonemoney() {
		return gmonemoney;
	}
	public void setGmonemoney(Double gmonemoney) {
		this.gmonemoney = gmonemoney;
	}
	public String getGmtwowxid() {
		return gmtwowxid;
	}
	public void setGmtwowxid(String gmtwowxid) {
		this.gmtwowxid = gmtwowxid;
	}
	public Double getGmtwomoney() {
		return gmtwomoney;
	}
	public void setGmtwomoney(Double gmtwomoney) {
		this.gmtwomoney = gmtwomoney;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public Double getEmoney() {
		return emoney;
	}
	public void setEmoney(Double emoney) {
		this.emoney = emoney;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Double getFund() {
		return fund;
	}
	public void setFund(Double fund) {
		this.fund = fund;
	}
	public Double getYwfund() {
		return ywfund;
	}
	public void setYwfund(Double ywfund) {
		this.ywfund = ywfund;
	}
	public Double getWxfund() {
		return wxfund;
	}
	public void setWxfund(Double wxfund) {
		this.wxfund = wxfund;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Double getOperatingincome() {
		return operatingincome;
	}
	public void setOperatingincome(Double operatingincome) {
		this.operatingincome = operatingincome;
	}
	public Double getPlatformincome() {
		return platformincome;
	}
	public void setPlatformincome(Double platformincome) {
		this.platformincome = platformincome;
	}
	public String getStrwxid() {
		return strwxid;
	}
	public void setStrwxid(String strwxid) {
		this.strwxid = strwxid;
	}
	public Double getStrmoney() {
		return strmoney;
	}
	public void setStrmoney(Double strmoney) {
		this.strmoney = strmoney;
	}
	public Date getStrtime() {
		return strtime;
	}
	public void setStrtime(Date strtime) {
		this.strtime = strtime;
	}
	public Integer getXfonelook() {
		return xfonelook;
	}
	public void setXfonelook(Integer xfonelook) {
		this.xfonelook = xfonelook;
	}
	public Integer getXftwolook() {
		return xftwolook;
	}
	public void setXftwolook(Integer xftwolook) {
		this.xftwolook = xftwolook;
	}
	public Integer getZyonelook() {
		return zyonelook;
	}
	public void setZyonelook(Integer zyonelook) {
		this.zyonelook = zyonelook;
	}
	public Integer getZytwolook() {
		return zytwolook;
	}
	public void setZytwolook(Integer zytwolook) {
		this.zytwolook = zytwolook;
	}
	public Integer getGmonelook() {
		return gmonelook;
	}
	public void setGmonelook(Integer gmonelook) {
		this.gmonelook = gmonelook;
	}
	public Integer getGmtwolook() {
		return gmtwolook;
	}
	public void setGmtwolook(Integer gmtwolook) {
		this.gmtwolook = gmtwolook;
	}
	@Override
	public String toString() {
		return "Finance [id=" + id + ", wxid=" + wxid + ", xfonewxid=" + xfonewxid
				+ ", xfonemoney=" + xfonemoney + ", xftwowxid=" + xftwowxid + ", xftwomoney=" + xftwomoney
				+ ", zyonewxid=" + zyonewxid + ", zyonemoney=" + zyonemoney + ", zytwowxid=" + zytwowxid
				+ ", zytwomoney=" + zytwomoney + ", gmonewxid=" + gmonewxid + ", gmonemoney=" + gmonemoney
				+ ", gmtwowxid=" + gmtwowxid + ", gmtwomoney=" + gmtwomoney + ", type=" + type + ", eid=" + eid
				+ ", emoney=" + emoney + ", num=" + num + ", fund=" + fund + ", ywfund=" + ywfund + ", wxfund=" + wxfund
				+ ", time=" + time + ", operatingincome=" + operatingincome + ", platformincome=" + platformincome
				+ ", strwxid=" + strwxid + ", strmoney=" + strmoney + ", strtime=" + strtime + "]";
	}
}
