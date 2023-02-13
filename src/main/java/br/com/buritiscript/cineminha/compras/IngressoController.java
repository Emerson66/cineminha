package br.com.buritiscript.cineminha.compras;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponentsBuilder;

import jakarta.validation.Valid;

public class IngressoController {
    
    public ResponseEntity<?> compra(@RequestBody @Valid NovoIngressoRequest novoIngresso, UriComponentsBuilder uriBuilder){
        Ingresso ingresso = novoIngresso.toModel(sessaoRepository);
        ingressoRepository.save(ingresso);
    }
}
