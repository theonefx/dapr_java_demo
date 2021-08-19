package com.example.demo.demos.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.dapr.client.DaprClient;
import io.dapr.client.DaprClientBuilder;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@Configuration
public class DaprConfig {

	@Bean
	public DaprClient daprClient() {
		DaprClient client = new DaprClientBuilder().build();
		client.waitForSidecar(30000).block();
		return client;
	}
}
