/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio3 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    
    System.out.println("Escribe un número del 1 al 7");
    n = s.nextInt();
    
    switch (n){
      case (1):
      System.out.println("Hoy es Lunes");
      break;
      case (2):
      System.out.println("Hoy es Martes");
      break;
      case (3):
      System.out.println("Hoy es Miércoles"); 
      break;
      case (4):
      System.out.println("Hoy es Jueves"); 
      break;
      case (5):
      System.out.println("Hoy es Viernes");
      break;    
      case (6):
      System.out.println("Hoy es Sábado"); 
      break; 
      case (7):
      System.out.println("Hoy es Domingo");
      break;
      default: 
      System.out.println("Error en el sistema, reinicie programa");
   }
 }
}

