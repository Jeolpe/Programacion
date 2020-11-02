/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio8 {
	
	public static void main (String args[]) {
		
    Scanner s = new Scanner(System.in);
    int num_uno   = 0;
    int resultado =  0;
    
    System.out.println("Escribe un número entero del 1 al 10");
    num_uno = s.nextInt();
    
    for(int i = 0; i <= 10; i++){
      resultado = num_uno * i;
      
      System.out.println(num_uno + " x " + i + " = " + resultado);
      }
	}
}

