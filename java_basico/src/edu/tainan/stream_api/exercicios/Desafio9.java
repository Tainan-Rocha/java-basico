package edu.tainan.stream_api.exercicios;

import java.util.Arrays;
import java.util.List;

// Com a Stream API, verifique se todos os números
// da lista são distintos (não se repetem) e exiba o resultado no console.

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosDistintos = numeros.stream()
            .distinct()  // Remover números duplicados
            .count() == numeros.size();  // Comparar o número de elementos distintos com o tamanho original da lista

        // Imprimir o resultado
        if (todosDistintos) {
            System.out.println("Todos os números são distintos (não se repetem).");
        } else {
            System.out.println("A lista contém números repetidos.");
        }
    }
}
