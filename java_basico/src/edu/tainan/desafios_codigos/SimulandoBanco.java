package edu.tainan.desafios_codigos;

// Importando classe para ler entradas
import java.util.Scanner;

public class SimulandoBanco {

    // Metodo para retornar saldo atual e formatado
    public String imprimir_Saldo(double saldo){
        String saldo_Formatado = String.format("%.1f", saldo);
        return "Saldo atual: " + saldo_Formatado;
    }

    public static void main(String[] args) {
        // Criando objetos para ler entradas e chamar metodos
        Scanner scanner = new Scanner(System.in);
        SimulandoBanco conta = new SimulandoBanco();

        // Atribudos 
        double saldo = 0;
        boolean continuar = true;

        // Estrutura de repeticao
        while (continuar) {

            int opcao = scanner.nextInt();

            // Estrutura de condicao
            switch (opcao) {
                // Deposito
                case 1:
                    System.out.println("Digite o valor do seu deposito:");
                    double deposito = scanner.nextDouble();
                    if (deposito >= 0) {
                        saldo = saldo + deposito;
                        System.out.println(conta.imprimir_Saldo(saldo));
                    }
                    else {
                        System.out.println("Deposito invalido!");
                    }
                    break;
                // Saque
                case 2:
                    System.out.println("Digite o valor do seu saque:");
                    double saque = scanner.nextDouble();
                    if (saque >= 0 && saque <= saldo) {
                        saldo = saldo - saque;
                        System.out.println(conta.imprimir_Saldo(saldo));
                    }
                    else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                // Saldo
                case 3:
                    System.out.println(conta.imprimir_Saldo(saldo));
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
        
    }

}

