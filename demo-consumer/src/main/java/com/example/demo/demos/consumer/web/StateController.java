package com.example.demo.demos.consumer.web;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.dapr.client.DaprClient;
import io.dapr.client.domain.State;
import reactor.core.publisher.Mono;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@RestController
public class StateController {

	private static final String STORE_NAME = "statestore";

	private static final String KEY1 = "key1";

	@Resource
	private DaprClient daprClient;

	@RequestMapping("/getState")
	public Mono<String> getState() {
		Mono<State<String>> val = daprClient.getState(STORE_NAME, KEY1, String.class);
		return val.map(State::getValue);
	}

	@RequestMapping("/setState")
	public Mono<Void> setState(@RequestParam("val") String value) {
		return daprClient.saveState(STORE_NAME, KEY1, value);
	}
}
