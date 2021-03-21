package com.br.agarf.folhadepagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FolhadepagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FolhadepagamentoApplication.class, args);
	}

}
