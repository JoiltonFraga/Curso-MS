package com.br.agarf.folhadepagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient (name = "rh-trabalhador")
@EnableFeignClients
@SpringBootApplication
public class FolhadepagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FolhadepagamentoApplication.class, args);
	}

}
