package com.gmail.lan.cn;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("test")
public class Test {

	@RequestMapping("url")
	public String url() {
		return "test url";
	}

	@RequestMapping("home")
	String home() {
		return "test home";
	}
	
	@RequestMapping("git")
	String git() {
		return "test git";
	}
	
}
