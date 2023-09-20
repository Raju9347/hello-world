package com.trying.hello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private static Logger log = LoggerFactory.getLogger(HelloController.class);

	@GetMapping(value = "/working")
	public String hello() {
		log.info("Working");
		return "Working";
	}

}
