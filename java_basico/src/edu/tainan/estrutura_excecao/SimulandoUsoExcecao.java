package edu.tainan.estrutura_excecao;

public class SimulandoUsoExcecao {
    public static void main(String[] args) {
        // Tratando excecao
        try {
            String cepDigitado = formatarCep("93700000");
            System.out.println(cepDigitado);
        } catch (CriandoExececao e) {
            System.out.println("O cep não foi encontrado!");
        }
    }

    // Metodo que irá simular a formatação do cep
    static String formatarCep(String cep) throws CriandoExececao{
        // Condição para chamar a excecao criada
        if(cep.length() != 8)
          throw new CriandoExececao();
        
          //simulando um cep formatado
          return "93700-000";
    }
}
