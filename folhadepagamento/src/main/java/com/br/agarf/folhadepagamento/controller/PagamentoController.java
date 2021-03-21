package com.br.agarf.folhadepagamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.agarf.folhadepagamento.model.Pagamento;
import com.br.agarf.folhadepagamento.service.FolhaDePagamento;

@RestController
@RequestMapping("/pagamento")
public class PagamentoController {

	@Autowired
	private FolhaDePagamento folhaDePagamento;
	
	@GetMapping("/{idTrabalhador}/dias/{diasTrabalhados}")
	public ResponseEntity<Pagamento> getPagamento(@PathVariable Long idTrabalhador, 
			@PathVariable Integer diasTrabalhados){
		Pagamento pagamento = folhaDePagamento.getPagamento(idTrabalhador, diasTrabalhados);
		return ResponseEntity.ok(pagamento);
		
	}
}
