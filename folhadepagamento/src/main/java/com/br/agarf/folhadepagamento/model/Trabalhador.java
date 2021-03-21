package com.br.agarf.folhadepagamento.model;

public class Trabalhador {

	private Long id;
	private String nome;
	private Double salario;
	
	
	@Deprecated
	public Trabalhador() {
	}
	
	public Trabalhador(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
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

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
}
