package com.dionlan.estudos.encapsulamento.casaA;

public class Paulo {
	
	void testeAcessos() {
		/*segredo
		facoDentroDeCasa
		formaDeFalar
		todosSabem*/
		Ana esposa = new Ana();
		//System.out.println(esposa.segredo); //apenas a Ana sabe
		System.out.println(esposa.facoDentroDeCasa); //default visível apenas dentro do pacote - package
		System.out.println(esposa.formaDeFalar); //protected visível a todos do pacote e na herança
		System.out.println(esposa.todosSabem); //público para todos
	}
}
