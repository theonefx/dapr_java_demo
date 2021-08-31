package com.example.demo.demos.consumer.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@Controller
public class BindingController {

	@RequestMapping("/mybinding")
	@ResponseBody
	public String binding(@RequestBody String body) {
		System.out.println("mybinding:" + body);
		return "success";
	}

	@RequestMapping("/onevent")
	@ResponseBody
	public String onevent(@RequestBody String body) {
		System.out.println("onevent:" + body);
		return "success";
	}
}
