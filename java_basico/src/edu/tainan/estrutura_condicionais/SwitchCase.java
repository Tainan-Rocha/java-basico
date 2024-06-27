package edu.tainan.estrutura_condicionais;

public class SwitchCase {
    public static void main(String[] args) {

        // Variaveis
        String sigla = "M";

        // Condição Switch case (Parecido com condição encadeada)
		switch (sigla) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
    }
}
