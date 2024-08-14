package edu.padroes_projeto_spring.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import edu.padroes_projeto_spring.model.Endereco;

// Client HTTP, criado via OpenFeign, para o consumo da API do ViaCEP.

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
    
    @GetMapping("/{cep}/json/")
	Endereco consultarCep(@PathVariable("cep") String cep);
}
