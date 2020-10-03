package com.example.acai.domain.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.example.acai.domain.model.Pedido;
import com.example.acai.domain.repository.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository rep;

	public List<Pedido> getPedido() {
		return rep.findAll();
	}

	public Optional<Pedido> getPedidobyId(Long id) {
		return rep.findById(id);
	}

	public Pedido save(Pedido pedido) {
		return rep.save(pedido);

	}

	public Pedido update(Pedido pedido, Long id) {
		Assert.notNull(id, "Erro ao Atualizar Registro");

		Optional<Pedido> optional = getPedidobyId(id);
		if (optional.isPresent()) {
			Pedido pd = optional.get();
			pd.setCliente(pedido.getCliente());
			pd.setColaborador(pedido.getColaborador());
			pd.setDataPedido(pedido.getDataPedido());
			pd.setHoraPedido(pedido.getHoraPedido());
			pd.setvenda(pedido.getvenda());
			pd.setNome(pedido.getNome());
			pd.setTotalPed(pedido.getTotalPed());
			pd.setNomeApPedido(pedido.getNomeApPedido());
			pd.setStatus(pedido.getStatus());
			pd.setObsPedido(pedido.getObsPedido());

			rep.save(pd);
			return pd;
		} else {
			throw new RuntimeException("Não Foi Possivel Atualizar");
		}

	}

	public void delete(Long id) {
		Optional<Pedido> pedido = getPedidobyId(id);
		if (pedido.isPresent()) {
			rep.deleteById(id);

		}
	}
}