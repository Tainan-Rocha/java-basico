package edu.tainan.estrutura_repeticao;

public class ForPositionEach {
    public static void main(String[] args) {

        // Array
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // Estrutura de repetição iterando sobre um array(Lista)
	    for (int x=0; x<alunos.length; x++) {
		    System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
	    }

        // Forma abreviada
	    for(String aluno : alunos) {
            System.out.println("Iterando de forma abreviada: " + aluno);
      }
    }
}
