package com.tly.model;


/**
 * 设备
 * @ClassName Equipment
 * @Author yangweihang
 * @Date 2018年8月24日 上午11:23:25
 */
public class Equipment {
	private int id;//id
	private String name;//设备名称
	private String type;//设备型号
	private Double cashpledge;//押金	
	private Double price;//售价
	private String eimg;
	public Equipment() {
	}
	public Equipment(int id, String name, String type, Double cashpledge, Double price, String eimg) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.cashpledge = cashpledge;
		this.price = price;
		this.eimg = eimg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getCashpledge() {
		return cashpledge;
	}
	public void setCashpledge(Double cashpledge) {
		this.cashpledge = cashpledge;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getEimg() {
		return eimg;
	}
	public void setEimg(String eimg) {
		this.eimg = eimg;
	}
	@Override
	public String toString() {
		return "Equipment [id=" + id + ", name=" + name + ", type=" + type + ", cashpledge=" + cashpledge + ", price="
				+ price + ", eimg=" + eimg + "]";
	}
}
