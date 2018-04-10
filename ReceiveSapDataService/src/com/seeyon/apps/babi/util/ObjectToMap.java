package com.seeyon.apps.babi.util;

import java.util.HashMap;
import java.util.Map;

import com.seeyon.apps.babi.pojo.SapReadHKZF;
import com.seeyon.apps.babi.pojo.SapReadYFK;

public class ObjectToMap {
	public static Map<String,Object> hkzfToMap(SapReadHKZF hkzf){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("fiowid", hkzf.getFiowid().trim());
		map.put("supplier_number", hkzf.getSupplier_number().trim());
		map.put("supplier_name", hkzf.getSupplier_name().trim());
		map.put("department", hkzf.getDepartment().trim());
		map.put("personnel_name", hkzf.getPersonnel_name().trim());
		map.put("bank_number", hkzf.getBank_number().trim());
		map.put("bank_name", hkzf.getBank_name().trim());
		map.put("explain", hkzf.getExplain().trim());
		map.put("evidence_type", hkzf.getEvidence_type().trim());
		map.put("currency", hkzf.getCurrency().trim());
		map.put("fapiao_date", hkzf.getFapiao_date().trim());
		map.put("sap_fapiao_number", hkzf.getSap_fapiao_number().trim());
		map.put("js_fapiao_number", hkzf.getJs_fapiao_number().trim());
		map.put("fapiao_money", hkzf.getFapiao_money().trim());
		map.put("remarks", hkzf.getRemarks().trim());
		map.put("yyf_money", hkzf.getYyf_money().trim());
		map.put("bqyf_money", hkzf.getBqyf_money().trim());
		map.put("corporation_number", hkzf.getCorporation_number().trim());
		map.put("corporation_name", hkzf.getCorporation_name().trim());
		map.put("yzf_money", hkzf.getYzf_money().trim());
		map.put("demand_date", hkzf.getDemand_date().trim());
		return map;
	}
	public static Map<String,Object> yfkToMap(SapReadYFK yfk){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("fiowid", yfk.getFiowid().trim());
		map.put("supplier_number", yfk.getSupplier_number().trim());
		map.put("supplier_name", yfk.getSupplier_name().trim());
		map.put("department", yfk.getDepartment().trim());
		map.put("personnel_id", yfk.getPersonnel_id().trim());
		map.put("personnel_name", yfk.getPersonnel_name().trim());
		map.put("bank_number", yfk.getBank_number().trim());
		map.put("bank_name", yfk.getBank_name().trim());
		map.put("explain", yfk.getExplain().trim());
		map.put("evidence_type", yfk.getEvidence_type().trim());
		map.put("currency", yfk.getCurrency().trim());
		map.put("yfklist", yfk.getYFKlist());
		map.put("accessory_amount", yfk.getAccessory_amount());
		map.put("corporation_number", yfk.getCorporation_number().trim());
		map.put("corporation_name", yfk.getCorporation_name().trim());
		map.put("yishifu_money", yfk.getYishifu_money().trim());
		map.put("demand_date", yfk.getDemand_date().trim());
		return map;
	}
}
