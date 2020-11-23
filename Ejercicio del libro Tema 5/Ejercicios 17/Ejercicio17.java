/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio17 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int aux = 0;
    
    do{
    System.out.println("Escribe un número (positivo)");
    n = s.nextInt();
     if (n >= 0){
      for(int i = n; i <= (n + 100); n++){
      aux+= i;
       }
     }
   } while(n < 0);
    
    System.out.println("La suma de los 100 números siguiente son: " + aux);
		
	}
}

