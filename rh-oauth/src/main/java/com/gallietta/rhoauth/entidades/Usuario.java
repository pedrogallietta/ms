package com.gallietta.rhoauth.entidades;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Usuario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Long              id;
    private String            nome;
    private String            email;
    private String            senha;
    
    private Set<Perfil>       perfis           = new HashSet<>();
    
    public Usuario() {
    }
    
    public Usuario(Long id, String nome, String email, String senha) {
        super();
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
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
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public Set<Perfil> getPerfis() {
        return perfis;
    }
}
