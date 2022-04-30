package com.dionlan.estudos.heranca;

public class TesteJogo {

	public static void main(String[] args) {
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi(10, 11);

		System.out.println("Monstro possui " + monstro.vida + " de vida!");
		System.out.println("Heroi possui " + heroi.vida + " de vida!");
		
		//no X o deltaX == 0 e no Y o deltaY == 1, logo eh possivel realizar o ataque X1 contra X2
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro possui " + monstro.vida + " de vida!");
		System.out.println("Heroi possui " + heroi.vida + " de vida!");
	}
}
