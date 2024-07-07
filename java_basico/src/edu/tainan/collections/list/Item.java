package edu.tainan.collections.list;

public class Item {
    
    // Atributos
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor
    public Item(String nome, double preço, int quantidade) {
        this.nome = nome;
        this.preco = preço;
        this.quantidade = quantidade;
    }

    // Getter
    public String getNome() {
        return nome;
    }

    // Getter
    public double getPreco() {
        return preco;
    }

    // Getter
    public int getQuantidade() {
        return quantidade;
    }

    
}
