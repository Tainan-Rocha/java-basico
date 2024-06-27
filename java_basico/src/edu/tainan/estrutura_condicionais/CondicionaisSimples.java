package edu.tainan.estrutura_condicionais;

public class CondicionaisSimples {
    public static void main(String[] args) {

        // Variaveis
        double saldo = 50.00;
        double saque = 25.00;

        // Estrutura de condição simples(se)
        if (saque <= saldo) {
            saldo = saldo - saque;
        }

        // Imprimindo resutado
        System.out.println(saldo);
    }
    
}
