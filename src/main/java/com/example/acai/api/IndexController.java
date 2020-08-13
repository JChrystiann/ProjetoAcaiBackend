package com.example.acai.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

	@GetMapping
	public String get() {
		return "API DOS PEDIDOS";
	}
	
	
	
	
	
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
