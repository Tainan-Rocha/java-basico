package edu.tainan.anatomiaclasses;

public class VariaveisMetodos {
    public static void main (String[] args) {
        // Declarando variaveis
        String primeiroNome = "Tainan";
        String ultimoNome = "Rocha";
        
        // Chamando metodo
        String nomeCompleto = nomeCompleto(primeiroNome, ultimoNome);
        System.out.println(nomeCompleto); // Impressao
    }  

    // Declarando um método
    public static String nomeCompleto(String primeiroNome, String ultimoNome) {
        return "Retorno do método: " + primeiroNome + " " + ultimoNome; // Utilizando concatenação.
    }
}
