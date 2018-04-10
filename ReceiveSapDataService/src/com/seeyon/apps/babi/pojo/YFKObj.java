package com.seeyon.apps.babi.pojo;


public class YFKObj {
	public YFKObj(String procurementDingdanNumber, String prepayMoney) {
		super();
		procurement_dingdan_number = procurementDingdanNumber;
		prepay_money = prepayMoney;
	}
	public YFKObj() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String procurement_dingdan_number;
	private String prepay_money;
	public String getProcurement_dingdan_number() {
		return procurement_dingdan_number;
	}
	public void setProcurement_dingdan_number(String procurementDingdanNumber) {
		procurement_dingdan_number = procurementDingdanNumber;
	}
	public String getPrepay_money() {
		return prepay_money;
	}
	public void setPrepay_money(String prepayMoney) {
		prepay_money = prepayMoney;
	}
	
}
