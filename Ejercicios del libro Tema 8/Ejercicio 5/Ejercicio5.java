/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio5 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n = 0;
    
    System.out.print("Escribe un número entero positivo: ");
    n = sc.nextInt();
    
    System.out.print( "El número volcado al revés es: " + voltea(n));
		
	}
  public static int voltea(int x){
    int x2 = x;
    int aux = 0;
    
    while(x2 > 0){
      aux = (aux * 10) + (x2 % 10);
      x2/= 10;
      }
      return aux;
   }
}


