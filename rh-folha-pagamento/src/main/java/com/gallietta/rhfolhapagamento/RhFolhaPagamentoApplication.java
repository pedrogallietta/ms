package com.gallietta.rhfolhapagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient(name = "rh-trabalhador")
@EnableFeignClients
@SpringBootApplication
public class RhFolhaPagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhFolhaPagamentoApplication.class, args);
	}

}
