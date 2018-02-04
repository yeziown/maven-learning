package com.yezimvn.accountemail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountEmailApplication.class, args);
	}
}
