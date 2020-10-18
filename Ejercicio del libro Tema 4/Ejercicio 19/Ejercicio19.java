/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio19 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    
    int num_uno = 0;
    int resultado = 0;
    
    System.out.println("Introduce un número entero");
    num_uno = s.nextInt();
    
    if (num_uno < 10){
      resultado = 1;
     } else if (( num_uno >= 10) && (num_uno < 100)){
       resultado = 2;
    } else if ((num_uno >= 100) && (num_uno < 1000)) {
      resultado = 3;
    } else if ((num_uno >= 1000) && (num_uno < 10000)) {
      resultado = 4;
    } else if ((num_uno >= 10000)) {
      resultado = 5;
      
      }
      
      System.out.println("El número introducido tiene " + resultado + " dígitos"); 
      
        
    
       
       
      
      
		
	}
}

