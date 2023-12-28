package com.ecommerce.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.entity.EProduct;
import com.ecommerce.repositry.EProductRepositry;

@Controller
public class ProductController {
	
	@Autowired
	EProductRepositry eProductRepositry;

	@GetMapping("/add-product")
	public String showNewProductForm(Model model) {

		EProduct new_product = new EProduct();
		model.addAttribute("product", new_product);

		return "new-product"; // go to new-product.jsp
	}
	
	

	@PostMapping("/add-product")
	public String addProduct(@ModelAttribute("product") EProduct product) {
		product.setDateAdded(new Date());

		eProductRepositry.save(product);
		
		return "new-product-added-success"; // go to new-product-added-success.jsp		
	}
	
	@GetMapping("/list-products")
	public String listProduct(Model model) {
		List<EProduct> products = eProductRepositry.findAll();
		
		model.addAttribute("prodlist", products);

		return "list-of-products"; // go to product-list.jsp
	}
	
			
	@GetMapping("/delete-product")
	public String listProduct(@RequestParam long id, Model model) {
		 Optional<EProduct> prodFromRepo = eProductRepositry.findById(id);
		 model.addAttribute("id", id);
		
		 if ( prodFromRepo.isPresent() ) {
			 eProductRepositry.deleteById(id);
		 }else {
			 return "delete-product-failed"; // go to delete-product-failed.jsp
		 };		

		return "delete-product-success"; // go to delete-product-success.jsp
	}
	
	

}
