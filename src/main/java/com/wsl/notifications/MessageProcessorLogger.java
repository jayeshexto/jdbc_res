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
		
		currentFlowName = 	notification.getResourceIdentifier();
	
		logger.info("ActionName:::"+notification.getActionName());
		logger.info("Event ID:::"+notification.getSource().getId());
		try {
			logger.info("Payload :::" + notification.getSource().getMessage().getPayloadAsString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
