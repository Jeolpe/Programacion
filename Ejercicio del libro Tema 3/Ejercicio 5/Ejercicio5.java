/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio5 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int b = 0;
    int h = 0;
    int resultado = 0;
    
    System.out.println("¿Cual es la base del triangulo?");
    b = s.nextInt();
    
    System.out.println("Cual es la altura del triangulo?");
    h = s.nextInt();
    
    resultado = b*h;
    
    System.out.println("");
    System.out.println("El area del rectangulo es: " + resultado);
    
		
	}
}

