package com.user_interface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//Registering VehicleDepartment Service as a Eureka Client with the Eureka Server
@EnableEurekaClient
public class UserInterfaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserInterfaceApplication.class, args);
	}

}
