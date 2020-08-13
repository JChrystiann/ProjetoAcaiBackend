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

import com.example.acai.domain.Pedido;
import com.example.acai.domain.PedidoService;




@RestController
@RequestMapping("/api/v1/pedidos")
public class PedidoController {
	@Autowired
	private PedidoService service;
	
	@GetMapping()
	public Iterable<Pedido> get() {
		return service.getPedido();
		
	}
	
	@GetMapping("/{id}")
	public Optional<Pedido> get(@PathVariable("id")Long id) {
		return service.getPedidobyId(id);
		
	}
	
	@GetMapping("/mesa/{mesa}")
	public Optional<Pedido> getPedidoporMesa(@PathVariable("mesa")Long mesa) {
		return service.getPedidobyMesa(mesa);
		
	}
	@PostMapping
	public String post(@RequestBody Pedido pedido) {
		Pedido p= service.save(pedido);
		
		return "Pedido Realizado com Sucesso: Anote seu numero de Pedido: " + p.getId();
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
