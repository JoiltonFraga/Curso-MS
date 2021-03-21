package com.br.agarf.folhadepagamento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.agarf.folhadepagamento.feignclients.TrabalhadorFeignClients;
import com.br.agarf.folhadepagamento.model.Pagamento;
import com.br.agarf.folhadepagamento.model.Trabalhador;

@Service
public class FolhaDePagamento {
	
	@Autowired
	private TrabalhadorFeignClients trabalhadorFeignClients;

	public Pagamento getPagamento(Long idTrabalhador, int dias) {
		Trabalhador trabalhador = trabalhadorFeignClients.getById(idTrabalhador).getBody();
		return new Pagamento(trabalhador.getNome(),trabalhador.getSalario(),dias);
	}
}
