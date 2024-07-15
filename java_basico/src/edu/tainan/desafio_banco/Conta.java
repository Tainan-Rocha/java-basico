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
            Extrato();
        }
        else {
            System.out.println("Valor do deposito precisa ser maior que R$0,00");
        }
    }

    // Metodo para depositar valor na conta
    public void sacar(double valorSacar) {
        if (valorSacar > saldo) {
            System.out.println("Saldo insuficiente para saque!");
            Extrato();
        }
        else if (valorSacar > 0) {
            saldo -= valorSacar;
            System.out.println("Saque realizado com sucesso!");
            Extrato();
        }
        else {
            System.out.println("Valor do saque precisa ser maior que R$0,00");
        }
    }

    // Metodo para depositar valor na conta
    public void transferir(double valor_transferencia, Conta numerConta) {
        if (valor_transferencia > saldo) {
            System.out.println("Saldo insuficiente para transferencia!");
            Extrato();
        }
        else if (valor_transferencia > 0) {
            this.sacar(valor_transferencia);
            numerConta.depositar(valor_transferencia);
            System.out.println("Transferencia realizada com sucesso!");
            Extrato();
        }
        else {
            System.out.println("Valor da transferencia precisa ser maior que R$0,00");
        }
        
    }

    // Metodo para imprimir saldo da conta
    public void Extrato() {
        System.out.println("Saldo atual: R$" + saldo);
    }

}


