package com.alura.livrariaAlga.livraria.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alura.livrariaAlga.livraria.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto,Integer> {

}