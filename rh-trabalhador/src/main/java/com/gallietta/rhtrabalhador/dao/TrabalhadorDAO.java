package com.gallietta.rhtrabalhador.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gallietta.rhtrabalhador.entidades.Trabalhador;

public interface TrabalhadorDAO extends JpaRepository<Trabalhador, Long> {
    
}
