package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	@PostMapping("/add-user")
	@ResponseBody
	public String addUser(@RequestParam String uName, @RequestParam String aadharCardNo) {
		
		
		
		return "";
	}

}
