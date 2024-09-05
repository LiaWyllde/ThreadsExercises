package view;
import controller.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int option = 0;
		String menu = " def ";
		Scanner scan = new Scanner(System.in);
		Initialize ini = new Initialize();
		
        while(option != 9) {
        	
        	System.out.println(menu);
        	option = scan.nextInt();
        	
            switch (option) {
                case 1:
                	for (int i = 0; i < 5 ; i++) {
                		ThreadID see = new ThreadID();
                		see.setPriority(Thread.MAX_PRIORITY);
                		see.start(); }
                		//Interesting: the threads sometimes are printed before the next loop      	
                    break;
                    
                case 2:
                	int[][] matriz = new int[3][5];
                	matriz = ini.getRandomNumbersMatriz(matriz);
                	
                	for (int i = 0; i < 3 ; i++) {
                		ThreadMatriz see = new ThreadMatriz(matriz[i], i);
                		see.start(); }     	
                    break;
                    
                case 9:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Unavailable option");
                    break;
            }
        }
        scan.close();
	}

}


/*/
 * when start method is called a Thread is initialized and this method looks
 * for run method, where the instructions for Thread execution are contained
 * see.start();
 * any time a Thread is initialized we need an new object because a Thread 
 * can't be reinitialized, and it's like it's associated with the object
 * ThreadID see = new ThreadID();
/*/
