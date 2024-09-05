package controller;

import java.util.Random;

public class Initialize {

	private int[][] randomNumbersMatriz(int[][] matriz){
		Random rand = new Random();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = rand.nextInt(1,200);}}
		return matriz;
	}
	
	public int[][] getRandomNumbersMatriz(int[][] matriz){
		return randomNumbersMatriz(matriz);}
}