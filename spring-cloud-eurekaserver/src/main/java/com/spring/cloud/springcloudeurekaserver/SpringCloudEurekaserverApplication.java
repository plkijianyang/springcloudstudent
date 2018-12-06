package com.spring.cloud.springcloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaserverApplication.class, args);
	}
}
