/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio39 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int r = 1;
    System.out.print("Escribe un número: ");
    n = s.nextInt();
    
    for(int i = 1; i <= n; i++){
     for(int j = 1; j <= i;j++){
       r*= j;
       } 
       System.out.println(i+"!"+ " = " + r ); 
       r = 1;
      }
	}
}

