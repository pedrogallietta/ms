package com.gallietta.rhfolhapagamento.negocio;


import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.gallietta.rhfolhapagamento.entidades.Pagamento;

@Service
public class PagamentoService {
    
    public Pagamento getPagamento(Long trabalhadorId, Integer dias) {
        return new Pagamento("Bob", new BigDecimal("200.00"), dias);
    }
    
}
