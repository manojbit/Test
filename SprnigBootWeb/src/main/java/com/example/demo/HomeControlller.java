package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeControlller {
	
	@RequestMapping("home")
	public ModelAndView home() {
	
		System.out.println("Controller");
		ModelAndView mv = new ModelAndView();
		mv.addObject("name","helllluuulllll");
		mv.setViewName("home");
		return mv;	
		
	}
	
}
