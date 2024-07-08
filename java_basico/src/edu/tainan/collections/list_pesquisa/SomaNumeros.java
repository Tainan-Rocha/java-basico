package edu.tainan.collections.list_pesquisa;

import java.util.ArrayList;
import java.util.List;

// Crie uma classe chamada "SomaNumeros" que possui uma lista de números inteiros como atributo. 
// Implemente os seguintes métodos:

//     adicionarNumero(int numero): Adiciona um número à lista de números.
//     calcularSoma(): Calcula a soma de todos os números na lista e retorna o resultado.
//     encontrarMaiorNumero(): Encontra o maior número na lista e retorna o valor.
//     encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.
//     exibirNumeros(): Retorna uma lista contendo todos os números presentes na lista.


public class SomaNumeros {

    //atributos
    private List<Integer> listaNumeros;

    //construtor
    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    // ToString
    @Override
    public String toString() {
        return "SomaNumeros [listaNumeros=" + listaNumeros + "]";
    }    

    // Adicionando numero na lista
    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    // Somando numeros da lista.
    public int calcularSoma() {
        int totalNumeros = 0;
        for (int numero : listaNumeros) {
            totalNumeros += numero;
        }
        return totalNumeros;
    }

    // Retorna o numero maior
    public int encontrarMaiorNumero() {
        int comparadorNumero = Integer.MIN_VALUE;
        for (int numero : listaNumeros) {
            if (numero > comparadorNumero) {
                comparadorNumero = numero;
            }
        }
        return comparadorNumero;
    }

        // Retorna o numero maior
        public int encontrarMenorNumero() {
            int comparadorNumero = Integer.MAX_VALUE;
            for (int numero : listaNumeros) {
                if (numero < comparadorNumero) {
                    comparadorNumero = numero;
                }
            }
            return comparadorNumero;
        }
    // Exibir numeros
    public void exibirNumero() {
        System.out.println(listaNumeros);
    }

    // Realizando metodos
    public static void main(String[] args) {
        SomaNumeros listaNumeros = new SomaNumeros();
        
        listaNumeros.adicionarNumero(5);
        listaNumeros.adicionarNumero(2);
        listaNumeros.adicionarNumero(100);
        listaNumeros.adicionarNumero(10);
        listaNumeros.adicionarNumero(8);

        listaNumeros.exibirNumero();

        System.out.println("Soma total dos números da lista: " + listaNumeros.calcularSoma());
        System.out.println("Número maior da lista: " + listaNumeros.encontrarMaiorNumero());
        System.out.println("Número menor da lista: " + listaNumeros.encontrarMenorNumero());
    }
}
