package edu.tainan.estrutura_condicionais;

public class CondicionaisTernarias {
    public static void main(String[] args) {

        //Variaveis
        int nota = 6;

        // Condição ternaria (Basicamente a mesma coisa que if e else, só que em uma única linha)
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";

        // Impressão
		System.out.println(resultado);
    }
}
