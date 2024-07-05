package edu.tainan.oop.pilares_opp;

public class Carro extends Veiculo { // extends seria a forma de declarar uma herança de uma classe.

    // Declarando o metodo abstrato
    @Override
    public void ligar() {
        confereGasolina();
        System.out.println("Carro ligado!");   
    }

    // Encapsulamento
    private void confereGasolina() {
        System.out.println("Conferindo Gasolina...");
    }
}

