package com.poc4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Poc4EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Poc4EurekaApplication.class, args);
	}

}
