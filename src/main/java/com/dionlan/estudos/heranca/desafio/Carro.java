package com.dionlan.estudos.heranca.desafio;

/**
 * super classe
 * @author dius_
 *
 */
public class Carro {

	final double VELOCIDADE_MAXIMA;
	double velocidadeAtual = 0;
	int delta = 5;
	
	Carro(double velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += delta;
		}
	}
	
	void frear() {
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
