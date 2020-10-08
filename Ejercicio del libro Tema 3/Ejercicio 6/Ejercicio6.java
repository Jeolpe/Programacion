/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio6 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    double b = 0;
    double h = 0;
    double resultado = 0;
    
    System.out.println("¿Cual es la base del triangulo?");
    b = s.nextInt();
    
    System.out.println("Cual es la altura del triangulo?");
    h = s.nextInt();
    
    resultado = (b*h)/2;
    
    System.out.println("");
    System.out.println("El area del triangulo es: " + resultado);
    
		
	}
}


