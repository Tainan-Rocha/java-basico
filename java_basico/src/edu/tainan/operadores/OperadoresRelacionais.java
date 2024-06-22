package edu.tainan.operadores;

public class OperadoresRelacionais {

    public static void main(String[] args) {

        String nome1 = "JAVA";
        String nome2 = "JAVA";
        
        System.out.println(nome1 == nome2); //true

        nome2 = new String("JAVA"); // Declarando um novo objeto
        
        System.out.println(nome1 == nome2); //false, pois são objetos diferentes

        //O método "equals", vai comparar se o conteudo do objeto é igual do outro.
        System.out.println(nome1.equals(nome2)); // True

        // Equals é utilizado geralmente para comparar objetos e strings.
        // Já para números inteiros, a validação pode ser feita pelas empressões relacionais abaixo:

    }
    
}


// == Quando desejamos verificar se uma variável é IGUAL A outra.

// != Quando desejamos verificar se uma variável é DIFERENTE da outra.

// > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
 
// >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.

// < Quando desejamos verificar se uma variável é MENOR QUE outra.

// <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.