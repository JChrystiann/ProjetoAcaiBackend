package com.example.acai.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository rep;
	
	public Iterable<Pedido> getPedido() {
		return rep.findAll();
	}
	

	public Optional<Pedido> getPedidobyId(Long id) {
		return rep.findById(id);
	}

	public Optional<Pedido> getPedidobyMesa(Long mesa) {
		return rep.findByMesa(mesa);
		
	}

	

	public Pedido save(Pedido pedido) {
		return rep.save(pedido);
	
	}

	
}