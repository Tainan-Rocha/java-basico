package edu.tainan.operadores;

public class OperadoresTernario {
    public static void main(String[] args) {
        int x, y;
        x = 5;
        y = 5;

        // Operador Ternario 
        // Basicamente é um if e else
        // <Expressão Condicional>  ? <Caso condição seja true> : <Caso condição seja false>
        String resultado = x == y ? "Verdadeiro" : "Falso";
        System.out.println(resultado);
    }
}


// É útil quando você precisa tomar uma decisão simples e a lógica cabe em uma única linha

//A estrutura if-else é usada quando você tem condições mais complexas 
// ou múltiplos blocos de código a serem executados com base em diferentes condições. 
//É mais legível e apropriada para lógica condicional que envolve mais do que uma simples atribuição ou retorno.