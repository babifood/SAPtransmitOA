package com.seeyon.apps.babi.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class SapReadYFK {
	
	public SapReadYFK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SapReadYFK(String fiowid, String supplierNumber,
			String supplierName, String department, String personnelId,
			String personnelName, String bankNumber, String bankName,
			String explain, String evidenceType, String currency,
			List<YFKObj> yFKlist, String accessoryAmount,
			String corporationNumber, String corporationName,
			String yishifuMoney, String demandDate) {
		super();
		this.fiowid = fiowid;
		supplier_number = supplierNumber;
		supplier_name = supplierName;
		this.department = department;
		personnel_id = personnelId;
		personnel_name = personnelName;
		bank_number = bankNumber;
		bank_name = bankName;
		this.explain = explain;
		evidence_type = evidenceType;
		this.currency = currency;
		YFKlist = yFKlist;
		accessory_amount = accessoryAmount;
		corporation_number = corporationNumber;
		corporation_name = corporationName;
		yishifu_money = yishifuMoney;
		demand_date = demandDate;
	}
	private String fiowid;//流程编号
	private String supplier_number;//供应商编号
	private String supplier_name;//供应商名称
	private String department;//填报部门
	private String personnel_id;//经办人id
	private String personnel_name;//经办人
	private String bank_number;//开户行账号
	private String bank_name;//开户行
	private String explain;//预付款说明
	private String evidence_type;//凭证类型
//	private String procurement_number;//采购凭证编号
//	private String item_number;//项目编号
	private String currency;//币种
//	private String yjczdate;//预计结账日期
	
	private List<YFKObj> YFKlist;
	private String accessory_amount;//附件张数
	
	private String corporation_number;//公司编号
	private String corporation_name;//公司名称
	
	private String yishifu_money;//已实付的预付款金额
	private String demand_date;//要求付款时间
	
	
	public String getCorporation_number() {
		return corporation_number;
	}

	public void setCorporation_number(String corporationNumber) {
		corporation_number = corporationNumber;
	}

	public String getCorporation_name() {
		return corporation_name;
	}

	public void setCorporation_name(String corporationName) {
		corporation_name = corporationName;
	}

	public String getFiowid() {
		return fiowid;
	}
	public void setFiowid(String fiowid) {
		this.fiowid = fiowid;
	}
	public String getSupplier_number() {
		return supplier_number;
	}
	public void setSupplier_number(String supplierNumber) {
		supplier_number = supplierNumber;
	}
	public String getSupplier_name() {
		return supplier_name;
	}
	public void setSupplier_name(String supplierName) {
		supplier_name = supplierName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPersonnel_id() {
		return personnel_id;
	}
	public void setPersonnel_id(String personnelId) {
		personnel_id = personnelId;
	}
	public String getPersonnel_name() {
		return personnel_name;
	}
	public void setPersonnel_name(String personnelName) {
		personnel_name = personnelName;
	}
	public String getBank_number() {
		return bank_number;
	}
	public void setBank_number(String bankNumber) {
		bank_number = bankNumber;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bankName) {
		bank_name = bankName;
	}
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
	public String getEvidence_type() {
		return evidence_type;
	}
	public void setEvidence_type(String evidenceType) {
		evidence_type = evidenceType;
	}
//	public String getProcurement_number() {
//		return procurement_number;
//	}
//	public void setProcurement_number(String procurementNumber) {
//		procurement_number = procurementNumber;
//	}
//	public String getItem_number() {
//		return item_number;
//	}
//	public void setItem_number(String itemNumber) {
//		item_number = itemNumber;
//	}
	
	public String getCurrency() {
		return currency;
	}
	public String getYishifu_money() {
		return yishifu_money;
	}
	public void setYishifu_money(String yishifuMoney) {
		yishifu_money = yishifuMoney;
	}
	public String getDemand_date() {
		return demand_date;
	}
	public void setDemand_date(String demandDate) {
		demand_date = demandDate;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	@XmlElementWrapper(name="YFKlists")
	@XmlElement(name="YFKlist")
	public List<YFKObj> getYFKlist() {
		return YFKlist;
	}
	public void setYFKlist(List<YFKObj> yFKlist) {
		YFKlist = yFKlist;
	}
	public String getAccessory_amount() {
		return accessory_amount;
	}
	public void setAccessory_amount(String accessoryAmount) {
		accessory_amount = accessoryAmount;
	}
	
}
