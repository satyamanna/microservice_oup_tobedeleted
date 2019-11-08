package com.cts.oup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PlatformService1Application {

	public static void main(String[] args) {
		SpringApplication.run(PlatformService1Application.class, args);
	}

}
