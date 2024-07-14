package edu.tainan.stream_api.functional_interface;

import java.util.Arrays;
import java.util.List;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */

public class PredicateExample {
    public static void main(String[] args) {

    // Criar uma lista de palavras
    List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

    // Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
    // imprimir cada palavra que passou no filtro
    palavras.stream()
        .filter(palavra -> palavra.length() > 5)
        .forEach(System.out::println);
        
    }
}
