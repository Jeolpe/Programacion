/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio28 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int multi = 1;
    
    System.out.println("Escribe un número para introducir el número factorial");
    n = s.nextInt();
    
    for(int i = 1; i <= n; i++){
      multi*= i;
      }
      
    System.out.println( n + "! = " +  multi);
		
	}
}

