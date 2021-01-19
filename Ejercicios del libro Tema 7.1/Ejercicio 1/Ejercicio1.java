/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio1 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
		
    int[]num = new int[12];
    num[0] = 30;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;
    
    for(int n: num){
    System.out.print(n + " ");
  }
  //Como podemos ver, los valores que no son introducidos son sustituidos por 0.
	}
}

