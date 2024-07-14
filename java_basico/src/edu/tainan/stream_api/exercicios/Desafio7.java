package edu.tainan.stream_api.exercicios;

import java.util.Arrays;
import java.util.List;

// Com a ajuda da Stream API, 
// encontre o segundo número maior da lista e exiba o resultado no console.

public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Retornando lista com segundo numero menor
        List<Integer> segundoNumeroMaior = numeros.stream()
            .distinct() // Removendo numeros duplicados
            .sorted((a, b) -> b - a) // Ordenando do maior para menor
            .skip(1) // Pulando um numero da lista
            .limit(1) // Retornando um numero da lista
            .toList(); // Retornando uma lista

        // Imprimir a lista ordenada
        System.out.println("Segundo numero maior na lista: " + segundoNumeroMaior.get(0));
    }   
}
