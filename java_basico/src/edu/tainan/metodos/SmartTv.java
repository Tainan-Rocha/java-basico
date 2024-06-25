package edu.tainan.metodos;

// Criando um classe
public class SmartTv {
    boolean ligada = false;
    int volume = 25;
    int canal = 1;

    // Metodo para ligar e desligar TV.
    public boolean ligar_Desligar() {
        if (ligada == false) {
            ligada = true;
            System.out.println("Ligando TV!");
        }
        else {
            ligada = false;
            System.out.println("Desligando TV!");
        }
        return ligada;
    }

    // Metodo para aumentar volume da TV
    public int aumentar_Volume() {
        ++volume;
        System.out.println("Aumentando Volume para " + volume);
        return volume;
    }

    // Metodo para diminuir volume da TV
    public int diminuir_Volume() {
        --volume;
        System.out.println("Diminuindo Volume para " + volume);
        return volume;
    } 

    // Metodo para escolher canal
    public int escolher_Canal(int novo_Canal) {
        canal = novo_Canal;
        System.out.println("Mudando canal para: " + novo_Canal);
        return canal;
    }

    public int aumentar_Canal() {
        ++canal;
        System.out.println("Aumentando canal para: " + canal);
        return canal;
    }

    public int diminuir_Canal() {
        --canal;
        System.out.println("Diminuindo canal para: " + canal);
        return canal;
    }
}

