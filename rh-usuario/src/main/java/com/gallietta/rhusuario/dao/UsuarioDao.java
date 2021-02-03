package com.gallietta.rhusuario.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gallietta.rhusuario.entidades.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {
    
    Usuario findByEmail(String email);
    
}
