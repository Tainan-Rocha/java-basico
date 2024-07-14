package edu.tainan.stream_api.exercicios;

import java.util.Arrays;
import java.util.List;

// Utilize a Stream API para verificar se a lista 
// contém algum número maior que 10 e exiba o resultado no console.

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    
        // Verificar se pelo menos um numero e menor que 10
        boolean maioresQueDez = numeros.stream()
            .anyMatch(numero -> numero > 10);

        // Imprimir o resultado
        if (maioresQueDez) {
            System.out.println("A lista contem numero maior de que 10!");
        }
        else {
        System.out.println("A lista nao contem numero maior de que 10!");
        }
    }
}
