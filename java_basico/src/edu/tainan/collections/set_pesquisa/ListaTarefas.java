package edu.tainan.collections.set_pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    
    // Atributos
    private Set<Tarefa> setTarefas;

    // Construtor
    public ListaTarefas() {
        this.setTarefas = new HashSet<>();
    }

    // Adicionando tarefa
    public void adicionarTarefa(String descricao) {
        setTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!setTarefas.isEmpty()) {
          for (Tarefa tarefa : setTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
              tarefaParaRemover = tarefa;
              break;
            }
          }
          setTarefas.remove(tarefaParaRemover);
        } else {
          System.out.println("O conjunto está vazio");
        }
    }

    // Contar tarefas
    public int contarTarefas() {
        return setTarefas.size();
    }

    // Exibindo tarefa(s)
    public void exibirTarefas() {
        System.out.println("Lista das tarefas: ");
        System.out.println(setTarefas);
    }

    // Alterar status de tarefa para concluido
    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : setTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setStatus(true);
                break;
            }
        }
    }

    // Alterar status de tarefa para pendente
    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : setTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setStatus(false);
                break;
            }
        }
    }

    // Obter set de tarefas concluidas
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : setTarefas) {
            if (tarefa.getStatus() == true) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    // Obter set de tarefas pendentes
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa tarefa : setTarefas) {
            if (tarefa.getStatus() == false) {
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }  


    // Testando metodos
    public static void main(String[] args) {
        
        // Criando objeto
        ListaTarefas setTarefas = new ListaTarefas();

        setTarefas.adicionarTarefa("Acordar");
        setTarefas.adicionarTarefa("Tomar cafe da manha");
        setTarefas.adicionarTarefa("Estudar");
        setTarefas.adicionarTarefa("Trabalhar");
        setTarefas.adicionarTarefa("Almocar");
        setTarefas.adicionarTarefa("Jantar");
        setTarefas.adicionarTarefa("Dormir");

        setTarefas.exibirTarefas();

        setTarefas.removerTarefa("Tomar cafe da manha");
        setTarefas.removerTarefa("Trabalhar");

        setTarefas.exibirTarefas();

        System.out.println("Numero total de tarefas: " + setTarefas.contarTarefas());

        setTarefas.marcarTarefaConcluida("Acordar");
        setTarefas.marcarTarefaConcluida("Estudar");
        setTarefas.marcarTarefaConcluida("Almocar");

        setTarefas.marcarTarefaPendente("Almocar");

        setTarefas.exibirTarefas();

        System.out.println("Set de tarefas concluidas: " + setTarefas.obterTarefasConcluidas());
        
        System.out.println("Set de tarefas pendentes: " + setTarefas.obterTarefasPendentes());
    }
}
