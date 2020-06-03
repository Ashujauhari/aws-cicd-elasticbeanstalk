package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HelloSpringBootWithWarApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootWithWarApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(HelloSpringBootWithWarApplication.class);
	}
}
