package com.br.agarf.folhadepagamento.service;

import org.springframework.stereotype.Service;

import com.br.agarf.folhadepagamento.model.Pagamento;

@Service
public class FolhaDePagamento {

	public Pagamento getPagamento(Long idTrabalhador, int dias) {
		return new Pagamento("Bob", 200.0, dias);
	}
}
