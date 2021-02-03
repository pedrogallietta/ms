package com.gallietta.rhtrabalhador.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
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
    
    private static Logger      logger = LoggerFactory.getLogger(TrabalhadorController.class);
    
    @Value("${test.config}")
    private String             testConfig;
    
    @Autowired
    private Environment        env;
    
    @Autowired
    private TrabalhadorService service;
    
    @GetMapping(value = "/configs")
    public ResponseEntity<Void> getConfig() {
        logger.info("Config = " + testConfig);
        return ResponseEntity.noContent().build();
    }
    
    @GetMapping
    public ResponseEntity<List<Trabalhador>> buscaTodos() {
        List<Trabalhador> lista = service.buscarTodos();
        
        return ResponseEntity.ok(lista);
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<Trabalhador> buscaPorId(@PathVariable Long id) {
        logger.info("Port = " + env.getProperty("local.server.port"));
        
        try {
            return ResponseEntity.ok(service.buscarPorId(id));
        } catch (Exception e) {
            return null;
        }
        
    }
}
