package com.example.acai.api.controller;

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

import com.example.acai.domain.model.Pedido;
import com.example.acai.domain.service.PedidoService;


@RestController
@RequestMapping("/api/v1/pedidos")
public class PedidoController {
	@Autowired
	private PedidoService service;
	
	@GetMapping()
	public List<Pedido> get() {
		return service.getPedido();
	}
	
//	@GetMapping("/{id}")
//	public Optional<Pedido> get(@PathVariable("id")Long id) {
//		return service.getPedidobyId(id);	
//	}
//	
//	
//	@PostMapping
//	public String post(@RequestBody Pedido pedido) {
//		Pedido p= service.save(pedido);
//		
//		return "Pedido Realizado com Sucesso: Anote seu numero de Pedido: " + p.getId();
//	}
//	
//	@PutMapping("/{id}")
//	public String atualizar(@PathVariable("id") Long id,@RequestBody Pedido pedido) {
//		Pedido p = service.update(pedido,id);
//		return "Pedido: "+ p.getId() +" Atualizado com Sucesso";
//	
//	}
//	
//	@DeleteMapping("/{id}")
//	public String deletar(@PathVariable("id")Long id) {
//		 service.delete(id);
//		 return "Pedido Deletado com Sucesso";
//		
//	}
	
	
	/*
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
