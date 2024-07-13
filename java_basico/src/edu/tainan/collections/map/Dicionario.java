package edu.tainan.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    
    // Atributo 
    private Map<String, String> mapPalavras;

    // Construtor
    public Dicionario() {
        this.mapPalavras = new HashMap<>();
    }

    // Adicionar palavra no dicionario
    public void adicionarPalavra(String palavra, String definicao) {
        mapPalavras.put(palavra, definicao);
    }

    // Remover palavra
    public void removerPalavra(String palavra) {
        mapPalavras.remove(palavra);
        System.out.println("Removendo palavra " + palavra + "...");
    }

    // Pesquisar palavra
    public void pesquisarPorPalavra(String palavra) {
        System.out.println("Procurando significado da palavra: " + palavra);
        String definicao = mapPalavras.get(palavra);
        if (definicao != null) {
            System.out.println(definicao);
        }
    }

    // Exibir palavras
    public void exibirPalavras() {
        for (Map.Entry<String, String> palavra : mapPalavras.entrySet()) {
            System.out.println("Palavra: " + palavra.getKey() + "-> Significado: " + palavra.getValue());
        }
    }


    // Testando metodos
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Atores", "Indivíduos que interpretam personagens.");
        dicionario.adicionarPalavra("Chimarrao", "Mate amargo, preparado com água fervente" );
        dicionario.adicionarPalavra("Rastreamento", "Ação ou processo de monitorar" );
        dicionario.exibirPalavras();

        dicionario.removerPalavra("Atores");
        dicionario.exibirPalavras();

        dicionario.pesquisarPorPalavra("Chimarrao");
    }
}
