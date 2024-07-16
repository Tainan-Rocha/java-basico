package edu.tainan.desafio_banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    // Atributos
    private String nome;
    private List <Conta> contas = new ArrayList<>();
    private List <Cliente> clientes = new ArrayList<>();

    // Getter
    public String getNome() {
        return nome;
    }

    // Construtor 
    public Banco(String nome) {
        this.nome = nome;
    }    

    // Criando conta e adicionado contas e clientes no banco
    public void criarConta(Conta conta, Cliente cliente) {
        this.contas.add(conta);
        this.clientes.add(cliente);
        cliente.atribuindoConta(conta);
    }
}
