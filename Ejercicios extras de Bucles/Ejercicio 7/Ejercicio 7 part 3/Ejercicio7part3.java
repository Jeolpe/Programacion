/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio7part3 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int h = 0;
    
    System.out.println("¿Cuántos escalones quieres que tenga tu pirámide?");
    h = s.nextInt();
    
     System.out.println("El número introducido es: " + h);
    
    for ( int i = 1; i <= h; i++){
      for ( int j = h - 1 ;j >= i; j--){
      System.out.print(" ");
      }
      for (int k = 1; k <= i; k++){
        System.out.print(k);
        }
        System.out.println("");
      }
		
	}
}

