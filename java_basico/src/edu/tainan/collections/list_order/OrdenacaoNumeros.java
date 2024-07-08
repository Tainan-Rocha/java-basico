package edu.tainan.collections.list_order;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OrdenacaoNumeros {
    
    //atributos
    private List<Integer> listaNumeros;

    //construtor
    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    // ToString
    @Override
    public String toString() {
        return "Lista numeros:  [" + listaNumeros + "]";
    }    

    // Adicionando numero na lista
    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    // Retorna lista em ordem ascendente
    public List<Integer> ordenarAscendente() {
        Collections.sort(listaNumeros);
        return listaNumeros;
    }

    // Retorna lista em ordem descendente
    public List<Integer> ordenarDescendente() {
        Collections.reverse(listaNumeros);
        return listaNumeros;
    }

    // Testando metodos
    public static void main(String[] args) {
        OrdenacaoNumeros listaNumeros = new OrdenacaoNumeros();

        listaNumeros.adicionarNumero(5);
        listaNumeros.adicionarNumero(2);
        listaNumeros.adicionarNumero(100);
        listaNumeros.adicionarNumero(10);
        listaNumeros.adicionarNumero(8);

        System.out.println(listaNumeros);

        System.out.println("Numeros Ascendente " + listaNumeros.ordenarAscendente());
        System.out.println("Numeros Ascendente " + listaNumeros.ordenarDescendente());

    }
}


