 package com.alura.livrariaAlga.livraria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/livraria")
public class HomeController {
	
	@RequestMapping("/novo")
	 @GetMapping
	 public ModelAndView novo(){ 
		ModelAndView mv = new ModelAndView("/home");
		
		
		return mv;
	 }
}
