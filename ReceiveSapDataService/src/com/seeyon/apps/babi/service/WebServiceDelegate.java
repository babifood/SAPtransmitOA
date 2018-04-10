package com.seeyon.apps.babi.service;

import com.seeyon.apps.babi.pojo.StateMessage;

@javax.jws.WebService(targetNamespace = "http://service.babi.apps.seeyon.com/", serviceName = "WebServiceService", portName = "WebServicePort")
public class WebServiceDelegate {

	com.seeyon.apps.babi.service.WebService webService = new com.seeyon.apps.babi.service.WebService();

	public StateMessage Read_HKZF_Data(String stsHKZFData) {
		return webService.Read_HKZF_Data(stsHKZFData);
	}

	public StateMessage Read_YFK_Data(String stsYFKData) {
		return webService.Read_YFK_Data(stsYFKData);
	}

}