package com.axis.kafkaproducerconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.kafkaproducerconsumer.service.KafkaProducer;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
	
	@Autowired
	KafkaProducer producer;
	
	@GetMapping("/publish/{message}")
	public String sendMessage(@PathVariable String message) {
		producer.publishToTopic(message);
		return "'"+message+"' is published";
	}

}
