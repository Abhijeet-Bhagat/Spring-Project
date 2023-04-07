package com.sboot.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


import com.sboot.entity.DTOclass;

@Controller
public class LCController {
	
	String result;
	
	@GetMapping("/")
	public String homeController(@ModelAttribute("userdto") DTOclass dtoclass) {
		return "home-page";
	}
	
	@GetMapping("/result-page")
	public String resultController(@ModelAttribute("userdto") DTOclass dtoclass, Model model) {
		
		System.out.println("User name is: "+ dtoclass.getUserName());
//		System.out.println("Crush name is: "+ dtoclass.getCrushName());
		//using model interface we will pass the value to result-page
		
		String[] options = {"Friends", "GF/BF", "Enemies", "Just know each other"};
		Random rand = new Random();
		int i = rand.nextInt(4);
		
		if(dtoclass.getUserName().toLowerCase().equals("jaldu")) {
			result = "Jaldu you are GAY!!!!";
		}
		
		else {
			result = options[i];
		}
		
		model.addAttribute("result", result);
		
		return "result-page";
	}
}
