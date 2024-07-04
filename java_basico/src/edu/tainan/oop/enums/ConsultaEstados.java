package edu.tainan.oop.enums;

// Qualquer classe do sistema poderá obter os objetos de EstadoBrasileiro
public class ConsultaEstados {
    public static void main(String[] args) {
        
        // Iterando sobre a classe enum para obter os dados armazenados
        for (EstadoBrasileiro estado: EstadoBrasileiro.values()) {
            System.out.println("Nome do Estado: " + estado.getNome() + "  | Sigla: " + estado.getSigla());
        }

        // Selecionando um estado especifico
        EstadoBrasileiro estadoSelecionado = EstadoBrasileiro.RIO_JANEIRO;

        System.out.println(estadoSelecionado.getNomeMaiusculo() + " " + estadoSelecionado.getSigla());
    }
}
