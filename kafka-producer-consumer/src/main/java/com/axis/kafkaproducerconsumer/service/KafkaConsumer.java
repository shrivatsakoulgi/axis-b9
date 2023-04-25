package com.axis.kafkaproducerconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(topics="Cricket", groupId = "mygroup")
	public void consumeFromTopic(String message) {
		System.out.println("Consumed Message:"+message);
	}
}
