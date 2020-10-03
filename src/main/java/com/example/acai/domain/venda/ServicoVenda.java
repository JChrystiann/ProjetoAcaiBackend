package com.example.acai.domain.venda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.example.acai.domain.model.Pedido;

@Service
public class ServicoVenda {

	@Autowired
	private ReposicaoVenda repV;

	public Iterable<Venda> getVenda() {

		return repV.findAll();
	}

	public Optional<Venda> getVendabyId(Long id) {
		return repV.findById(id);
	}

	public Venda save(Venda venda) {
		return repV.save(venda);
	}

	public Venda update(Venda venda, Long id) {
		Assert.notNull(id, "Erro ao Atualizar Registro");

		Optional<Venda> optional = getVendabyId(id);
		if (optional.isPresent()) {
			Venda vd = optional.get();
			vd.setStatusVenda(venda.getStatusVenda());
			vd.setLocalVenda(venda.getLocalVenda());
			vd.setTotalVenda(venda.getTotalVenda());
			repV.save(vd);
			return vd;
		} else {
			throw new RuntimeException("Não Foi Possivel Atualizar");
		}

		
	}

	/*
	 * private PedidoRepository rep;
	 * 
	 * public Iterable<Pedido> getPedido() { return rep.findAll(); }
	 * 
	 * 
	 * public Optional<Pedido> getPedidobyId(Long id) { return rep.findById(id); }
	 * 
	 * public Iterable<Pedido> getPedidobyMesa(Long mesa) { return
	 * rep.findByMesa(mesa);
	 * 
	 * }
	 * 
	 * 
	 * 
	 * public Pedido save(Pedido pedido) { return rep.save(pedido);
	 * 
	 * }
	 * 
	 * 
	 * public Pedido update(Pedido pedido, Long id) {
	 * Assert.notNull(id,"Erro ao Atualizar Registro");
	 * 
	 * Optional<Pedido> optional = getPedidobyId(id); if(optional.isPresent()) {
	 * Pedido pd = optional.get(); pd.setCliente(pedido.getCliente());
	 * pd.setColaborador(pedido.getColaborador());
	 * pd.setDataPedido(pedido.getDataPedido());
	 * pd.setHoraPedido(pedido.getHoraPedido()); pd.setMesa(pedido.getMesa());
	 * pd.setNome(pedido.getNome()); pd.setTotalPed(pedido.getTotalPed());
	 * pd.setNomeApPedido(pedido.getNomeApPedido());
	 * pd.setStatus(pedido.getStatus()); pd.setObsPedido(pedido.getObsPedido());
	 * 
	 * rep.save(pd); return pd; }else { throw new
	 * RuntimeException("Não Foi Possivel Atualizar"); }
	 * 
	 * 
	 * 
	 * }
	 * 
	 * public void delete(Long id) { Optional<Pedido> pedido = getPedidobyId(id);
	 * if(pedido.isPresent()) { rep.deleteById(id);
	 * 
	 * } }
	 */
}