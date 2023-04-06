package com.sboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.sboot.entity.DTOclass;

@Controller
public class LCController {
	
	@GetMapping("/")
	public String homeController(@ModelAttribute("userdto") DTOclass dtoclass) {
		return "home-page";
	}
	
	@GetMapping("/result-page")
	public String resultController(@ModelAttribute("userdto") DTOclass dtoclass) {
//		System.out.println("User name is: "+ dtoclass.getUserName());
//		System.out.println("Crush name is: "+ dtoclass.getCrushName());
		
		//using model interface we will pass the value to result-page
		return "result-page";
	}
}
