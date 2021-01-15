/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio53{
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int h = 0;
    
    System.out.print("Por favor, introduzca la altura de la figura: ");
    h = s.nextInt();
    
    for(int i = 1; i <= h; i++){
      for(int j = h; j >= i; j--){
       System.out.print("*"); 
        }
        System.out.println("");
      }
    
    
		
	}
}

