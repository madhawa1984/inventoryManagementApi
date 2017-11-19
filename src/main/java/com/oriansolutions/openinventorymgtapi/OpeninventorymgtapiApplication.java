package com.oriansolutions.openinventorymgtapi;

import com.oriansolutions.openinventorymgtapi.dto.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationProperties.class)
// this above line is very importsnt otherwise will not be able to load the applicatio-dev.yml to the Pojo
public class OpeninventorymgtapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpeninventorymgtapiApplication.class, args);
	}
}
