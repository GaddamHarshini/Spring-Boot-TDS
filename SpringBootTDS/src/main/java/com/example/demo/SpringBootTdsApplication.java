package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.capg.mycontroller")
@ComponentScan("com.capg.dao")
@ComponentScan("com.capg.service")
@ComponentScan("com.capg.dto")
@EntityScan(basePackages = {"com.capg.dto"})
@SpringBootApplication
public class SpringBootTdsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTdsApplication.class, args);
	}

}
