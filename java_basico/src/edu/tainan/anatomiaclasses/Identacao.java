package edu.tainan.anatomiaclasses;

public class Identacao {
    public static void main(String[] args) {
        int mediaNota = 6;
        if (mediaNota < 6)
            System.out.println("Reprovado!");
        else if (mediaNota == 6)
            System.out.println("Recuperação!");
        else    
            System.out.println("Aprovado!");
    }
}


// Basicamente, a indentação é uma forma hierárquica de organizar o código,
// tornando-o mais clean e legível. Ela ajuda a visualizar melhor a estrutura
// do código e a relação entre diferentes blocos de código. 