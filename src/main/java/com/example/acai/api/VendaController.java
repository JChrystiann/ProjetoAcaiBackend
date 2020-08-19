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




@RestController
@RequestMapping("/api/v1/vendas")
public class VendaController {
	@Autowired
	private ServicoVenda serviceV;
	
	@GetMapping()
	public Iterable<Venda> get() {
		return serviceV.getVenda();
		
	}
	
	@GetMapping("/{id}")
	public Optional<Venda> get(@PathVariable("id")Long id) {
		return serviceV.getVendabyId(id);
		
	}
	
	
	
	
	
	@PostMapping
	public String post(@RequestBody Venda venda) {
		Venda v= serviceV.save(venda);
		
		return "Venda Nº " + v.getIdVenda() + " Cadastrada com Sucesso:  ";
	}
	
	/*
	@PutMapping("/{id}")
	public String atualizar(@PathVariable("id") Long id,@RequestBody Pedido pedido) {
		Pedido p = service.update(pedido,id);
		return "Pedido: "+ p.getId() +" Atualizado com Sucesso";
	
	}
	
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
