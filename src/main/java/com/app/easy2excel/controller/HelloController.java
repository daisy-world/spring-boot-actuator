package com.app.easy2excel.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
	
	@GetMapping("/test")
	
	public String test() {
		log.debug("inside test method of HelloController");
		return "spring boot  actuator demo project";
	}



}
