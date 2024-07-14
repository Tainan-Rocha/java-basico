package edu.tainan.stream_api.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Utilize a Stream API para remover 
// os valores ímpares da lista e imprima a lista resultante no console.

public class Desafio4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Removendo valores impares e adicionando em uma lista.
        List<Integer> removendoImpares = numeros.stream()
            .filter(numero -> numero % 2 == 0)
            .collect(Collectors.toList());

        // Imprimir a nova lista sem os valores impares
        System.out.println("Lista sem valores impares: " + removendoImpares);
    }
}
