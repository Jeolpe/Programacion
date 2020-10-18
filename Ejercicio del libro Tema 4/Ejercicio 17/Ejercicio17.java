/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio17 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int num_uno = 0;
    int resultado = 0;
    
    System.out.println("Escribe un número cualquiera");
    num_uno = s.nextInt();
    
    resultado = num_uno % 10;
    
    System.out.println("La última cifra del número es: " + resultado);
    
    
    
		
	}
}

