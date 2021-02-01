package com.gallietta.rhfolhapagamento.negocio;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gallietta.rhfolhapagamento.entidades.Pagamento;
import com.gallietta.rhfolhapagamento.entidades.Trabalhador;
import com.gallietta.rhfolhapagamento.feingclients.TrabalhadorFeingClient;

@Service
public class PagamentoService {
    
    @Autowired
    private TrabalhadorFeingClient trabalhadorFeingClient;
    
    public Pagamento getPagamento(Long trabalhadorId, Integer dias) {
        Map<String, String> variaveisUri = new HashMap<>();
        variaveisUri.put("id", trabalhadorId.toString());
        
        Trabalhador trabalhador = trabalhadorFeingClient.buscaPorId(trabalhadorId).getBody();
        return new Pagamento(trabalhador.getNome(), trabalhador.getValorDiario(), dias);
    }
    
}
