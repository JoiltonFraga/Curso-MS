package com.br.agarf.folhadepagamento.model;

public class Pagamento {

	private String nome;
	private Double salario;
	private Integer dias;
	
	@Deprecated
	public Pagamento() {
		
	}

	public Pagamento(String nome, Double salario, Integer dias) {
		this.nome = nome;
		this.salario = salario;
		this.dias = dias;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}
	
	public double getTotal() {
		return dias*salario;
	}
}
