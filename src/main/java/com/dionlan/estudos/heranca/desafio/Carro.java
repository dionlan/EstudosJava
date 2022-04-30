package com.dionlan.estudos.heranca.desafio;

/**
 * super classe
 * @author dius_
 *
 */
public class Carro {

	final double VELOCIDADE_MAXIMA;
	protected double velocidadeAtual = 0;
	protected int delta = 5;
	
	protected Carro(double velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += delta;
		}
	}
	
	public void frear() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		return "A velocidade atual eh de " + velocidadeAtual + " Km/h.";
	}
}
