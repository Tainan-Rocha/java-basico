package edu.tainan.estrutura_condicionais;

public class CondicionaisEncadeadas {
    public static void main(String[] args) {
    
        // Variaveis
        int nota = 6;

        // Condição encadeada(se, se não se, se não)
        if (nota >= 7) {
            System.out.println("Aprovado");
        }
        else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Reprovado");
        }         
    }
}
