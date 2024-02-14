package com.example.demo;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloDockerController {
	
	UUID uuid = UUID.randomUUID(); 
	String randomServerNo = uuid.toString();
	
	@GetMapping("hello")
	@ResponseBody
	public String sayHello() {
		return randomServerNo + " : Hello Docker";
	}

}
