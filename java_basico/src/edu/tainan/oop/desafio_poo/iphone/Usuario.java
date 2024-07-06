package edu.tainan.oop.desafio_poo.iphone;

public class Usuario {
    public static void main(String[] args) {

        // Criando objeto
        Iphone iphone = new Iphone();

        // Realizando acoes de telefonar 
        iphone.ligar(97345862);
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Realizando acoes de musica
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Secretaria - Amado Batista");

        // Realizando acoes de navegador
        iphone.adicionarNovaAba();
        iphone.exibirPagina("www.google.com.br");
        iphone.atualizarPagina();
    }
}
