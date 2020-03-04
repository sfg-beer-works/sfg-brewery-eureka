package com.github.sfgbeerworks.sfgbreweryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SfgBreweryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfgBreweryEurekaApplication.class, args);
	}

}
