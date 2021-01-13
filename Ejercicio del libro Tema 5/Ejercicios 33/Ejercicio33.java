/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio33 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int h = 0;
    
    System.out.print("Introduce la altura de la U: ");
    h = s.nextInt();
    
    for(int i = 1; i < h; i++){
      System.out.print("*");
      for(int j = 1; j <= h-2; j++){
        System.out.print(" ");
        }
        System.out.print("*");
        System.out.println("");
      }
     for(int k = 0; k <= 0; k++){
       System.out.print(" ");
       for(int l = 1; l <= h-2; l++ ){
         System.out.print("*");
         }
       }
		
	}
}

