package edu.tainan.stream_api.exercicios;

import java.util.Arrays;
import java.util.List;

// Utilizando a Stream API, realize a soma dos dígitos 
// de todos os números da lista e exiba o resultado no console.

public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaTotal = numeros.stream()
            .mapToInt(Desafio8::somarDigitos)
            .sum();

        System.out.println("Soma total dos dígitos na lista: " + somaTotal);
    }

    // Método auxiliar para somar os dígitos de um número
    private static int somarDigitos(int numero) {
        
        // Converte o número para uma string, e então mapeia cada caractere para um inteiro
        // e soma esses inteiros
        return String.valueOf(numero).chars()
            .map(Character::getNumericValue)
            .sum();
    }
}
