package controller;

public class ThreadMatriz extends Thread {
	
	int[] array;
	int cont;
	
	public ThreadMatriz(int[] array, int cont) {
		this.array = array;
		this.cont = cont;
	}
	
	private void sumMatriz(int[] array, int cont) {
		int sum = 0;
		
		for (int num : array) {
			 sum += num;}

		System.out.print("A soma dos itens da linha " + (cont + 1) + " é: " + sum);
		System.out.println();	
	}
	
	@Override
	public void run() {
		sumMatriz(array, cont);
	}
}
