package com.example.day01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableFeignClients
public class Day01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context
				= SpringApplication.run(Day01Application.class, args);
		System.out.println(context.getBeanDefinitionCount());
	}

}
