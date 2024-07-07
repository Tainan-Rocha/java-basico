package edu.tainan.collections.list;

public class Tarefa {
    
    // Atributo
    private String descricao;

    // Construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    // Getter
    public String getDescricao() {
        return descricao;
    }

    // Converte para string objeto que está guardado na memoria
    @Override
    public String toString() {
        return descricao;
    }
}
