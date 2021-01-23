/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio11 {
	
	public static void main (String args[])
   throws InterruptedException {
    
    Scanner s = new Scanner(System.in);
    int[][] n = new int[10][10];
    int m = Integer.MAX_VALUE;
    int M = Integer.MIN_VALUE;
    
    for(int i = 0; i < 10; i++){
      for(int j = 0; j < 10; j++){
        n[i][j] = (int)(Math.random()*(900-500)+1)+500;
        System.out.print(n[i][j] + " ");
        if(n[i][j] < m){
          m = n[i][j];
          }else if(n[i][j] > M){
           M = n[i][j];
          }
        }
        System.out.println("");
      }
      System.out.println("");
      System.out.println("Los números de la diagonal superior a la inferior son: ");
      for(int i = 0; i < 10; i++){
        for(int j = 0; j < 10; j++){
          if(i == j){
            Thread.sleep(1000);
            System.out.print(n[i][j] + " ");
          }
        }
      }
    System.out.println("");
    System.out.println("");
		System.out.println("El mayor número es el: " + M);
    System.out.print("El menor número es el: " + m);
	}
}

