package edu.tainan.stream_api.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, 
 * ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */

public class ConsumerExample {
    public static void main(String[] args) {
        
        // Criar lista de numeros inteiros
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Usando o consumer  com expressao lambda para imprimir 
        Consumer<Integer> imprimirImpares = numero -> {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
        };

        // Usar Consumer para imprimir numeros no Stream
        listaNumeros.stream().forEach(imprimirImpares);
    }
}
