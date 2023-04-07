package com.demo;

import java.io.IOException;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.engine.Producer;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringBootWithKafkaApplication {
	public static void main(String[] args) {
		// SpringApplication.run(SpringBootWithKafkaApplication.class, args);
		// Producer producer = new Producer();
		// Consumer consumer = new Consumer();
		// (new SpringBootWithKafkaApplication()).run();
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Producer fooService = ctx.getBean(Producer.class);		
		fooService.sendMessage("Hello, Spring Kafka");
	}
}
