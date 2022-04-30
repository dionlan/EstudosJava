package com.dionlan.estudos.encapsulamento;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Dionlan", "Alves", -33);
		System.out.println(p1);
		System.out.println(p1.getNomeCompleto());
	}
}
