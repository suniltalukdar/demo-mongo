package com.example.demo.mongo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoMongoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = (ApplicationContext) SpringApplication.run(DemoMongoApplication.class, args);
	}

}