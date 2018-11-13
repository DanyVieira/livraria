package com.alura.livrariaAlga.livraria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alura.livrariaAlga.livraria.model.Produto;
import com.alura.livrariaAlga.livraria.repository.ProdutoRepository;

@Service
public class CadastroProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Transactional
	public void salvar (Produto produto){
		produtoRepository.save(produto);
	}

}
