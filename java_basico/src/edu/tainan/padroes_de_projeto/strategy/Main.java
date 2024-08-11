package edu.tainan.padroes_de_projeto.strategy;

public class Main {
    public static void main(String[] args) {
        
        // Criando objeto comportamento
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        // Criando objeto robo
        Robo robo = new Robo();

        // Realizando acoes
        
        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
    }
}
