package com.example.acai.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.acai.domain.pedido.Pedido;
import com.example.acai.domain.pedido.PedidoService;
import com.example.acai.domain.venda.ServicoVenda;
import com.example.acai.domain.venda.Venda;
import com.example.acai.produto.Produto;
import com.example.acai.produto.ProdutoService;




@RestController
@RequestMapping("/api/v1/produtos")
public class ProdutoController {
	@Autowired
	private ProdutoService serviceP;
	
	@GetMapping()
	public Iterable<Produto> get() {
		return serviceP.getProduto();
	}
	
	@GetMapping("/{id}")
	public Optional<Produto> get(@PathVariable("id")Long id) {
		return serviceP.getProdutobyId(id);
	}
	
	@PostMapping
	public String post(@RequestBody Produto produto) {
		Produto v= serviceP.save(produto);
		return "Cadastrado com Sucesso";
	}
	
	/*
	@DeleteMapping("/{id}")
	public String deletar(@PathVariable("id")Long id) {
		 service.delete(id);
		 return "Pedido Deletado com Sucesso";
		
	}
	
	
	
	@PostMapping("/login")
	public String login(@RequestParam("login")String login, @RequestParam("senha")String senha) {
		return "Login: "+login+" Senha: "+ senha;
	}
	
	@GetMapping("/login/{login}/{senha}")
	public String loginPath(@PathVariable("login")String login, @PathVariable("senha")String senha) {
		return "Login: "+login+" Senha: "+ senha;
	}
	
	@GetMapping("/pedido/{id}")
	public String getPedidoById(@PathVariable("id") Long id) {
		return "Pedido: " + id;
	}
	
	
	@PostMapping
	public String post() {
		return "Post ao String Boot";
	}
	
	@PutMapping
	public String put() {
		return "Put String Boot";
	}
	
	@DeleteMapping
	public String delete() {
		return "Delete String Boot";
	}
	*/
}
