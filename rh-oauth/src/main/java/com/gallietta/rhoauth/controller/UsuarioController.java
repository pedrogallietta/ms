package com.gallietta.rhoauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gallietta.rhoauth.entidades.Usuario;
import com.gallietta.rhoauth.negocio.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioService service;
    
    @GetMapping(value = "/search")
    public ResponseEntity<Usuario> buscaPorEmail(@RequestParam String email) {
        try {
            return ResponseEntity.ok(service.buscaPorEmail(email));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        
    }
    
}
