/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio1 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int suma = 0;
    
    for(int i = 1; i <= 3; i++){
      int tirada = (int)(Math.random()*6) + 1;
      System.out.println("El " + i + "º DADO ha salido: " + tirada);
      suma+=tirada;
      }
      System.out.print("La suma de todos los números del dado es: " + suma);
  }
}

