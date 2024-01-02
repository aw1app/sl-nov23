package com.ecommerce.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
		
		aadharCardRepositry.save(aadharCard); // This will create an id for the aadharCard object.
		
		user.setAadharCard(aadharCard);
		
		userRepositry.save(user);
		
		return "User with id="+user.getID() + " is created. His aadhar card id="+aadharCard.getID();
	}
	
	@GetMapping("/user-details")
	@ResponseBody
	public String userDetails(@RequestParam long id) {
		Optional<User> userFromRepo = userRepositry.findById(id);
		
		if(userFromRepo.isPresent()) {
			User user = userFromRepo.get();
			AadharCard aadhar = user.getAadharCard();
			
			return "User with id="+user.getID() + " is fetched. His/Her name is "+user.getName() +  " and His/Her aadhar card no="+aadhar.getNumber();
		}
		else {
			return "User with id="+id +" not found";
		}
		
		
	}

}
