package edu.padroes_projeto_spring.service;

import edu.padroes_projeto_spring.model.Cliente;


// Interface que define o padrão Strategy

public interface ClienteService {

    // Metodos a serem implementados

    Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);
    
}
