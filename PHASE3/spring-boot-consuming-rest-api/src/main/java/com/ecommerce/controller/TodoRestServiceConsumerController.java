package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.entity.Todo;

@Controller
public class TodoRestServiceConsumerController {
	
	
		
	@GetMapping("/todos/{id}")
	@ResponseBody
	public String todo(@PathVariable("id") int id, Model model) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		Todo todo = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/"+id, Todo.class);
		
		return todo.toString();
		
	}

}
