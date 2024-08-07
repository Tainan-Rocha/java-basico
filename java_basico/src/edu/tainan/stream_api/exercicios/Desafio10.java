package edu.tainan.stream_api.exercicios;

import java.util.Arrays;
import java.util.List;

    //Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

    public class Desafio10 {
        public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

            // Verifica numeros multiplos de 3 ou 5
            List<Integer> numerosImparesMultiplo = numeros.stream()
                .filter(numero -> (numero % 3 == 0 || numero % 5 == 0)  && numero % 2 != 0 )
                .toList();

            System.out.println("Números ordenados: " + numerosImparesMultiplo);
        }
    }
