package com.tly.model;

/**
 * 维修工单和维修人员对应查看已读或未读
 * @ClassName MemCorresonding
 * @Author yangweihang
 * @Date 2018年8月29日 下午2:16:32
 */
public class MemCorresonding {
	private Integer id;//id
	private Integer mid;//维修人员id
	private Integer emid;//维修工单id
	public MemCorresonding() {
	}
	public MemCorresonding(Integer id, Integer mid, Integer emid) {
		this.id = id;
		this.mid = mid;
		this.emid = emid;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public Integer getEmid() {
		return emid;
	}
	public void setEmid(Integer emid) {
		this.emid = emid;
	}
	@Override
	public String toString() {
		return "MemCorresonding [id=" + id + ", mid=" + mid + ", emid=" + emid + "]";
	}
}
