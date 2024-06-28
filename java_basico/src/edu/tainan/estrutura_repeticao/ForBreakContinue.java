package edu.tainan.estrutura_repeticao;

public class ForBreakContinue {
    public static void main(String[] args) {

       // Estrutura do for com break e continue
        for (int contador = 1; contador <= 10; contador ++) {

                // Utilizando continue, você pode fazer algo e depois voltar para contator novamente
                if (contador == 5){
                    continue;
                }

                // Utilizando brack, você pode fazer algo e parar a iteracao.
                if (contador == 7){
                    break;
                }

            System.out.println("Contando: " + contador);
        }
    }
}   
