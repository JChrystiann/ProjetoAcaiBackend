package com.example.acai.domain;

import javax.persistence.*;

@Entity  //Puxa toda a tabela para a classe
public class Pedido {
	@Id // informa que a variavel abaixo eh a variavel de identificação
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="idPed")//Caso a coluna possua outro nome na tabela
	private Long id;
	
	@Column(name="DescPedido")
	private String nome;
	
	@Column(name="fkMesa")
	private Long mesa;
	
	@Column(name="fkCliente")
	private Long cliente;
	
	@Column(name="fkColab")
	private Long colaborador;
	
	private float totalPed;
	private String dataPedido;
	private String horaPedido;
	
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}
	
	public Pedido(Long id, String nome, Long mesa, Long cliente, Long colaborador, float totalPed, String dataPedido,
			String horaPedido) {
		
		this.id = id;
		this.nome = nome;
		this.mesa = mesa;
		this.cliente = cliente;
		this.colaborador = colaborador;
		this.totalPed = totalPed;
		this.dataPedido = dataPedido;
		this.horaPedido = horaPedido;
	}

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
	public Long getMesa() {
		return mesa;
	}
	public void setMesa(Long mesa) {
		this.mesa = mesa;
	}
	public Long getCliente() {
		return cliente;
	}
	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}
	public Long getColaborador() {
		return colaborador;
	}
	public void setColaborador(Long colaborador) {
		this.colaborador = colaborador;
	}
	public float getTotalPed() {
		return totalPed;
	}
	public void setTotalPed(float totalPed) {
		this.totalPed = totalPed;
	}
	public String getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}
	public String getHoraPedido() {
		return horaPedido;
	}
	public void setHoraPedido(String horaPedido) {
		this.horaPedido = horaPedido;
	}
	
	
}
