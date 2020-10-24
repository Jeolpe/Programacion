/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio4 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner (System.in);
    int start  = 0;
    int finish = 0;
    int salto  = 0;
    
    System.out.println("Introduzca el valor más alto");
    start = s.nextInt();
    
    System.out.println("Introduzca el valor más bajo");
    finish = s.nextInt();
    
    System.out.println("Introduzca el salto");
    salto = s.nextInt();
    
   
    for ( int i = start; i >= finish; i-= salto){
     if(i > finish) {
      System.out.print(i + "-");
       } else {
       System.out.print(i);
    }
   }
	}
}

