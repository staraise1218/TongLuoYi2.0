package com.tly.model;

import java.util.Date;

/**
 * 会员评价和留言
 * @ClassName EvaluationMassage
 * @Author yangweihang
 * @Date 2018年8月27日 下午2:15:42
 */
public class EvaluationMessage {
	private Integer emid;//id
	private Integer service;//服务
	private Integer effect;//功效
	private String part;//理疗部位
	private String leavemessage;//留言
	private String additionalcomments;//追加留言
	private Integer usid;//会员使用统计id
	private Integer look;//设置是否可见 1-可见 2-不可见
	private Date time;//时间
	public EvaluationMessage() {
	}
	public EvaluationMessage(Integer emid, Integer service, Integer effect, String part, String leavemessage,
			String additionalcomments, Integer usid, Integer look, Date time) {
		this.emid = emid;
		this.service = service;
		this.effect = effect;
		this.part = part;
		this.leavemessage = leavemessage;
		this.additionalcomments = additionalcomments;
		this.usid = usid;
		this.look = look;
		this.time = time;
	}
	public Integer getEmid() {
		return emid;
	}
	public void setEmid(Integer emid) {
		this.emid = emid;
	}
	public Integer getService() {
		return service;
	}
	public void setService(Integer service) {
		this.service = service;
	}
	public Integer getEffect() {
		return effect;
	}
	public void setEffect(Integer effect) {
		this.effect = effect;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getLeavemessage() {
		return leavemessage;
	}
	public void setLeavemessage(String leavemessage) {
		this.leavemessage = leavemessage;
	}
	public String getAdditionalcomments() {
		return additionalcomments;
	}
	public void setAdditionalcomments(String additionalcomments) {
		this.additionalcomments = additionalcomments;
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
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "EvaluationMassage [emid=" + emid + ", service=" + service + ", effect=" + effect + ", part=" + part
				+ ", leavemessage=" + leavemessage + ", additionalcomments=" + additionalcomments + ", usid=" + usid
				+ "]";
	}
}
