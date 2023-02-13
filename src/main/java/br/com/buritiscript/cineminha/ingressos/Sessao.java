package br.com.buritiscript.cineminha.ingressos;

import java.math.BigDecimal;
import java.time.LocalTime;

import jakarta.persistence.Entity;

@Entity
public class Sessao {

    private Long id;

    private LocalTime horario;

    private Sala sala;

    private Filme Filme;

    private BigDecimal preco;

    @Deprecated
    public Sessao (){}
}
