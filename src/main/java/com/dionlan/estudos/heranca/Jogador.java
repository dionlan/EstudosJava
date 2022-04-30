package com.dionlan.estudos.heranca;

public class Jogador {

	int vida = 100; //life comecando com 100
	int x;
	int y;
	
	/*
	 * Construtor padrão chamando o construtor com argumentos;
	 * As classes filhas podem chamar qualquer um, mas nesse caso continuarão com o construtor padrão passando os argumentos;
	 */
	public Jogador() {
		this(0, 0);
	}
	
	public Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x); //distancia absoluta (modulo) da posicao entre dois jogadores
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) { //os dois jogadores estao na mesma linha e em posicoes adjacente - um do lado do outro, podendo atacar
			oponente.vida -= 10;
			return true;
		}else if(deltaX == 1 && deltaY == 0) { // mesma coluna no Y e lado a lado no X
			oponente.vida -= 10;
			return true;
		}else {
			return false; //apos a movimentacao, nao houve adjacencia para ataque
		}
	}
	
	boolean andar(Direcao direcao) {
		switch(direcao) {
		case NORTE:
			y--;
			break;
		case LESTE: 
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		return true;
	}
}
