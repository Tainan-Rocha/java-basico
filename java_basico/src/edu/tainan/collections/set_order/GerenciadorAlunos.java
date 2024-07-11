package edu.tainan.collections.set_order;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    
    // Atributos
    private Set<Aluno> setAlunos;

    // Construtor
    public GerenciadorAlunos() {
        this.setAlunos = new HashSet<>();
    }
    
    // Adicionar aluno
    public void adicionarAluno(String nome, Long matricula, double media) {
        setAlunos.add(new Aluno(nome, matricula, media));
    }

    // Remover aluno 
    public void removerAluno(Long matricula) {
        Aluno alunoParaRemover = null;
        if (!setAlunos.isEmpty()) {
          for (Aluno a : setAlunos) {
            if (a.getMatricula() == matricula) {
              alunoParaRemover = a;
              break;
                }
            }
            setAlunos.remove(alunoParaRemover);
        }
    }

    // Listar alunos por nome
    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(setAlunos);
        if (!setAlunos.isEmpty()) {
            System.out.println(alunosPorNome);
        }
        else {
      System.out.println("O conjunto está vazio!");
            }
        }

    // Listar alunos por nota
    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if (!setAlunos.isEmpty()) {
          alunosPorNota.addAll(setAlunos);
          System.out.println(alunosPorNota);
        } else {
          System.out.println("O conjunto está vazio!");
        }
      }

    // Exibir alunos
    public void exibirAlunos() {
        if (!setAlunos.isEmpty()) {
            System.out.println(setAlunos);
          } else {
            System.out.println("O conjunto está vazio!");
          }
        } 


    // Testando metodos
    public static void main(String[] args) {
        GerenciadorAlunos setAlunos = new GerenciadorAlunos();

        setAlunos.adicionarAluno("Aluno 4", 1L, 50.00);
        setAlunos.adicionarAluno("Aluno 2", 2L, 90.00);
        setAlunos.adicionarAluno("Aluno 3", 1L, 100.00);
        setAlunos.adicionarAluno("Aluno 1", 4L, 70.00);
        setAlunos.adicionarAluno("Aluno 2", 5L, 40.00);

        setAlunos.exibirAlunos();

        setAlunos.exibirAlunosPorNome();
        setAlunos.exibirAlunosPorNota();

        setAlunos.removerAluno(5L);
        setAlunos.removerAluno(4L);
        setAlunos.removerAluno(1L);

        setAlunos.exibirAlunos();
    }
}
