package edu.tainan.oop.getters_setters;

public class Escola {
    public static void main(String[] args) {
        // Criando objeto aluno
		Aluno tainan = new Aluno();
        
        // Definindo atributos privatos com setter
		tainan.setNome("Tainan");
		tainan.setIdade(24);
		
        // Imprimindo atributos privatos com getters
		System.out.println("O aluno " + tainan.getNome() + " tem " + tainan.getIdade() + " anos ");
 		
	}
}
