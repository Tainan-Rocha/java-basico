package edu.tainan.collections.list;

// Importando classe array list
import java.util.ArrayList;

// Importando classe list
import java.util.List;

public class ListaTarefas {
    
    // Atributo 
    private List<Tarefa> listadetarefas;

    // Construtor
    public ListaTarefas () {
        this.listadetarefas = new ArrayList<>();
    }

    // Adicionando tarefa na lista de tarefas
    public void adicionarTarefa(String descricao) {
        listadetarefas.add(new Tarefa(descricao));
    }

    // Removendo tarefa na lista de tarefas
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>(); // Criando uma nova lista para receber a tarefa que deseja remover
        for (Tarefa tafera : listadetarefas) {
            if (tafera.getDescricao().equals(descricao)) {
                tarefasParaRemover.add(tafera);
            }
        }
        listadetarefas.removeAll(tarefasParaRemover);
    }

    // Obtendo numero total de itens na lista
    public int obterNumeroTotalTarefas() {;
        return listadetarefas.size();
    }

    // Verificando nome das tarefas
    public void obterDescricoesTarefas() {
        System.out.println("Lista de Tarefas: ");
        for (Tarefa tarefa : listadetarefas){
            System.out.println(tarefa);
        }
    }

    // Testando metodos
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.adicionarTarefa("Tarefa 1");

        listaTarefas.removerTarefa("Tarefa 1");

        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricoesTarefas();

        
    }
}


