/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio12 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int[][] n = new int[9][9];
    int m = Integer.MAX_VALUE;
    int M = Integer.MIN_VALUE;
    
    for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
        n[i][j] =(int)(Math.random()*(900-500)+1)+500;
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
      System.out.println("");
      for(int i = 9; i >= 0; i--){
        for(int j = 0 ; j < 9; j++){
          if(i == j){
            System.out.print(n[i][j] + " ");
            }
          }
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("El Mayor número es: " + M);
        System.out.print("El menor número es: " + m);
  }
}

