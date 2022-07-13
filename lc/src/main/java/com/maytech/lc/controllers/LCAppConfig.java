package com.maytech.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maytech.lc.api.UserInfoDTO;

@Controller
public class LCAppConfig {
	
	@RequestMapping("/")
	public String  showHomepage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
		
		return "home-page";
		
	}
	
	@RequestMapping("/process-homepage")
	public String showResult(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
		
		
		return "result-page";
	}
}
