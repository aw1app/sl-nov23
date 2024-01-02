package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ecommerce.entity.AadharCard;
import com.ecommerce.entity.User;
import com.ecommerce.repositry.AadharCardRepositry;
import com.ecommerce.repositry.UserRepositry;

@Controller
public class UserController {
	
	@Autowired
	UserRepositry userRepositry;
	
	@Autowired
	AadharCardRepositry aadharCardRepositry;
	
	
	@PostMapping("/add-user")
	@ResponseBody
	public String addUser(@RequestParam String uName, @RequestParam long aadharCardNo) {
		
		User user = new User();
		user.setName(uName);
		
		AadharCard aadharCard = new AadharCard();
		aadharCard.setNumber(aadharCardNo);
		
		aadharCardRepositry.save(aadharCard);
		
		user.setAadharCard(aadharCard);
		
		userRepositry.save(user);
		
		return "User with id="+user.getID() + " is created. His aadhar card id="+aadharCard.getID();
	}

}
