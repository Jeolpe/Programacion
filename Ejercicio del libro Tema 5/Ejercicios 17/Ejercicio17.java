/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio17 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int suma = 0;
    int n = 0;
    int i = 0;
    
    System.out.print("Escribe un número: ");
    n = s.nextInt();
    
    for(i = 0; i <= 100; i++){
      suma+= (n+i);
      }
      
      System.out.print("La suma de los 100 siguientes números al " + n + " = " + suma);
  }
}

