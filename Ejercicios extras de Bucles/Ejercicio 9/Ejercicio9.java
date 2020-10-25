/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio9 {
	
	public static void main (String args[]) {
		
    Scanner s = new Scanner(System.in);
      int respuesta = 0;
      int total = 0;
    System.out.println("introduzca un número entero ( 0 para salir)");
    respuesta = s.nextInt();
    
      
    if( respuesta > 0){
    System.out.println("El cuadrado de " + respuesta + " es " + (respuesta * respuesta));
    System.out.println("");
    
    for ( int i = 1; i < 4; i++){
    System.out.println("introduzca un número entero ( 0 para salir)");
    respuesta = s.nextInt();
    
    if( respuesta > 0){
    System.out.println("El cuadrado de " + respuesta + " es " + (respuesta * respuesta));
    System.out.println("");
      
  
   } else {
     System.out.println("Usted ha salido correctamente");
    // esto es para finalizar el bucle// 
    i = 5;
  }
     }
   
    
     } else {
     System.out.println("Usted ha salido correctamente");
    
    }
	}
}
