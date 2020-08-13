package com.example.acai.domain;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

	Optional<Pedido> findByMesa(Long mesa);

}
