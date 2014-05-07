package com.wsl.notifications;

import org.apache.log4j.Logger;
import org.mule.api.context.notification.EndpointMessageNotificationListener;
import org.mule.context.notification.EndpointMessageNotification;

public class EndpointMessageLogger implements EndpointMessageNotificationListener<EndpointMessageNotification> {
	protected final static Logger logger = Logger.getLogger(EndpointMessageLogger.class);
	
	private String currentFlowName = null;
	
	@Override
	public void onNotification(EndpointMessageNotification notification) 
	{
			currentFlowName = 	notification.getResourceIdentifier();
			logger.info("Action Name:" + notification.getActionName() +"::: Endpoint name :::"+ notification.getEndpoint());
	}
	
	

}
