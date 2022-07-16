package com.maytech.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maytech.lc.api.UserRegistrationDTO;

@Controller
public class RegistrationController {
	
	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO dto) {
		
		
		return "user-registration-page";
	}
	
	@RequestMapping("/registration-success")
	public String processUserReg(@ModelAttribute("userReg")UserRegistrationDTO dto) {
		
		System.out.println("Inside processUserReg method");
		return "registration-succes";
	}
}
