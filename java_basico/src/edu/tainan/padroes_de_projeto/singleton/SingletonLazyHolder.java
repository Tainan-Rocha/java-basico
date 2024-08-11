package edu.tainan.padroes_de_projeto.singleton;

public class SingletonLazyHolder {
    
    // Classe que ira armazenar a instancia
    private static class InstanceHolder {

        // A única instância da classe é armazenada em uma variável estática.
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

        // Construtor
        private SingletonLazyHolder() {} 

        // Método público para acessar a única instância da classe.
        public static SingletonLazyHolder getInstancia() {
            return InstanceHolder.instancia;
        }
}

