package com.example.demo.demos.provider;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */

@Controller
public class BasicController {

	private static final long INT_TIME = System.currentTimeMillis();

	/**
	 * k8s rediness probe
	 */
	@RequestMapping("/readiness")
	@ResponseBody
	public String readiness() {
		if (System.currentTimeMillis() - INT_TIME < TimeUnit.SECONDS.toMillis(10)) {
			throw new IllegalStateException("app is not ready");
		}
		return "success";
	}

	/**
	 * k8s rediness probe
	 */
	@RequestMapping("/liveness")
	@ResponseBody
	public String liveness() {
		return "success";
	}

}
