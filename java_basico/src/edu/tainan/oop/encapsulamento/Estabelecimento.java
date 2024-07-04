package edu.tainan.oop.encapsulamento;

// Importando classes
import edu.tainan.oop.encapsulamento.atendimento.cozinha.Almoxarife;
import edu.tainan.oop.encapsulamento.atendimento.cozinha.Cozinheiro;
import edu.tainan.oop.encapsulamento.area.cliente.Cliente;
import edu.tainan.oop.encapsulamento.atendimento.Atendente;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();

		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Atendente atendente = new Atendente();
        atendente.servindoMesa();
		atendente.receberPagamento();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
	}
}
