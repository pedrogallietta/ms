package com.gallietta.rhtrabalhador.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gallietta.rhtrabalhador.dao.TrabalhadorDAO;
import com.gallietta.rhtrabalhador.entidades.Trabalhador;

@Component
public class TrabalhadorService {
    
    @Autowired
    private TrabalhadorDAO dao;
    
    public List<Trabalhador> buscarTodos() {
        return dao.findAll();
    }
    
    public Trabalhador buscarPorId(Long id) {
        return dao.findById(id).orElseThrow();
    }
}
