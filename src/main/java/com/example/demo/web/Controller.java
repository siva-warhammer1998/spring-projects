package com.example.demo.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class Controller {
	@RequestMapping(value = "/basic",method = RequestMethod.GET)
	public String ello() {
		return "hello world123";
		
	}
	
	@RequestMapping(value = "/bore",method = RequestMethod.GET)
	public String ello1() {
		return "<h1>hello world123</h1>";
		
	}
	
	@RequestMapping("/user")
	public String user() {
		return( "<form action=\"greetings/user_greeting\" method = GET>\r\n" + 
		"  <label for=\"fname\">First name:</label><br>\r\n" + 
		"  <input type=\"text\" id=\"fname\" name=\"fname\"><br>\r\n" + 
		"  <label for=\"lname\">Last name:</label><br>\r\n" + 
		"  <input type=\"text\" id=\"lname\" name=\"lname\"><br><br>\r\n" + 
		"  <input type=\"submit\" value=\"Submit\">\r\n" + 
		"</form>");
	}
	@RequestMapping(value = "/greetings/user_greeting", method = RequestMethod.GET)
	public String hi(@RequestParam String fname,@RequestParam String lname) {
		return "hello" + " " + fname + " " + lname;
	}
	
	
	@RequestMapping(value = "/orders/{id}" , method =RequestMethod.GET)
	public String Order(@PathVariable String id) {
		return "Order Placed: " + id ;	}	
	
	
	

}
