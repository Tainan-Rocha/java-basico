package edu.tainan.collections.list;

// Import das classes list e array
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    // Atrituto
    private List<Item> carrinhoCompras;

    // Construtor
    public CarrinhoDeCompras() {
        this.carrinhoCompras = new ArrayList<>();
    }

    // Adicionando item no carrinho
    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoCompras.add(new Item(nome, preco, quantidade));
    }

    // Removendo item do carrinho
    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : carrinhoCompras){
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            }
        }
        carrinhoCompras.removeAll(itensParaRemover);
    }

    // Exibindo preco total dos itens que estao no carrinho
    public void exibirPrecoTotal() {
        double valorTotal = 0.00;
        for (Item item : carrinhoCompras) {
            valorTotal += item.getPreco() * item.getQuantidade(); 
        }
        System.out.println("Valor total do carrinho é: " + valorTotal);
    }


    // Exibindo itens que estao no carrinho
    public void exibirItem() {
        System.out.println("Itens dentro do carrinho: ");
        for (Item item : carrinhoCompras) {
            System.out.println("Produto: " + item.getNome() + " | Preço: " + item.getPreco() + " | Quantidade: " + item.getQuantidade());
        }
    }

    // Testando metodos
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Cabo HDMI", 19.00, 1);
        carrinhoDeCompras.adicionarItem("Placa de Vídeo", 800.00, 1);
        carrinhoDeCompras.adicionarItem("Memoria Ram", 150.00, 2);
        carrinhoDeCompras.adicionarItem("Monitor", 500.00, 1);
        
        carrinhoDeCompras.removerItem("Monitor");

        carrinhoDeCompras.exibirItem();

        carrinhoDeCompras.exibirPrecoTotal();
    
    }   
}
