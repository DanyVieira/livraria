 package com.alura.livrariaAlga.livraria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alura.livrariaAlga.livraria.model.Produto;
import com.alura.livrariaAlga.livraria.repository.ProdutoRepository;
import com.alura.livrariaAlga.livraria.service.CadastroProdutoService;



@Controller
public class ProdutosController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private CadastroProdutoService cadastroPordutoService;
	
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
		cadastroPordutoService.salvar(produto);
		ModelAndView mv = new ModelAndView("produtos/ok");
		
		
		return mv;
	 }
}
