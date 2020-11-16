/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio7 {
	
	public static void main (String args[]) {
		
    Scanner s = new Scanner(System.in);
    int resultado = 0;
    int i = 0;
    
     System.out.println("Escribe la clave para abrir la caja");
    resultado = s.nextInt();
    
     if ( resultado == 4821){
      System.out.println("La caja fuerte se ha abierto satisfactoriamente");
      
    } else {
      System.out.println("Lo siento esa no es la combinación");
      System.out.println("");
      System.out.println("*******intentelo de nuevo******");
      
    
    
  
    }
  }
}    
 
      


