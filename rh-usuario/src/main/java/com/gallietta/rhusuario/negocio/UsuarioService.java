package com.gallietta.rhusuario.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gallietta.rhusuario.dao.UsuarioDao;
import com.gallietta.rhusuario.entidades.Usuario;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioDao dao;
    
    public Usuario consultaPorEmail(String email) {
        return dao.findByEmail(email);
    }
    
    public Usuario buscarPorId(Long id) {
        return dao.findById(id).orElseThrow();
    }
    
}
