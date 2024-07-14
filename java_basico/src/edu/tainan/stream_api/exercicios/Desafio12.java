package edu.tainan.stream_api.exercicios;

import java.util.Arrays;
import java.util.List;

// Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.

public class Desafio12 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontrar o produto de todos os números
        long produto = numeros.stream()
            .mapToLong(numero -> numero)  // converte para Long para evitar estouro
            .reduce(1L, (a, b) -> a * b);  // reduz a lista multiplicando cada elemento

        // Imprimir o resultado
        System.out.println("Produto de todos os números: " + produto);
    }
}
