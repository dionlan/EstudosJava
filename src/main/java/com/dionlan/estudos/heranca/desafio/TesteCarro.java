package com.dionlan.estudos.heranca.desafio;

public class TesteCarro {

	public static void main(String[] args) {
		/**
		 * Conceito de Polimorfismo dinâmico - instancia c1 da super classe Carro, podendo ser de qualquer tipo de classe que herda Carro
		 */
		Carro c1 = new Celta();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println(c1);
		
		Carro c2 = new Ferrari(400);
		c2.acelerar();
		c2.frear(); //como não há sobrescrita, é chamado o método frear da super classe pai Carro
		c2.acelerar();
		c2.frear();
		c2.acelerar();
		
		System.out.println(c2);
	}
}
