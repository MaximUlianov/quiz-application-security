package com.ulianoff.quizapplication.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class QuizApplicationSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizApplicationSecurityApplication.class, args);
	}

}
