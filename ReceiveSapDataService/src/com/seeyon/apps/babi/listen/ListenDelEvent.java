package com.seeyon.apps.babi.listen;

import com.seeyon.apps.collaboration.event.CollaborationStopEvent;
import com.seeyon.ctp.util.annotation.ListenEvent;


/**
 * 货款支付和预付款流程删除事件监听
 * @author BABIFOOD
 *
 */
public class ListenDelEvent {
	@ListenEvent(event=CollaborationStopEvent.class)
	public void HKandYFKDelEvent(){
		System.out.println("货款支付和预付款流程删除事件监听");
	}
}
