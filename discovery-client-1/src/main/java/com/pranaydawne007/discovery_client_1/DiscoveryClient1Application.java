package com.pranaydawne007.discovery_client_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DiscoveryClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryClient1Application.class, args);
	}

}
