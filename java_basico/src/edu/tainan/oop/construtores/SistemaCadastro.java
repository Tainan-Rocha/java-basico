package edu.tainan.oop.construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa tainan = new Pessoa("Tainan", "011.747.300.60");
		
		// Definindo atributo do endereco
		tainan.setEndereco("RUA DAS MARIAS");
		
		System.out.println("Nome:"+ tainan.getNome() + " CPF:" + tainan.getCpf());
	}
}
