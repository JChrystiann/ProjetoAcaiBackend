package com.example.acai.domain.model;

import java.time.ZonedDateTime;

public class Pedido {

	private Long id;

	private String nome;
	
	private ZonedDateTime horaPedido;
	
	private String tipoEntrega;
	
	private List<ItemPedido> itens;
	
	private ConfiguracaoPedido configuracaoPedido;

	private float valor;
	
	private String status;
	
	private String observacao;
	
	private Colaborador colaborador;

	private Venda venda;
	
	private Cliente cliente;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ZonedDateTime getHoraPedido() {
		return horaPedido;
	}

	public void setHoraPedido(ZonedDateTime horaPedido) {
		this.horaPedido = horaPedido;
	}

	public String getTipoEntrega() {
		return tipoEntrega;
	}

	public void setTipoEntrega(String tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	public ConfiguracaoPedido getConfiguracaoPedido() {
		return configuracaoPedido;
	}

	public void setConfiguracaoPedido(ConfiguracaoPedido configuracaoPedido) {
		this.configuracaoPedido = configuracaoPedido;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
