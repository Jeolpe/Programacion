/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio21 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int not = 0;
    int not2 = 0;
    String recup = "";
    int resultado = 0;
    
    System.out.println("¿Cual es la nota que has sacado en el primer examén?");
    not = s.nextInt();
    
   System.out.println("¿Cual es la nota que has sacado en el segundo examén?");
   not2 = s.nextInt();
   
   resultado = (not + not2)/2;
   
   if (resultado >= 5){
   System.out.println("Enhorabuena, has aprobado!!... Tú nota media es: " + resultado);
   
    } else if ( resultado < 5){
      System.out.println("¿Cuál ha sido el resultado de la recuperación? apto o no apto");
      recup = s.next();
      if (recup.equals("apto")){
       System.out.println("La nota media de programación es un 5");
    } else {
      System.out.println("Ha suspendido usted el curso");
       
        }
      
      
      
      
      
    }
		
	}
}

