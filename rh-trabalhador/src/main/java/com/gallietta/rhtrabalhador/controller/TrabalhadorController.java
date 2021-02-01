package com.gallietta.rhtrabalhador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gallietta.rhtrabalhador.entidades.Trabalhador;
import com.gallietta.rhtrabalhador.negocio.TrabalhadorService;

@RestController
@RequestMapping(value = "/trabalhadores")
public class TrabalhadorController {
    
    @Autowired
    private TrabalhadorService service;
    
    @GetMapping
    public ResponseEntity<List<Trabalhador>> buscaTodos() {
        List<Trabalhador> lista = service.buscarTodos();
        
        return ResponseEntity.ok(lista);
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<Trabalhador> buscaPorId(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(service.buscarPorId(id));
        } catch (Exception e) {
            return null;
        }
        
    }
}
