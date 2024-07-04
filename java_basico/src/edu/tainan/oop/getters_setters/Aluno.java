package edu.tainan.oop.getters_setters;

public class Aluno {
    private String nome;
	private int idade;

    // Getter -> Obtendo acesso ao dado que está armazenado em uma variavel private
    public String getNome() {
        return nome;
    }

    // Setter -> Alterando dado de uma variavel private.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
