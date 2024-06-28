package edu.tainan.estrutura_repeticao;

// Importando classe para gerar valores aleatorios
import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        // Variavel 
        double mesada = 50.0;

        // Estrutura de repeticao while(Enquanto mesada ser maior que 0, fica no loop)
        while(mesada>0) {

            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
        /*
        * Não se preocupe quanto a formatação de valores
        * Iremos explorar os recursos de formatação em breve !!
        */
   }
   
   // Criando método para gerar um valor aleatório
   private static double valorAleatorio() {
	return ThreadLocalRandom.current().nextDouble(2, 8);
   }
}
