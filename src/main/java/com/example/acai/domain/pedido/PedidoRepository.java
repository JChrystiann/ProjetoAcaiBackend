package com.example.acai.domain.pedido;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

	Iterable<Pedido> findByMesa(Long mesa);

}
