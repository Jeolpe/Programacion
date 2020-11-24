/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio29 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int div = 0;
    
    System.out.print("Escribe un número: ");
    n = s.nextInt();
    
    System.out.print("Escribe un número para que sea divisible: ");
    div = s.nextInt();
    
    System.out.print("Los números no divisibles son: ");
    
    for(int i = 0; i < n; i++){
      
      if(i % div != 0){
       System.out.print(i + " ");
      }
    }
		
	}
}

