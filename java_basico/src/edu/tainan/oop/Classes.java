package edu.tainan.oop;

    // Criando a classe Aluno
        class Aluno {
        // Criando atributos
        String nome;
        int idade;
        String cor;
        String sexo;

        // Criando ações
        void comer(String comida) {
            // Comendo...
        }   
        void beber(String bebida) {
            // bebendo...
        }
    }

public class Classes {
    public static void main(String[] args) throws Exception {
        Aluno aluno_1 = new Aluno(); // Criando objeto
        aluno_1.nome = "Tainan"; // Inserindo argumentos
        aluno_1.idade = 24; // Inserindo argumentos
        aluno_1.cor = "Branco"; // Inserindo argumentos
        aluno_1.sexo = "Masculino"; 

        // Impressão
        System.out.println(aluno_1.nome);

    }
}
