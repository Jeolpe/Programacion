/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio6{
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int alt = 0;
    double resultado_uno = 0;
    
    System.out.println("¿cuál es la altura que cae del objeto desde el suelo");
    alt = s.nextInt();
   
    double num_uno = (2*alt)/9.81;
    resultado_uno = Math.sqrt(num_uno);
    
    System.out.println("El resultado es : t = " + resultado_uno + " s");    
		
	}
}

