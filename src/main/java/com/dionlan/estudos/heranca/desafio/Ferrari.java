package com.dionlan.estudos.heranca.desafio;

public class Ferrari extends Carro {

	public Ferrari(){
		this(315); //chama o construtor abaixo que chama a super classe Carro passando a velocidade maxima da Ferrari
	}
	
	public Ferrari(double velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 20;
	}
	
	/**
	 * Anotacao opcional para tornar explícito ao eclipse que está sobrescrevendo um método da classe pai.
	 */
//	@Override
//	void acelerar() {
//		super.acelerar();
//	}
	
	/**
	 * Conceito de Polimorfismo estático - sobrecarga. Mesmo método com diferente assinatura
	 * @param fatorAceleracao
	 * @return
	 */
	void acelerar(double fatorAceleracao) {
		velocidadeAtual += 15 * fatorAceleracao;
	}
}
