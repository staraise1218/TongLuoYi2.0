package com.tly.model;

/**
 * @author moxiuchuan
 * 会员合伙人提成奖励对应表
 * 11点08分
 * 
 */
public class Commissionreward {
	/**
	 * 1.会员合伙人提成对应id
	 */
	private Integer id;
	
	/**
	 * 2.级别
	 */
	private Integer level;
	
	/**
	 * 3.身份
	 */
	private Integer identity;
	
	/**
	 * 4.一级消费提成
	 */
	private Double xfone;
	
	/**
	 * 5.二级消费提成
	 */
	private Double xftwo;
	
	/**
	 * 6.一级租用提成
	 */
	private Double zyone;
	
	/**
	 * 7.二级租用提成
	 */
	private Double zytwo;
	
	/**
	 * 8.一级销售提成
	 */
	private Double xsone;
	/**
	 * 9.一级销售提成
	 */
	private Double xstwo;
	
	private String strlevel;
	private String stridentity;

	public String getStrlevel() {
		return strlevel;
	}

	public void setStrlevel(String strlevel) {
		this.strlevel = strlevel;
	}

	public String getStridentity() {
		return stridentity;
	}

	public void setStridentity(String stridentity) {
		this.stridentity = stridentity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getIdentity() {
		return identity;
	}

	public void setIdentity(Integer identity) {
		this.identity = identity;
	}

	public Double getXfone() {
		return xfone;
	}

	public void setXfone(Double xfone) {
		this.xfone = xfone;
	}

	public Double getXftwo() {
		return xftwo;
	}

	public void setXftwo(Double xftwo) {
		this.xftwo = xftwo;
	}

	public Double getZyone() {
		return zyone;
	}

	public void setZyone(Double zyone) {
		this.zyone = zyone;
	}

	public Double getZytwo() {
		return zytwo;
	}

	public void setZytwo(Double zytwo) {
		this.zytwo = zytwo;
	}

	public Double getXsone() {
		return xsone;
	}

	public void setXsone(Double xsone) {
		this.xsone = xsone;
	}
	
	public Double getXstwo() {
		return xstwo;
	}

	public void setXstwo(Double xstwo) {
		this.xstwo = xstwo;
	}

	public Commissionreward() {
	}

	public Commissionreward(Integer id, Integer level, Integer identity, Double xfone, Double xftwo, Double zyone,
			Double zytwo, Double xsone, String strlevel, String stridentity, Double xstwo) {
		this.id = id;
		this.level = level;
		this.identity = identity;
		this.xfone = xfone;
		this.xftwo = xftwo;
		this.zyone = zyone;
		this.zytwo = zytwo;
		this.xsone = xsone;
		this.xsone = xstwo;
		this.strlevel = strlevel;
		this.stridentity = stridentity;
	}

	@Override
	public String toString() {
		return "Commissionreward [id=" + id + ", level=" + level + ", identity=" + identity + ", xfone=" + xfone
				+ ", xftwo=" + xftwo + ", zyone=" + zyone + ", zytwo=" + zytwo + ", xsone=" + xsone + ", strlevel="
				+ strlevel + ", stridentity=" + stridentity + "]";
	}
	
}
