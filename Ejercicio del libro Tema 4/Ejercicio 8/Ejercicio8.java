/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio8 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    
    double nota_uno  = 0;
    double nota_dos  = 0;
    double nota_tres = 0;
    double result = 0;
    
    System.out.println("¿Cuál es la nota que has sacado en el primer examén?");
    nota_uno = s.nextInt();
    
    System.out.println("Cuál es la nota que has sacado en el segundo examén?");
    nota_dos = s.nextInt();
    
    System.out.println("Cual es la nota que has sacado en el tercer examén?");
    nota_tres = s.nextInt();
    
    result = (nota_uno + nota_dos + nota_tres)/3; 
    
    if (result < 5){
      System.out.println("Tú nota media es un: " + result + ", es un insuficiente");
    } else if (result >= 5 && result <  6){
      System.out.println("Tú nota media es un: " + result + ", es un suficiente");
    } else if (result >= 6 && result < 7){
      System.out.println("Tú nota media es un: " + result + ", es un bien");
    } else if (result >= 7 && result <9){
      System.out.println("Tú nota media es un: " + result + ", es un notable");
    } else if (result >= 9 && result == 10){
      System.out.println("Tú nota media es un: " + result + ", es un sobresaliente");
    } else {
      System.out.println("Error en el sistema, repita el procedimiento");
   }
  }
}



