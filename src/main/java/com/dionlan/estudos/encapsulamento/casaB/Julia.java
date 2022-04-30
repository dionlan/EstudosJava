package com.dionlan.estudos.encapsulamento.casaB;

import com.dionlan.estudos.encapsulamento.casaA.Ana;

/**
 * Conhecendo a visilibidade da Ana (Casa A) a partir da Júlia (Casa B)
 * @author dius_
 *
 */
public class Julia {

	void testeAcesso() {
		Ana sogra = new Ana();
		//System.out.println(esposa.segredo); //apenas a Ana sabe
		//System.out.println(sogra.facoDentroDeCasa); //default visível apenas dentro do pacote - package
		//System.out.println(sogra.formaDeFalar); //protected visível a todos do pacote e na herança
		System.out.println(sogra.todosSabem); //público para todos
	}
}