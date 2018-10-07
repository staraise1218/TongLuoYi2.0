package com.tly.model;

import java.util.Date;


/**
 * 合伙人
 * @ClassName Partner
 * @Author yangweihang
 * @Date 2018年8月24日 上午11:25:25
 */
public class Partner {
	private Integer id;//id
	private String wxid;//合伙人微信id
	private String nickname;//合伙人昵称
	private String name;//合伙人姓名
	private Integer sex;//1.男 2.女
	private String date;//出生日期
	private String phonenum;//手机号码
	private String city;//所在城市
	private Integer plid;//合伙人级别id 1.普通 2.金牌 3.钻石 4.超级
	private Date time;//加入时间
	private Integer mid;//会员id
	public Partner() {
	}
	public Partner(Integer id, String wxid, String nickname, String name, Integer sex, String date, String phonenum,
			String city, Integer plid, Date time, Integer mid) {
		this.id = id;
		this.wxid = wxid;
		this.nickname = nickname;
		this.name = name;
		this.sex = sex;
		this.date = date;
		this.phonenum = phonenum;
		this.city = city;
		this.plid = plid;
		this.time = time;
		this.mid = mid;
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPlid() {
		return plid;
	}
	public void setPlid(Integer plid) {
		this.plid = plid;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	@Override
	public String toString() {
		return "Partner [id=" + id + ", wxid=" + wxid + ", nickname=" + nickname + ", name=" + name + ", sex=" + sex
				+ ", date=" + date + ", phonenum=" + phonenum + ", city=" + city + ", plid=" + plid + ", time=" + time
				+ ", mid=" + mid + "]";
	}
}
