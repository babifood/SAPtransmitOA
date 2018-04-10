package com.seeyon.apps.babi.service;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.seeyon.apps.babi.dao.PersonnelDangAn;
import com.seeyon.apps.babi.pojo.SapReadHKZF;
import com.seeyon.apps.babi.pojo.SapReadYFK;
import com.seeyon.apps.babi.pojo.StateMessage;
import com.seeyon.apps.babi.util.AuthorityServiceTest;
import com.seeyon.apps.babi.util.GetXmlString;
import com.seeyon.apps.babi.util.MessageTempleteManager;
import com.seeyon.apps.babi.util.ObjectToMap;
import com.seeyon.client.CTPRestClient;

public class WebService {
	public static final Logger log = Logger.getLogger(WebService.class);
	/**
	 * 货款支付申请单
	 * 
	 * @param stsHKZFData
	 *            String 类型的xml
	 * @return StateMessage 类
	 */
	public StateMessage Read_HKZF_Data(String stsHKZFData) {
		log.debug("货款支付SAP数据"+stsHKZFData);
		StateMessage msg = new StateMessage();
		SapReadHKZF hkzf = null;
		try {
			JAXBContext context = JAXBContext.newInstance(SapReadHKZF.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			hkzf = (SapReadHKZF) unmarshaller.unmarshal(new StringReader(stsHKZFData));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (AuthorityServiceTest.getInstence().authenticate()) {
			try {
				CTPRestClient client = AuthorityServiceTest.getInstence().getClient();
				final String senderLoginName = new PersonnelDangAn().getPersonneInformation(hkzf.getPersonnel_id());
				// Map 传参方式
			    final String strxml = MessageTempleteManager.process("HKZF.ftl",ObjectToMap.hkzfToMap(hkzf));
				Map data = new HashMap() {
					{
						put("senderLoginName",senderLoginName);// 发起人登录名
						put("subject", "(系统推送)货款支付申请单"); // 协同的标题
						put("data",strxml);
						put("param","1");
					}
				};
				final String Template = "HKZFNEW001";//模板编号
				Long flowData = client.post("flow/"+Template, data,Long.class);// 创建成功以后对应的流程Id
				if (flowData != null && !"".equals(flowData)) {
					msg.setState("S");
					msg.setMessage("流程发起成功");
				} else {
					msg.setState("E");
					msg.setMessage("流程发起失败");
				}
			} catch (Exception e) {
				msg.setState("E");
				msg.setMessage("流程发起异常");
				e.printStackTrace();
			}
		} else {
			msg.setState("E");
			msg.setMessage("身份验证失败");
		}
		return msg;
	}

	/**
	 * 预付款申请单
	 * 
	 * @param stsYFKData
	 *            String 类型的xml
	 * @return StateMessage 类
	 */
	public StateMessage Read_YFK_Data(String stsYFKData) {
		log.debug("预付款SAP数据"+stsYFKData);
		StateMessage msg = new StateMessage();
		SapReadYFK yfk = null;
		try {
			JAXBContext context = JAXBContext.newInstance(SapReadYFK.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			yfk = (SapReadYFK) unmarshaller.unmarshal(new StringReader(stsYFKData.trim()));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (AuthorityServiceTest.getInstence().authenticate()) {
			try {
				CTPRestClient client = AuthorityServiceTest.getInstence().getClient();
				final String senderLoginName = new PersonnelDangAn().getPersonneInformation(yfk.getPersonnel_id());
				// Map 传参方式
			    final String strxml = MessageTempleteManager.process("YFK.ftl",ObjectToMap.yfkToMap(yfk));
				Map data = new HashMap() {
					{
						put("senderLoginName",senderLoginName);// 发起人登录名
						put("subject", "(系统推送)预付款申请单"); // 协同的标题
						put("data",strxml);
						put("param","1");
					}
				};
				final String Template = "YFKNEW001";//模板编号
				Long flowData = client.post("flow/"+Template, data,Long.class);// 创建成功以后对应的流程Id
				if (flowData != null && !"".equals(flowData)) {
					msg.setState("S");
					msg.setMessage("流程发起成功");
				} else {
					msg.setState("E");
					msg.setMessage("流程发起失败");
				}
			} catch (Exception e) {
				msg.setState("E");
				msg.setMessage("流程发起异常");
				e.printStackTrace();
			}
		} else {
			msg.setState("E");
			msg.setMessage("身份验证失败");
		}
		return msg;
	}
}
