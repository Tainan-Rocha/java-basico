package edu.tainan.padroes_de_projeto.singleton;

public class Main {
    public static void main(String[] args) {
        
        // Criando instancia 
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        // Chamando instancia novamante 
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);


        // Criando instancia 
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        // Chamando instancia novamante 
        eager = SingletonEager.getInstancia();
        System.out.println(eager);


        // Criando instancia 
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Chamando instancia novamante 
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
    }
}
