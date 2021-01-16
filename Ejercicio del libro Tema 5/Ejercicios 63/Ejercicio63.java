/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio63 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int h = 0;
    int h2 = 0;
    
    System.out.print("Escribe la altura de la primera piramide: ");
    h = s.nextInt();
    
    System.out.print("Escribe la altura de la segunda piramide: ");
    h2 = s.nextInt();
    
    for(int i = 0; i < h; i++){
      for(int j = h-1; j > i; j--){
        System.out.print(" ");
        }
        
      for(int k = 0; k <= i+i; k++){
        System.out.print("*");
        }
        System.out.println("");
      }
       
      
		
	}
}

