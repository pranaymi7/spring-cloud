package com.pranaydawne007.discovery_client_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DiscoveryClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryClient2Application.class, args);
	}

}
