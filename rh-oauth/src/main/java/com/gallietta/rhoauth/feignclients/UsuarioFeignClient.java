package com.gallietta.rhoauth.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gallietta.rhoauth.entidades.Usuario;

@Component
@FeignClient(name = "rh-usuario", path = "/usuarios")
public interface UsuarioFeignClient {
    
    @GetMapping(value = "/search")
    ResponseEntity<Usuario> buscaPorEmail(@RequestParam String email);
    
}
