package edu.tainan.stream_api.exercicios;

import java.util.Arrays;
import java.util.List;

// Utilizando a Stream API, realize a soma dos números pares da lista \
// e exiba o resultado no console.

public class Desafio2 {
    public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    // Filtrar os números pares e somá-los
    int somaPares = numeros.stream()
        .filter(numero -> numero % 2 == 0) // Filtra apenas os números pares
        .reduce(0, Integer::sum); // Reduz (soma) os números pares

    // Imprimir o resultado da soma dos números pares
    System.out.println("Números ordenados: " + somaPares);
    }       
}
