package com.RRPGAServer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v0")
public class firstController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello";
	}
}
