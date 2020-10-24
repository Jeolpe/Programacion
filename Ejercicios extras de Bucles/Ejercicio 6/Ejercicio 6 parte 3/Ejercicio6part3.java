/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio6part3 {
	
	public static void main (String args[]) {
		
    Scanner s = new Scanner(System.in);
    int num_uno = 0;
    
    System.out.println("Introduzca la altura");
    num_uno = s.nextInt();
    int total = 0;
    
    
    System.out.println("El número introducido es un: " + num_uno);
    
    for(int i = 1; i <= num_uno; i++){
      for (int j = 1; j <= i; j++){
        
        System.out.print(j);
      }
        System.out.println("");
      } 
	}
}

