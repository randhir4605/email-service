package com.example.demo;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.example.Employee;

@Component
public class KafkaConsumer {

	@KafkaListener(topics = "employee-topic1", groupId = "employee-group")
	public void receive(ConsumerRecord<String, Employee> record) {
		Employee employee=record.value();
		System.out.println(employee.toString());
	}
}
