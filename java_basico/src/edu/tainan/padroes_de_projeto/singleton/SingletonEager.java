package edu.tainan.padroes_de_projeto.singleton;

public class SingletonEager {

    // A única instância da classe é armazenada em uma variável estática.
    private static SingletonEager instancia = new SingletonEager();

    // Construtor
    private SingletonEager() {}
    
    // Método público para acessar a única instância da classe.
    public static SingletonEager getInstancia () {
        return instancia;
    }
}
