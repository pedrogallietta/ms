package com.gallietta.rhfolhapagamento.entidades;

import java.io.Serializable;
import java.math.BigDecimal;

public class Trabalhador implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Long              id;
    private String            nome;
    private BigDecimal        valorDiario;
    
    public Trabalhador() {
        
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public BigDecimal getValorDiario() {
        return valorDiario;
    }
    
    public void setValorDiario(BigDecimal valorDiario) {
        this.valorDiario = valorDiario;
    }
    
}
