package br.com.buritiscript.cineminha.compras;

import jakarta.persistence.Entity;

@Entity
public class NovoIngressoRequest {
    
    private Long sessaoId;

    private Tipo tipo;

    private String documento;

    public NovoIngressoRequest(Long sessaoId,
                               Tipo tipo,
                               String documento) {
        this.sessaoId = sessaoId;
        this.tipo = tipo;
        this.documento = documento;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", NovoIngressoRequest.class.getSimpleName() + "[", "]")
                .add("sessaoId=" + sessaoId)
                .add("tipo=" + tipo)
                .add("documento='" + documento + "'")
                .toString();
    }
}
