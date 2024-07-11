package edu.tainan.collections.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    
    // atributo 
    private Set<String> conjuntoPalavras;

    // Getter
    public Set<String> getConjuntoPalavras() {
        return conjuntoPalavras;
    }

    // Construtor
    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }

    // To String
    @Override
    public String toString() {
        return "Lista das palavras " + conjuntoPalavras;
    }

    // Adicionado palavra
    public void adicionarPalavra(String palavra) {
        conjuntoPalavras.add(palavra);
    }

    // Removendo palavra
    public void removerPalavra(String palavra) {
        System.out.println("Removendo a palavra " + palavra + "...");
        conjuntoPalavras.remove(palavra);
    }

    // Verificar se palavra esta dentro do set
    public void verificarPalavra(String palavra) {
        if (conjuntoPalavras.contains(palavra)) {
            System.out.println("Essa palavra está dentro do set.");
        }
        else {
            System.out.println("Essa palavra não está no set.");
        }
    } 

    // Exibir palavras que estão no set
    public void exibirPalavrasUnicas() {
        System.out.println("Exibindo palavras do set: ");
        System.out.println(conjuntoPalavras);
    }

    // Testando metodos
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();

        conjuntoPalavras.adicionarPalavra("vontade");
        conjuntoPalavras.adicionarPalavra("luz");
        conjuntoPalavras.adicionarPalavra("sangrar");
        conjuntoPalavras.adicionarPalavra("vontade");
        conjuntoPalavras.adicionarPalavra("flutuador");

        conjuntoPalavras.exibirPalavrasUnicas();

        conjuntoPalavras.removerPalavra("luz");

        conjuntoPalavras.exibirPalavrasUnicas();

        conjuntoPalavras.verificarPalavra("sangrar");

    }
    
}
