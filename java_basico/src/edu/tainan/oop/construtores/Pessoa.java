package edu.tainan.oop.construtores;

public class Pessoa {
    private String nome;
	private String cpf;
	private String endereco;
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

    // Criando um metodo construtor
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        // Dessa forma é obrigado o preenchimento desses dados para criação do objeto
        // Não é uma boa pratica criar o construtor para todos os atributos, somente para atributos necessarios para tal finalidade.
    }
}

