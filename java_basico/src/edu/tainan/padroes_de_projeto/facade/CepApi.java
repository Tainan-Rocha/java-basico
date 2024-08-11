package edu.tainan.padroes_de_projeto.facade;

public class CepApi {

    // A única instância da classe é armazenada em uma variável estática.
	private static CepApi instancia = new CepApi();

    // Construtor 
	private CepApi() {}

    // Método público para acessar a única instância da classe.
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Campo-Bom";
	}
	
	public String recuperarEstado(String cep) {
		return "RS";
	}
}
