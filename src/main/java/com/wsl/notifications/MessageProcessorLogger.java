package com.wsl.notifications;

import org.apache.log4j.Logger;
import org.mule.api.context.notification.MessageProcessorNotificationListener;
import org.mule.api.processor.MessageProcessor;
import org.mule.context.notification.MessageProcessorNotification;



public class MessageProcessorLogger implements
		MessageProcessorNotificationListener<MessageProcessorNotification> {

	protected final static Logger logger = Logger.getLogger(MessageProcessorLogger.class);
	
	private String currentFlowName = null;
	
	@Override
	public void onNotification(MessageProcessorNotification notification) {
		// TODO Auto-generated method stub
		currentFlowName = 	notification.getResourceIdentifier();
		MessageProcessor messageProcessor = ((MessageProcessorNotification) notification).getProcessor();
		logger.info("MessageProcessor:" + messageProcessor.getClass().toString()+":::"+ currentFlowName);
		
		
	}

}
