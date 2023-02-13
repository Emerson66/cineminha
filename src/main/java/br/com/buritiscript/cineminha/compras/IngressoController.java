package br.com.buritiscript.cineminha.compras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponentsBuilder;

import jakarta.validation.Valid;

public class IngressoController {
    
    
    private final IngressoRepository ingressoRepository;

    public IngressoController(SessaoRepository sessaoRepository,
                              IngressoRepository ingressoRepository) {

        this.sessaoRepository = sessaoRepository;
        this.ingressoRepository = ingressoRepository;
    }
    
    public ResponseEntity<?> compra(@RequestBody @Valid NovoIngressoRequest novoIngresso, UriComponentsBuilder uriBuilder){
        Ingresso ingresso = novoIngresso.toModel(sessaoRepository);
        ingressoRepository.save(ingresso);
    }
}
