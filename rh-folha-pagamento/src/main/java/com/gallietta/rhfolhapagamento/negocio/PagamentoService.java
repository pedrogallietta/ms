package com.gallietta.rhfolhapagamento.negocio;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gallietta.rhfolhapagamento.entidades.Pagamento;
import com.gallietta.rhfolhapagamento.entidades.Trabalhador;

@Service
public class PagamentoService {
    
    @Value("${rh-trabalhador.host}")
    private String       trabalhadorHost;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public Pagamento getPagamento(Long trabalhadorId, Integer dias) {
        Map<String, String> variaveisUri = new HashMap<>();
        variaveisUri.put("id", trabalhadorId.toString());
        
        Trabalhador trabalhador = restTemplate.getForObject(trabalhadorHost + "trabalhadores/{id}", Trabalhador.class, variaveisUri);
        return new Pagamento(trabalhador.getNome(), trabalhador.getValorDiario(), dias);
    }
    
}
