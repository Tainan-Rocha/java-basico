package edu.tainan.metodos;

public class Usuario {
    public static void main(String[] args) {

        // Criando objeto
        SmartTv smartTv = new SmartTv();
        
        // Ações dos metodos
        smartTv.ligar_Desligar();
        smartTv.ligar_Desligar();
        

        smartTv.aumentar_Volume(); 
        smartTv.diminuir_Volume();

        smartTv.escolher_Canal(22);
        smartTv.aumentar_Canal();
        smartTv.diminuir_Canal();

    }   
}


