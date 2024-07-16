package edu.tainan.desafio_banco;

public class Main {
    public static void main(String[] args) {
        
        // Criando banco
        Banco santander = new Banco("Santander");
        Banco itau = new Banco("Itau");

        // Criando cliente
        Cliente cliente1 = new Cliente("Tainan");
        Cliente cliente2 = new Cliente("Lucas");

        // Criando conta
        Conta conta1 = new ContaCorrente(0001, 12345);
        Conta conta2 = new ContaCorrente(0001, 678910);

        // Atribuindo conta ao cliente.
        santander.criarConta(conta1, cliente1);
        itau.criarConta(conta2, cliente2);

        // Depositando saldo na conta
        conta1.depositar(500);

        // Sacando saldo da conta
        conta1.sacar(250);

        // Transferindo saldo para outra conta
        conta1.transferir(250, conta2);

        // Informacoes da conta
        cliente1.exibirDadosConta();
        cliente2.exibirDadosConta();
    }
}
