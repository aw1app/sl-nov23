package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecommerce.EProduct;
import com.ecommerce.dao.EProductDAO;

@Controller
public class EProductController {
	
	@Autowired
	EProductDAO eProductDAO;
	
	// Example http://localhost:8080/ecommerce/listProducts
		
	@RequestMapping(value ="/listProducts", method= RequestMethod.GET)
	public String listProducts(ModelMap model) {
		
		List<EProduct>  listOfProducts = eProductDAO.getProducts();
		
		model.addAttribute("prodlist" , listOfProducts);
		
		return "list-of-products"; // go to list-of-products.jsp
		
	}
	

}
