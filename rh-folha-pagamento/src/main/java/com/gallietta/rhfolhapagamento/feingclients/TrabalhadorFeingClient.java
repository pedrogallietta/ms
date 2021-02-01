package com.gallietta.rhfolhapagamento.feingclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.gallietta.rhfolhapagamento.entidades.Trabalhador;

@Component
@FeignClient(name = "rh-trabalhador", url = "localhost:8001", path = "/trabalhadores")
public interface TrabalhadorFeingClient {
    
    @GetMapping(value = "/{id}")
    ResponseEntity<Trabalhador> buscaPorId(@PathVariable Long id);
}
