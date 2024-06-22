package edu.tainan.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao_1 = true;
        boolean condicao_2 = false;

        if (condicao_1 && condicao_2){
            System.out.println("As duas condições são verdadeiras");
        }
        if (condicao_1 || condicao_2){
            System.out.println("Alguma das condições são verdadeiras");
        }
    }
}


// && seria "E" e || seria "OU"