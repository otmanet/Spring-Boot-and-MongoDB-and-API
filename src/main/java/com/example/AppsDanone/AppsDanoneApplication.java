package com.example.AppsDanone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class AppsDanoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppsDanoneApplication.class, args);
	}

}
