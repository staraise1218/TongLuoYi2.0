package com.tly.model;


/**
 * 会员钱包
 * @ClassName MemberWallet
 * @Author yangweihang
 * @Date 2018年8月24日 上午11:25:13
 */
public class MemberWallet {
	private Integer id;//id
	private String wxid;//会员微信id
	private Double money;//余额
	private Double withdrawdeposit;//已提现金额
	private Integer identity;//身份 1.会员 2.合伙人
	public MemberWallet() {
	}
	public MemberWallet(Integer id, String wxid, Double money, Double withdrawdeposit, Integer identity) {
		this.id = id;
		this.wxid = wxid;
		this.money = money;
		this.withdrawdeposit = withdrawdeposit;
		this.identity = identity;
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
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Double getWithdrawdeposit() {
		return withdrawdeposit;
	}
	public void setWithdrawdeposit(Double withdrawdeposit) {
		this.withdrawdeposit = withdrawdeposit;
	}
	public Integer getIdentity() {
		return identity;
	}
	public void setIdentity(Integer identity) {
		this.identity = identity;
	}
	@Override
	public String toString() {
		return "Memberwallet [id=" + id + ", wxid=" + wxid + ", money=" + money + ", withdrawdeposit=" + withdrawdeposit
				+ "]";
	}
}
