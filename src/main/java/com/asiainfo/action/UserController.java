package com.asiainfo.action;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class UserController {
	@RequestMapping("/index")
	public String index() {
		return "hello123!";
	}

	public static void main(String[] args) {
		SpringApplication.run(UserController.class, args);
	}
}
