package com.gallietta.rhoauth.negocio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gallietta.rhoauth.entidades.Usuario;
import com.gallietta.rhoauth.feignclients.UsuarioFeignClient;

@Service
public class UsuarioService {
    
    private static Logger      logger = LoggerFactory.getLogger(UsuarioService.class);
    
    @Autowired
    private UsuarioFeignClient usuarioFeignClient;
    
    public Usuario buscaPorEmail(String email) {
        Usuario usuario = usuarioFeignClient.buscaPorEmail(email).getBody();
        if (usuario == null) {
            logger.error("Email não encontrado: " + email);
            throw new IllegalArgumentException("Email não encontrado");
        }
        logger.info("Email encontrado: " + email);
        return usuario;
    }
}
