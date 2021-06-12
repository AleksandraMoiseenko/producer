package ru.kafka.producer.ru.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired
	private Producer producer;
	
	@PostMapping("/publish")
	public void sendMessage(@RequestParam String message) {
		producer.sendMessage(message);
	}

}
