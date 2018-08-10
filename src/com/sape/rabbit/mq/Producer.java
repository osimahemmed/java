package com.sape.rabbit.mq;

import java.io.IOException;
import java.io.Serializable;

import org.apache.commons.lang3.SerializationUtils;

public class Producer extends EndPoint {

	public Producer(String endpointName) throws IOException {
		super(endpointName);
		// TODO Auto-generated constructor stub
	}
	
	public void sendMessage(Serializable object) throws IOException {
	    channel.basicPublish("",endPointName, null, SerializationUtils.serialize(object));
	}

}
