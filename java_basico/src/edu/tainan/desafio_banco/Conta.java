package edu.tainan.desafio_banco;

// Definindo uma classe abstrata
public abstract class Conta {
    
    // Atributos 
    private int agencia;
    private int numeroConta;
    private double saldo = 0;

    // Construtor
    protected Conta(int agencia, int numeroConta) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    // Getter
    public int getAgencia() {
        return agencia;
    }
    
    // Getter
    public int getNumeroConta() {
        return numeroConta;
    }

    // Getter
    public double getSaldo() {
        return saldo;
    }

    // Metodo para depositar valor na conta
    public void depositar(double valorDeposito){
        if (valorDeposito > 0) {
            saldo += valorDeposito;
            System.out.println("Deposito realizado com sucesso!");
        }
        else {
            System.out.println("Valor do deposito precisa ser maior que R$0,00");
        }
        exibirExtrato();
    }

    // Metodo para depositar valor na conta
    public void sacar(double valorSaque) {
        if (valorSaque > saldo) {
            System.out.println("Saldo insuficiente para saque!");
        }
        else if (valorSaque > 0) {
            saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso!");
        }
        else {
            System.out.println("Valor do saque precisa ser maior que R$0,00");
        }
        exibirExtrato();
    }

    // Metodo para depositar valor na conta
    public void transferir(double valorTransferencia, Conta contaDestino) {
        if (valorTransferencia > saldo) {
            System.out.println("Saldo insuficiente para transferencia!");
        }
        else if (valorTransferencia > 0) {
            this.sacar(valorTransferencia);
            contaDestino.depositar(valorTransferencia);
            System.out.println("Transferencia realizada com sucesso!");
        }
        else {
            System.out.println("Valor da transferencia precisa ser maior que R$0,00");
        }
        exibirExtrato();
    }

    // Metodo para imprimir saldo da conta
    public void exibirExtrato() {
        System.out.println("Saldo atual: R$" + saldo);
    }

}


