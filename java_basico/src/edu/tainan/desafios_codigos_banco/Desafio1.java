package edu.tainan.desafios_codigos_banco;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        String titular = scanner.next();
        int numeroConta = scanner.nextInt();
        double saldo = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();

        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

        System.out.println("Conta Poupanca:");
        contaPoupanca.exibirInformacoes();
        
        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class ContaBancaria {
    protected int numero;
    protected String titular;
    protected double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
    }
}

class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    // Construtor
    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros; // Adicionando um novo parametro na subclasse
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        // Adicionando uma informacao a mais no metodo 
        System.out.println("Taxa de juros: " + this.taxaJuros+ "%");
    }
}
