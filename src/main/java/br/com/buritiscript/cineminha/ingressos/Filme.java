package br.com.buritiscript.cineminha.ingressos;

import ch.qos.logback.core.util.Duration;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Filme {
    private Long id;

    private String nome;
    private Duration duracao;

    @Deprecated
    public Filme (){}
}

