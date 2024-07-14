package edu.tainan.stream_api.exercicios;

import java.util.Arrays;
import java.util.List;

// Com a Stream API, encontre a soma dos números da lista que são 
// divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.

public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    
        // Encontrando a soma dos números divisíveis por 3 e por 5
        int soma = numeros.stream()
                .filter(numero -> numero % 3 == 0 && numero % 5 == 0) // Filtrando números divisíveis por 3 e por 5
                .mapToInt(Integer::intValue) // Convertendo para um IntStream
                .sum(); // Somando os números
        
        // Exibindo o resultado
        System.out.println("Soma dos números divisíveis por 3 e por 5: " + soma);
    }
}
