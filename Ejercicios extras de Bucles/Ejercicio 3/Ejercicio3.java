/*
@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio3 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner (System.in);
    int start = 0;
    int salto = 0;
    int fila  = 0;
    
    System.out.println("Introduzca el primer número");
    start = s.nextInt();
    
    System.out.println("Introduzca el salto");
    salto = s.nextInt();
    
    System.out.println("Introduzca la cantidad de números ");
    fila = s.nextInt();
    
   
    
    for (int i = start; i <= (salto * start) ; i+= salto){
      if (i < (salto * start)){
        System.out.print(i + "-");
      } else {
        System.out.print(i);
        }
      }
    
		
	}
}

