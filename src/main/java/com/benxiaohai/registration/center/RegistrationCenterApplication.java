package com.benxiaohai.registration.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.PropertySource;

@EnableEurekaServer
@SpringBootApplication
@PropertySource(value = {"classpath:application-singleton.properties"})
public class RegistrationCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationCenterApplication.class, args);
	}

}
