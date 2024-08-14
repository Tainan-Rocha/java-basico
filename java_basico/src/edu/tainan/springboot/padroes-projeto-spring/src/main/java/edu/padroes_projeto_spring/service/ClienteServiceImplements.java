package edu.padroes_projeto_spring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.padroes_projeto_spring.model.Cliente;
import edu.padroes_projeto_spring.model.ClienteRepository;
import edu.padroes_projeto_spring.model.Endereco;
import edu.padroes_projeto_spring.model.EnderecoRepository;

// Implementação da Strategy

@Service
public class ClienteServiceImplements implements ClienteService {
    
    // Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private ClienteRepository clienteRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private ViaCepService viaCepService;

	// Strategy: Implementar os métodos definidos na interface.
	// Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

	// Retorna todos os clientes cadastrados
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

	// Retorna um cliente de acordo com o ID.
    public Cliente buscarPorId(Long id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.get();
	}

	// Inseri um cliente no banco de dados
	public void inserir(Cliente cliente) {
		salvarClienteComCep(cliente);
	}

	// Deleta um cliente do banco de dados
    public void deletar(Long id) {
		clienteRepository.deleteById(id);
	}

	// Atualiza dados de um cliente
	public void atualizar(Long id, Cliente cliente) {
		Optional<Cliente> clienteBd = clienteRepository.findById(id);
		if (clienteBd.isPresent()) {
			salvarClienteComCep(cliente);
		}
	}

	// Metodo para salvar o cliente vinculando ao endereco
	private void salvarClienteComCep(Cliente cliente) {
		// Verificar se o Endereco do Cliente já existe (pelo CEP).
		String cep = cliente.getEndereco().getCep();
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
			// Caso não exista, integrar com o ViaCEP e persistir o retorno.
			Endereco novoEndereco = viaCepService.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});
		cliente.setEndereco(endereco);
		// Inserir Cliente, vinculando o Endereco (novo ou existente).
		clienteRepository.save(cliente);
	}
}
