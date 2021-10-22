package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controller.User;

@SpringBootApplication
public class LombokTestKmkfApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokTestKmkfApplication.class, args);
		User u=new User();
		u.setName("nnjf");
		System.out.println(u.toString());
	}

}
