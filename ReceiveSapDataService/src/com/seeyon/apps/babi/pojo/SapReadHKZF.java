package com.seeyon.apps.babi.pojo;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class SapReadHKZF {
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
//	private List<HKZFObj> HKZFlist;
	
	private String fapiao_date;//发票日期
	private String sap_fapiao_number;//sap发票号
	private String js_fapiao_number;//金税发票号
	private String fapiao_money;//发票金额
	private String remarks;//备注
	private String yyf_money;//已支付预付金额
	private String bqyf_money;//付款申请金额
	
	private String corporation_number;//公司编号
	private String corporation_name;//公司名称
	
	private String yzf_money;//已支付货款金额
	private String demand_date;//要求付款时间
	public SapReadHKZF(String fiowid, String supplierNumber,
			String supplierName, String department, String personnelId,
			String personnelName, String bankNumber, String bankName,
			String explain, String evidenceType, String currency,
			String fapiaoDate, String sapFapiaoNumber, String jsFapiaoNumber,
			String fapiaoMoney, String remarks, String yyfMoney,
			String bqyfMoney, String corporationNumber, String corporationName,
			String yzfMoney, String demandDate) {
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
		fapiao_date = fapiaoDate;
		sap_fapiao_number = sapFapiaoNumber;
		js_fapiao_number = jsFapiaoNumber;
		fapiao_money = fapiaoMoney;
		this.remarks = remarks;
		yyf_money = yyfMoney;
		bqyf_money = bqyfMoney;
		corporation_number = corporationNumber;
		corporation_name = corporationName;
		yzf_money = yzfMoney;
		demand_date = demandDate;
	}

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

	public String getBqyf_money() {
		return bqyf_money;
	}

	public void setBqyf_money(String bqyfMoney) {
		bqyf_money = bqyfMoney;
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
	
	public SapReadHKZF() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getYzf_money() {
		return yzf_money;
	}

	public void setYzf_money(String yzfMoney) {
		yzf_money = yzfMoney;
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
//	@XmlElementWrapper(name="HKZFlists")
//	@XmlElement(name="HKZFlist")
//	public List<HKZFObj> getHKZFlist() {
//		return HKZFlist;
//	}
//	public void setHKZFlist(List<HKZFObj> hKZFlist) {
//		HKZFlist = hKZFlist;
//	}
	public String getYyf_money() {
		return yyf_money;
	}
	public void setYyf_money(String yyfMoney) {
		yyf_money = yyfMoney;
	}
}
