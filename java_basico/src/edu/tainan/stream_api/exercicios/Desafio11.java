package edu.tainan.stream_api.exercicios;

import java.util.Arrays;
import java.util.List;

// Utilizando a Stream API, encontre a soma dos quadrados 
// de todos os números da lista e exiba o resultado no console.

public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        // Encontrar a soma dos quadrados dos números
        int somaDosQuadrados = numeros.stream()
            .mapToInt(numero -> numero * numero)  // mapeia cada número para o seu quadrado
            .sum();  // soma os quadrados

        // Imprimir o resultado
        System.out.println("Soma dos quadrados dos números: " + somaDosQuadrados);
    }
}