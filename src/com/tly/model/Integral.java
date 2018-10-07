package com.tly.model;

import java.util.Date;

/**
 * 积分
 * @ClassName Integral
 * @Author yangweihang
 * @Date 2018年8月24日 上午11:24:21
 */
public class Integral {
	private Integer id;//id
	private String wxid;//会员微信id
	private Long consumption;//消费得到的积分 1
	private Long starrating;//星评得到的积分 2
	private Long leaveword;//留言得到的积分 3
	private Integer eid;//设备子表id
	private Date time;//时间
	private Date starttime;//星评的时间
	private Date leavetime;//留言的时间
	private Integer usid;//会员使用统计id
	private Integer look;//1已读 2没有读
	private String strtime;
	public Integral() {
	}
	public Integral(Integer id, String wxid, Long consumption, Long starrating, Long leaveword, Integer eid, Date time,
			Date starttime, Date leavetime, Integer usid, Integer look, String strtime) {
		this.id = id;
		this.wxid = wxid;
		this.consumption = consumption;
		this.starrating = starrating;
		this.leaveword = leaveword;
		this.eid = eid;
		this.time = time;
		this.starttime = starttime;
		this.leavetime = leavetime;
		this.usid = usid;
		this.look = look;
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
	public Long getConsumption() {
		return consumption;
	}
	public void setConsumption(Long consumption) {
		this.consumption = consumption;
	}
	public Long getStarrating() {
		return starrating;
	}
	public void setStarrating(Long starrating) {
		this.starrating = starrating;
	}
	public Long getLeaveword() {
		return leaveword;
	}
	public void setLeaveword(Long leaveword) {
		this.leaveword = leaveword;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public Date getLeavetime() {
		return leavetime;
	}
	public void setLeavetime(Date leavetime) {
		this.leavetime = leavetime;
	}
	public Integer getUsid() {
		return usid;
	}
	public void setUsid(Integer usid) {
		this.usid = usid;
	}
	public Integer getLook() {
		return look;
	}
	public void setLook(Integer look) {
		this.look = look;
	}
	public String getStrtime() {
		return strtime;
	}
	public void setStrtime(String strtime) {
		this.strtime = strtime;
	}
	@Override
	public String toString() {
		return "Integral [id=" + id + ", wxid=" + wxid + ", consumption=" + consumption + ", starrating=" + starrating
				+ ", leaveword=" + leaveword + ", eid=" + eid + ", time=" + time + ", starttime=" + starttime
				+ ", leavetime=" + leavetime + ", usid=" + usid + ", look=" + look + ", strtime=" + strtime + "]";
	}
}
