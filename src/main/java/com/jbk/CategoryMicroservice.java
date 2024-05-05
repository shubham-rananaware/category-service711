package com.jbk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CategoryMicroservice {

	public static void main(String[] args) {
		SpringApplication.run(CategoryMicroservice.class, args);
		System.out.println("Started....");
	}

}
