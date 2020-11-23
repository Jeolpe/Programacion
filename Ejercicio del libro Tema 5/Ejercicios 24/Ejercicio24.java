/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio24 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int h = 0;
    
    System.out.println("Escribe la altura que quieres que tenga la piramide");
    h = s.nextInt();
    
    for(int i = 1; i <= h; i++){
      for(int j = (h+h)-i; j >= h; j--){
        System.out.print(" ");
        }
        for(int k = 1; k <= i; k++){
          System.out.print(k);
          }
          for(int l = i-1; l >= 1; l--){
        System.out.print(l);
        }
        System.out.println("");
      }
      
		
	}
}

