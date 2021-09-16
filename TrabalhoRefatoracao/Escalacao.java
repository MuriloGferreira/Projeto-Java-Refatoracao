package TrabalhoRefatoracao;

// Alunos: Caio França e Murilo Ferreira   

import java.util.ArrayList;

public class Escalacao {

	private String imprimir;
	private String data;
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Escalacao() {
		this.imprimir = "---------Imprimindo Escalação---------";
	}
	
	public Escalacao(String imprimir) {
		super();
	
		this.imprimir = imprimir;
	}

	public String getImprimir(ArrayList<Jogador> jogadores) {
		return imprimir;
	}

	public void setImprimir(String jogadores) {
		this.imprimir = jogadores;
	}
}