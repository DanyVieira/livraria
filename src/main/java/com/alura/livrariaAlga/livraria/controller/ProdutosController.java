 package com.alura.livrariaAlga.livraria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alura.livrariaAlga.livraria.model.Produto;



@Controller

public class ProdutosController {
	
	@RequestMapping("/produtos/form")
	 @GetMapping
	 public ModelAndView novo(){ 
		ModelAndView mv = new ModelAndView("produtos/form");
		
		
		return mv;
	 }
	
	@RequestMapping("/produtos")
	 @GetMapping
	 public ModelAndView gravar(Produto produto){ 
		System.out.println(produto);
		ModelAndView mv = new ModelAndView("produtos/ok");
		
		
		return mv;
	 }
}
