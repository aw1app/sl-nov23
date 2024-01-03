package com.ecommerce.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

		//userRepositry.save(user);

		return "User with id=" + user.getID() + " is created. His aadhar card id=" + aadharCard.getID();
	}

	@GetMapping("/user-details")
	@ResponseBody
	public String userDetails(@RequestParam long id) {
		Optional<User> userFromRepo = userRepositry.findById(id);

		if (userFromRepo.isPresent()) {
			User user = userFromRepo.get();
			AadharCard aadhar = user.getAadharCard();
			List<MobilePhone> mobiles = user.getPhones();

			String mobilesStr = "";
			for (MobilePhone m : mobiles)
				mobilesStr = mobilesStr + " " + m.getNumber();

			String responseStr = "User with id=" + user.getID() + " is fetched. His/Her name is " + user.getName()
					+ " and His/Her aadhar card no=" + aadhar.getNumber() + "Mobiles= " + mobilesStr;
			return responseStr;
		} else {
			return "User with id=" + id + " not found";
		}

	}

}
