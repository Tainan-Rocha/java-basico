package edu.tainan.padroes_de_projeto.singleton;

public class SingletonLazy {
    
    // A única instância da classe é armazenada em uma variável estática.
    private static SingletonLazy instancia;

    // Construtor
    private SingletonLazy() {}

    // Método público para acessar a única instância da classe.
    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            
            // Cria a instância na primeira vez que for solicitada.
            instancia = new SingletonLazy();
        }
        return instancia;
    } 
}
