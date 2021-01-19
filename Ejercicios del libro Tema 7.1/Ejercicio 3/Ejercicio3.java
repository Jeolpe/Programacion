/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio3 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    
    int[]n = new int[10];
    n [0] = 1;
    n [1] = 2;
    n [2] = 3;
    n [3] = 4;
    n [4] = 5;
    n [5] = 6;
    n [6] = 7;
    n [7] = 8;
    n [8] = 9;
    n [9] = 10;
    
    for(int i = 9; i >= 0; i--){
      System.out.print(n[i] + " ");
      }
  }
}

