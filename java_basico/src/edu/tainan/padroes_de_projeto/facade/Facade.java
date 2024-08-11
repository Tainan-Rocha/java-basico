package edu.tainan.padroes_de_projeto.facade;

public class Facade {
    
    // Metodo para consumir inforamcoes da API
    public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
        
        // Chamando metodo para gravar informacoes
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
