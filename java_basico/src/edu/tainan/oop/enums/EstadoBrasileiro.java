package edu.tainan.oop.enums;

// Usamos Enum, quando o nosso modelo de negócio contém objetos de mesmo contexto, 
// que já existem de forma pré-estabelecida com a certeza de não haver tanta alteração de valores.

// Exemplos: 
// Grau de Escolaridade: Analfabeto, Fundamental, Médio, Superior;
// Estado Civil: Solteiro, Casado, Divorciado, Viúvo;

// Criando classe enum com objetos representando estados do brasil, que são "imutaveis"
public enum EstadoBrasileiro {
    SAO_PAULO ("SP","São Paulo"),
	RIO_JANEIRO ("RJ", "Rio de Janeiro"),
	PIAUI ("PI", "Piauí"),
	MARANHAO ("MA","Maranhão") ;

    // Atributos 
    private String nome;
    private String sigla;

    // Construtor 
    private EstadoBrasileiro(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    // Getter 
    public String getSigla() {
		return sigla;
	}

    // Getter 
	public String getNome() {
		return nome;
	}

    // Getter para retornar nome do estado em maiusculo
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
}
