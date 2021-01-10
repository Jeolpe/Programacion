/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio9 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int aux = 0;
    int contador = 0;
    int d = 0;
    
    System.out.print("Escribe un número: ");
    n = s.nextInt();
    
    do{
      n = n/10;
      contador++;
      }while ( n > 0);
      d = contador;
      System.out.print("La cantidad de digito que tiene el número introducido es de: " + d );
		
	}
}

