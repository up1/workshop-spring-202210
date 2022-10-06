package com.example.democall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoCallApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCallApplication.class, args);
	}

}
