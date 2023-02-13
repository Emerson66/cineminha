package br.com.buritiscript.cineminha.ingressos;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Ingresso {
    
    private Long id;

    private Tipo tipo;

    private String documento;

    private Sessao sessao;

    @Deprecated
    public Ingresso (){

    }
}
