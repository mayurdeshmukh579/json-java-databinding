package com.maytech.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestControllers {
	
	@ResponseBody
	@RequestMapping("/test")
	public String sayHello() {
		return "Hello";
	}
}
