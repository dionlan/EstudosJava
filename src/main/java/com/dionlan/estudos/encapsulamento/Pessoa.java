package com.dionlan.estudos.encapsulamento;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private int idade;
	
	public Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade < 120) {
			this.idade = novaIdade;			
		}
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
	
	public String toString() {
		return "Olá Mundo, meu nome eh " + getNomeCompleto() + " e tenho " + getIdade() + " anos.";
	}
}
