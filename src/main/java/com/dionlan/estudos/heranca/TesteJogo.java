package com.dionlan.estudos.heranca;

public class TesteJogo {

	public static void main(String[] args) {
		Jogador j1 = new Jogador();
		j1.x = 10;
		j1.y = 10;
		
		Jogador j2 = new Monstro();
		j2.x = 10;
		j2.y = 11;
		
		Jogador j3 = new Heroi();
		j3.x = 10;
		j3.y = 11;
		
		System.out.println(j1.vida);
		System.out.println(j2.vida);
		
		//no X o deltaX == 0 e no Y o deltaY == 1, logo eh possivel realizar o ataque X1 contra X2
		j1.atacar(j2);
		
		System.out.println(j1.vida);
		System.out.println(j2.vida);
	}
}
