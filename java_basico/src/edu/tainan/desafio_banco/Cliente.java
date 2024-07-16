package edu.tainan.desafio_banco;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    // Atributos 
    private String nome;
    private List <Conta> conta = new ArrayList<>();

    // Construtor
    public Cliente(String nome) {
        this.nome = nome;
    }

    // Criando conta 
    public void atribuindoConta(Conta conta) {
        this.conta.add(conta); // Composicao da conta com cliente
        
    }

    // Mostrar dados da conta
    public void exibirDadosConta() {
        System.out.println("Dados da minha conta: ");
        for (Conta dados : conta) {
            System.out.println("Titular: " + nome);
            System.out.println("Agencia: " + dados.getAgencia());
            System.out.println("Numero da Conta: " + dados.getNumeroConta());
            System.out.println("Saldo: R$" + dados.getSaldo());
        }
    }
}
