package com.example.demo.web;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Products;

@RestController
@RequestMapping("/users")
public class userController {
	
	@RequestMapping(value ="/{id}" , method = RequestMethod.GET)
	public String displayid(@PathVariable int id)
	{ 
		return "user id : " + id;
	}
	@RequestMapping("/{id}/invoices")
	public String invoices(@PathVariable int id , 
			@RequestParam(value = "d" , required = false) Date dateorNull)
	{
		return "Invoices found.." + "userid::" + id + "on::" + dateorNull;
	}
	@RequestMapping("/{id}/items")
	public List<String> itemns(){
		return Arrays.asList("Squares","Circles" , "peanuts");
	}
	
	@RequestMapping("/{id}/products_as_json")
	public Products prod_json(){
		return new Products(3,"tags", 125.33);
	}
	

}
