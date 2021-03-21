package com.br.agarf.rhtrabalhador.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.agarf.rhtrabalhador.model.Trabalhador;
import com.br.agarf.rhtrabalhador.repository.TrabalhadorRepository;

@RestController
@RequestMapping("/trabalhador")
public class TrabalhadorController {
	
	
	private static Logger logger = LoggerFactory.getLogger(TrabalhadorController.class);
	
	//informações de contexto da aplicação
	@Autowired
	private Environment enviroment;

	@Autowired
	private TrabalhadorRepository trabalhadorRespository;
	
	@GetMapping
	public ResponseEntity<List<Trabalhador>> getAll(){
		  List<Trabalhador> trabalhadores = trabalhadorRespository.findAll();
		  return ResponseEntity.ok(trabalhadores);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Trabalhador> getById(@PathVariable Long id){
		
		//vai imprimir o número da porta que está rodando
		logger.info("port" + enviroment.getProperty("local.server.port"));
		
		 Trabalhador trabalhador = trabalhadorRespository.findById(id).get();
		 return ResponseEntity.ok(trabalhador);
	}
}
