package com.cts.oup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.netflix.ribbon.proxy.annotation.ClientProperties;
@EnableEurekaClient
@SpringBootApplication
public class OupplatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(OupplatformApplication.class, args);
	}

}
