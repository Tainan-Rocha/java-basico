package edu.tainan.stream_api.exercicios;

import java.util.Arrays;
import java.util.List;

// Utilize a Stream API para filtrar os números que estão 
// dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.

public class Desafio13 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

       // Definir os limites do intervalo
       int limiteInferior = 5;
       int limiteSuperior = 10;

       // Filtrar os números dentro do intervalo específico
       List<Integer> numerosFiltrados = numeros.stream()
           .filter(numero -> numero >= limiteInferior && numero <= limiteSuperior)
           .toList();

       // Imprimir o resultado
       System.out.println("Números no intervalo [" + limiteInferior + ", " + limiteSuperior + "]: " + numerosFiltrados);
    }
}
