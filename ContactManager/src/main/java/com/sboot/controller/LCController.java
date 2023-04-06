package com.sboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sboot.entity.DTOclass;

@Controller
public class LCController {
	
	@GetMapping("/")
	public String homeController() {
		return "home-page";
	}
	
	@GetMapping("/result-page")
	public String resultController(DTOclass dtoClass, Model model) {
		System.out.println("User name is: "+ dtoClass.getUserName());
		System.out.println("Crush name is: "+ dtoClass.getCrushName());
		
		//using model interface we will pass the value to result-page
		model.addAttribute("dto", dtoClass);
		return "result-page";
	}
}
