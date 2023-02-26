package com.dv.projectmongo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class ProjectmongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectmongoApplication.class, args);
	}

}
