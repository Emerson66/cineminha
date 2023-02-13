package br.com.buritiscript.cineminha.ingressos;

import jakarta.persistence.Entity;

@Entity
public class Sala {
    
    private Long id;

    private String nome;

    @Deprecated
    public Sala(){}
}
