package com.tly.model;

import java.util.Date;

/**
 * @author moxiuchuan
 * 设备申请实体类
 * 09点50分
 */
public class EquipmentApply {
	/**
	 * 申请id
	 */
	private Integer eaid;
	/**
	 * 买还是租 租为1 买为2
	 */
	private Integer eatype;
	/**
	 * 申请人的微信id
	 */
	private String wxid;
	/**
	 * 申请人姓名
	 */
	private String eaname;
	/**
	 * 申请人电话
	 */
	private String eatel;
	/**
	 * 申请人住址（该住址为他的经纬度）
	 */
	private String eaaddress;
	/**
	 * 使用类型 1.开店 2.自用
	 */
	private Integer eausetype;
	/**
	 * 申请时间
	 */
	private Date eatime;
	/**
	 * 是否通过(默认不通过) 1.通过 2.不通过
	 */
	private Integer eapass;
	public Integer getEaid() {
		return eaid;
	}
	public void setEaid(Integer eaid) {
		this.eaid = eaid;
	}
	public Integer getEatype() {
		return eatype;
	}
	public void setEatype(Integer eatype) {
		this.eatype = eatype;
	}
	public String getWxid() {
		return wxid;
	}
	public void setWxid(String wxid) {
		this.wxid = wxid;
	}
	public String getEaname() {
		return eaname;
	}
	public void setEaname(String eaname) {
		this.eaname = eaname;
	}
	public String getEatel() {
		return eatel;
	}
	public void setEatel(String eatel) {
		this.eatel = eatel;
	}
	public String getEaaddress() {
		return eaaddress;
	}
	public void setEaaddress(String eaaddress) {
		this.eaaddress = eaaddress;
	}
	public Integer getEausetype() {
		return eausetype;
	}
	public void setEausetype(Integer eausetype) {
		this.eausetype = eausetype;
	}
	public Date getEatime() {
		return eatime;
	}
	public void setEatime(Date eatime) {
		this.eatime = eatime;
	}
	public Integer getEapass() {
		return eapass;
	}
	public void setEapass(Integer eapass) {
		this.eapass = eapass;
	}
	@Override
	public String toString() {
		return "EquipmentApply [eaid=" + eaid + ", eatype=" + eatype + ", wxid=" + wxid + ", eaname=" + eaname
				+ ", eatel=" + eatel + ", eaaddress=" + eaaddress + ", eausetype=" + eausetype + ", eatime=" + eatime
				+ ", eapass=" + eapass + "]";
	}
	public EquipmentApply(Integer eaid, Integer eatype, String wxid, String eaname, String eatel, String eaaddress,
			Integer eausetype, Date eatime, Integer eapass) {
		super();
		this.eaid = eaid;
		this.eatype = eatype;
		this.wxid = wxid;
		this.eaname = eaname;
		this.eatel = eatel;
		this.eaaddress = eaaddress;
		this.eausetype = eausetype;
		this.eatime = eatime;
		this.eapass = eapass;
	}
	public EquipmentApply() {
		super();
		// TODO Auto-generated constructor stub
	}
}
