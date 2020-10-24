/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio7part2 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int h = 0;
    
    System.out.println("¿Cuántos escalones quieres que tenga tu pirámide?");
    h = s.nextInt();
    
     System.out.println("El número introducido es: " + h);
    
    for ( int i = h; i >= 1; i--){
      for ( int j = (1 + 1) ;j <= i; j++){
      System.out.print(" ");
      }
      for (int k = h; k >= i; k--){
        System.out.print(i);
        }
        System.out.println("");
      }
		
	}
}

