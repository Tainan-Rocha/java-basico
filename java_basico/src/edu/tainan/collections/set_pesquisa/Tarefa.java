package edu.tainan.collections.set_pesquisa;

public class Tarefa {
    
    // Atributos 
    private String descricao;
    private Boolean status = false;

    // Construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    // Getter 
    public String getDescricao() {
        return descricao;
    }

    // Getter 
    public Boolean getStatus() {
        return status;
    }

    // SetterString
    public void setStatus(Boolean tarefa) {
        this.status = tarefa;
    }

    // To string
    @Override
    public String toString() {
        return " Tarefa: " + descricao + ", Status: " + status;
    }

    
    
}
