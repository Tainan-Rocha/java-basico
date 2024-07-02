package edu.tainan.desafios_codigos;

import java.util.Scanner;

public class VerificadorElegibilidadeConta {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada
        int idade = scanner.nextInt();
        
        // Estrutura de repeticao
        if (idade >= 18)
            System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        else 
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
            
        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
    
}
