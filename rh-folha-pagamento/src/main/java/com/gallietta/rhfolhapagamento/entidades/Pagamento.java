package com.gallietta.rhfolhapagamento.entidades;

import java.io.Serializable;
import java.math.BigDecimal;

public class Pagamento implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String            nome;
    private BigDecimal        valorDiario;
    private Integer           dias;
    
    public Pagamento() {
    }
    
    public Pagamento(String nome, BigDecimal valorDiario, Integer dias) {
        super();
        this.nome = nome;
        this.valorDiario = valorDiario;
        this.dias = dias;
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
    
    public Integer getDias() {
        return dias;
    }
    
    public void setDias(Integer dias) {
        this.dias = dias;
    }
    
    public BigDecimal getValorTotal() {
        return valorDiario.multiply(new BigDecimal(dias));
    }
    
}
