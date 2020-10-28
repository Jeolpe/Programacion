/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio9 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int respuesta = 1;
    int contador = 0;
    
    while((respuesta > 0) && (contador < 4)){
      contador ++;
      
      System.out.println("Introduce un número para calcular su cuadrado (pulse 0 o 4 números para salir");
      respuesta = s.nextInt();
      System.out.println("");
      
        if(respuesta > 0){
         System.out.println("El cuadrado del número introducido es: " + respuesta * respuesta);
         System.out.println("");
          
          }
          
      }
		System.out.println("Usted ha salido correctamente");
	}
}

