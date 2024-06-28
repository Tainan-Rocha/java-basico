package edu.tainan.estrutura_repeticao;

// Importando classe para gerar numeros aleatorios
import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        
        // Enquanto tocando ser false, telefone toca
		do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
        }
        
        // Se tocando ser true, realiza a estrutura do While
        while(tocando());
		
		System.out.println("Alô !!!");
	}

    // Criando método para retornar true ou false
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		//negando o ato de continuar tocando
		return ! atendeu;
	}
}



// Basicamente é faça algo enquanto algo seja verdadeiro
//estrutura do controle de fluxo do while

// do
// {
    // comando que será executado até que a 
     // expressão de validação torne-se falsa 
// }
// while (expressão booleana de validação);