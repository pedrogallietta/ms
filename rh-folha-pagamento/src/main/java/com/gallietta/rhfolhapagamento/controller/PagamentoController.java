package com.gallietta.rhfolhapagamento.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gallietta.rhfolhapagamento.entidades.Pagamento;
import com.gallietta.rhfolhapagamento.negocio.PagamentoService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping(value = "/pagamentos")
public class PagamentoController {
    
    @Autowired
    private PagamentoService service;
    
    @HystrixCommand(fallbackMethod = "getPagamentoAlternativo")
    @GetMapping(value = "/{trabalhadorId}/dias/{dias}")
    public ResponseEntity<Pagamento> getPagamento(@PathVariable Long trabalhadorId, @PathVariable Integer dias) {
        Pagamento pagamento = service.getPagamento(trabalhadorId, dias);
        return ResponseEntity.ok(pagamento);
    }
    
    public ResponseEntity<Pagamento> getPagamentoAlternativo(Long trabalhadorId, Integer dias) {
        return ResponseEntity.ok(new Pagamento("RH Trabalhador fora do ar", BigDecimal.ZERO, 0));
    }
    
}
