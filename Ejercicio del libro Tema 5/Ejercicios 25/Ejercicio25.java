/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio25 {
	
	public static void main (String args[]) {
		
    Scanner s = new Scanner(System.in);
    int n = 0;
    int v = 0;
    
    System.out.println("Escribe un número cualquiera");
    n = s.nextInt();
    
      
      while(n > 0){
        v = (v * 10) + (n % 10);
        n/= 10;
        }
        
      System.out.println(v);
    
	}
}

