/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Piramidematrix1 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Escribe la altura de la piramide:");
    for(int i = 1; i <= 5; i++){
      for( int j = 1; j <= i; j++){
        System.out.print("*");
        }
        System.out.println("");
      }
    for (int k = 4; k >= 1; k--){
      for(int l = 1; l <= k; l++){
        System.out.print("*");
        }
        System.out.println("");
      }
	}
}

