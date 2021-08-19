package com.example.demo.demos.provider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoProvider2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoProvider2Application.class, args);
	}

	@Bean
	public TestConfig testConfig() {
		return new TestConfig();
	}
}
