package com.example.acai.domain.venda;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
public class Venda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVenda;
	
	
	private String localVenda,statusVenda;
	private float totalVenda;
	
	public Venda() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Venda(Long idVenda, String localVenda, String statusVenda, float totalVenda) {
		
		this.idVenda = idVenda;
		this.localVenda = localVenda;
		this.statusVenda = statusVenda;
		this.totalVenda = totalVenda;
	}


	public Long getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(Long idVenda) {
		this.idVenda = idVenda;
	}
	public String getLocalVenda() {
		return localVenda;
	}
	public void setLocalVenda(String localVenda) {
		this.localVenda = localVenda;
	}
	public String getStatusVenda() {
		return statusVenda;
	}
	public void setStatusVenda(String statusVenda) {
		this.statusVenda = statusVenda;
	}
	public float getTotalVenda() {
		return totalVenda;
	}
	public void setTotalVenda(float totalVenda) {
		this.totalVenda = totalVenda;
	}
	
}
