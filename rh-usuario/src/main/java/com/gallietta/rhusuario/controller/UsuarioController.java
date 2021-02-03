package com.gallietta.rhusuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gallietta.rhusuario.entidades.Usuario;
import com.gallietta.rhusuario.negocio.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioService service;
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<Usuario> buscaPorId(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(service.buscarPorId(id));
        } catch (Exception e) {
            return null;
        }
    }
    
    @GetMapping(value = "/search")
    public ResponseEntity<Usuario> buscaPorEmail(@RequestParam String email) {
        try {
            return ResponseEntity.ok(service.consultaPorEmail(email));
        } catch (Exception e) {
            return null;
        }
    }
    
}
