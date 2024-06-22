package edu.tainan.operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int numero = 24; // Declarando numero 
        numero = - numero; // Transformando numero positivo em negativo
        System.out.println(numero); // Retorno = -24

        numero = numero * -1; // Transformando numero negativo em positivo
        System.out.println(numero); // Retorno = 24

        // Incremento e decremento 

        numero = 0;
        int novoNumero = ++numero; // novoNumero será 1, numero será 1

        numero = 0;
        int novoNumero_2 = numero++; // novoNumero será 0, numero será 1

        numero = 0;
        int novoNumero_3 = numero--; // novoNumero será 0, numero será -1

        // Operador unário lógico de negação

        boolean verdadeiro = true;
        boolean falso = !verdadeiro; // Retorna false

    }
}
