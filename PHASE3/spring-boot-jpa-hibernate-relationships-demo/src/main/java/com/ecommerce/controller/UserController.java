package com.ecommerce.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ecommerce.entity.AadharCard;
import com.ecommerce.entity.MobilePhone;
import com.ecommerce.entity.User;
import com.ecommerce.repositry.AadharCardRepositry;
import com.ecommerce.repositry.MobilePhoneRepositry;
import com.ecommerce.repositry.UserRepositry;

@Controller
public class UserController {

	@Autowired
	UserRepositry userRepositry;

	@Autowired
	AadharCardRepositry aadharCardRepositry;

	@Autowired
	MobilePhoneRepositry mobilePhoneRepositry;

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

		return "User with id=" + user.getID() + " is created. His aadhar card id=" + aadharCard.getID();
	}

	@PostMapping("/add-user-with-mobiles")
	@ResponseBody
	public String addUserWithMobiles(@RequestParam String uName, @RequestParam long aadharCardNo,
			@RequestParam long mobileNo1, @RequestParam long mobileNo2) {

		User user = new User();
		user.setName(uName);

		AadharCard aadharCard = new AadharCard();
		aadharCard.setNumber(aadharCardNo);

		aadharCardRepositry.save(aadharCard); // This will create an id for the aadharCard object.

		user.setAadharCard(aadharCard);

		userRepositry.save(user);

		MobilePhone m1 = new MobilePhone();
		m1.setNumber(mobileNo1);
		m1.setUser(user);
		mobilePhoneRepositry.save(m1);

		MobilePhone m2 = new MobilePhone();
		m2.setNumber(mobileNo2);
		m2.setUser(user);
		mobilePhoneRepositry.save(m2);

		List<MobilePhone> mobiles = new ArrayList<MobilePhone>();
		mobiles.add(m1);
		mobiles.add(m2);

		user.setPhones(mobiles);

		// userRepositry.save(user);

		return "User with id=" + user.getID() + " is created. His aadhar card id=" + aadharCard.getID();
	}

	@GetMapping("/add-user-simplified-show-form")
	public String addUserWithMobiles(Model model) {
		User user = new User();
		model.addAttribute("user", user);

		return "new-user";
	}

	@PostMapping("/add-user-simplified-save")
	@ResponseBody
	public String addUserWithMobiles(@ModelAttribute("user") User user) {

		userRepositry.save(user);

		List<MobilePhone> mobiles = user.getPhones();

		for (MobilePhone m : mobiles) {
			m.setUser(user);
			mobilePhoneRepositry.save(m);
		}

		return "User " + user.getID() + " add success!";
	}

	// Try this when posting JSON content
//	@PostMapping("/add-user-simplified")
//	@ResponseBody
//	public String addUserWithMobiles(@RequestBody User user) {
//		userRepositry.save(user);
//		
//		return "User " +user.getID() +" add success!";
//	}

	@GetMapping("/user-details")
	public String userDetails(@RequestParam long id, ModelMap model) {
		Optional<User> userFromRepo = userRepositry.findById(id);

		model.addAttribute("id", id);

		if (userFromRepo.isPresent()) {
			User user = userFromRepo.get();

			model.addAttribute("user", user);

			AadharCard aadhar = user.getAadharCard();
			List<MobilePhone> mobiles = user.getPhones();

			String mobilesStr = "";
			for (MobilePhone m : mobiles)
				mobilesStr = mobilesStr + " " + m.getNumber();

			return "user-details";
		} else {
			return "user-not-found";
		}

	}

}
