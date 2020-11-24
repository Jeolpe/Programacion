/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio14 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int b = 0;
    int exp = 0;
    int aux = 1;
    
    System.out.println("Escribe la base");
    b = s.nextInt();
    
    System.out.println("Escribe el exponente");
    exp = s.nextInt();
    
    for(int i = 1; i <= exp; i++){
      
      aux*= b;
      }		
      
      System.out.println("El resultado de " + b + "^"+ exp + " es " + aux);
	}
}

