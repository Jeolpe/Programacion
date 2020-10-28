/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio8 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner (System.in);
    int respuesta = 1;
    
    while ( respuesta > 0){
      System.out.println("Escriba el número para obetener el cuadrado ( pulse 0 para salir).");
      respuesta = s.nextInt();
      System.out.println("");
        if ( respuesta > 0){
          System.out.println("El cuadrado del número introducido es: " + respuesta * respuesta);
          System.out.println("");
        }
    }
		System.out.println("Usted ha salido conrrectamente");
	}
}

