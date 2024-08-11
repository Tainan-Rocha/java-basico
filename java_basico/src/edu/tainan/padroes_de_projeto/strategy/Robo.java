package edu.tainan.padroes_de_projeto.strategy;

public class Robo {
    
    // Atributo 
    private Comportamento comportamento;

    // Set que ira receber o comportamento
    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    // Realizando acao
    public void mover() {
        comportamento.mover();
    }
}
