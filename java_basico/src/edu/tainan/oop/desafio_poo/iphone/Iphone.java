package edu.tainan.oop.desafio_poo.iphone;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadornaInternet {
    
    @Override
    public void ligar(int numero) {
        System.out.println("Ligando para o número: " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocar musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica " + musica + "...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina " + url + "...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }
}
