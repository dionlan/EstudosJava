package com.dionlan.estudos.encapsulamento.casaB;

import com.dionlan.estudos.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	void testeAcessos() {
		/*segredo
		facoDentroDeCasa
		formaDeFalar
		todosSabem*/
		
		//System.out.println(mae.segredo); //apenas a Ana sabe
		//System.out.println(mae.facoDentroDeCasa); //default visível apenas dentro do pacote - package
		System.out.println(formaDeFalar); //protected visível a todos do pacote e na herança. Na herença não é acesso pela instancia, e sim diretamente
		System.out.println(todosSabem); //público para todos. Na herança pode receber diretamente o atributo, sem necessitar da instancia
	}
}
