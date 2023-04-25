package com.axis.kafkaproducerconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	public static final String topic="Cricket";
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	public void publishToTopic(String message) {
		System.out.println("Publishing to Topic: "+topic);
		kafkaTemplate.send(topic, message);
		
	}

}
