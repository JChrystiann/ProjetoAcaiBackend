package com.example.acai.produto;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repPr;
	
	public Iterable<Produto> getProduto() {
		return repPr.findAll();
	}
	

	public Optional<Produto> getProdutobyId(Long id) {
		return repPr.findById(id);
	}

	public Produto save(Produto produto) {
		return repPr.save(produto);
	}
}