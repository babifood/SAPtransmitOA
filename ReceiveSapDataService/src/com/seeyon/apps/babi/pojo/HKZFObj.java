package com.seeyon.apps.babi.pojo;

public class HKZFObj {
	private String fapiao_date;//发票日期
	private String sap_fapiao_number;//sap发票号
	private String js_fapiao_number;//金税发票号
	private String fapiao_money;//发票金额
	private String remarks;//备注
	public HKZFObj(String fapiaoDate, String sapFapiaoNumber,
			String jsFapiaoNumber, String fapiaoMoney, String remarks) {
		super();
		fapiao_date = fapiaoDate;
		sap_fapiao_number = sapFapiaoNumber;
		js_fapiao_number = jsFapiaoNumber;
		fapiao_money = fapiaoMoney;
		this.remarks = remarks;
	}
	public HKZFObj() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFapiao_date() {
		return fapiao_date;
	}
	public void setFapiao_date(String fapiaoDate) {
		fapiao_date = fapiaoDate;
	}
	public String getSap_fapiao_number() {
		return sap_fapiao_number;
	}
	public void setSap_fapiao_number(String sapFapiaoNumber) {
		sap_fapiao_number = sapFapiaoNumber;
	}
	public String getJs_fapiao_number() {
		return js_fapiao_number;
	}
	public void setJs_fapiao_number(String jsFapiaoNumber) {
		js_fapiao_number = jsFapiaoNumber;
	}
	public String getFapiao_money() {
		return fapiao_money;
	}
	public void setFapiao_money(String fapiaoMoney) {
		fapiao_money = fapiaoMoney;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
