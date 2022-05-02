package com.dionlan.estudos.Java8_Streams_Creation.classes;

import java.util.List;
import static java.util.Arrays.asList;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double salario;
	
	public Pessoa(String nome, int idade, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}
	
	public static List<Pessoa> bancoDePessoas(){
		return asList(
				new Pessoa("Dionlan", 21, 1500),
				new Pessoa("Marinia", 23, 1600),
				new Pessoa("Marinia", 23, 1600),
				new Pessoa("Julia", 32, 9050),
				new Pessoa("Breanda", 25, 4500),
				new Pessoa("Thiago", 45, 2300),
				new Pessoa("Rita", 32, 900),
				new Pessoa("Felipe", 78, 5200),
				new Pessoa("João", 12, 3654),
				new Pessoa("Pedro", 15, 1258),
				new Pessoa("Flávia", 36, 2500),
				new Pessoa("Marcelo", 65, 3510),
				new Pessoa("Renan", 82, 7800)				
				);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		
		Pessoa pessoa = (Pessoa) o;
		
		return nome != null ? nome.equals(pessoa.nome) : pessoa.nome == null;
	}
	
	public String toString() {
		return "Nome: " + getNome() + " Idade: " + getIdade() + " Salário: " + getSalario();
	}
}
