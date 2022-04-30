package com.dionlan.estudos.encapsulamento.casaA;

public class Ana {

	@SuppressWarnings("unused")
	private String segredo = "Segredo da Ana";
	String facoDentroDeCasa = "Banho a noite"; //default ou package -> visibilidade apenas no mesmo pacote
	protected String formaDeFalar = "Sotaque carioca"; //visível no mesmo pacote e quem herda, sem necessitar criar instancia da classe, acesso direto
	public String todosSabem = "Casada com o Paulo";
}
