package edu.tainan.estrutura_excecao;

import java.util.InputMismatchException;
// Importando classes
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // Estrutura inicial da excecao
        try{

        // Entrada de dados 
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();
        
        } // Caso apresente erro no bloco do "try", a instrução abaixo será chamada
        catch(InputMismatchException error){
        System.out.println("Favor digitar dados de forma númericas!");
        }
        
    }
}
