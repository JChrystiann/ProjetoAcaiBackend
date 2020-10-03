package com.example.acai.domain.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.acai.domain.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long> {

	// Iterable<Pedido> findByMesa(Long mesa);

}
