package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.domain.Userinput;


@Controller
public class homeController {
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("formData",new Userinput());
		return "index";
	}
	
	@RequestMapping(value ="/create" , method = RequestMethod.POST)
	public String result(Userinput userinput,RedirectAttributes attr) {
		attr.addFlashAttribute("userinput",userinput);
		return "redirect:/display";
	}
	
	@RequestMapping(value ="/display" , method = RequestMethod.GET)
	public String show(Userinput userinput) {
		return "result";
	}
	

}


