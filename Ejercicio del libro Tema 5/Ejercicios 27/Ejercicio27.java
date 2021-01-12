/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio27 {
	
	public static void main (String args[]) {
		
    Scanner s = new Scanner(System.in);
    int n = 0;
    
    System.out.print("Escribe un número: ");
    n = s.nextInt();
    boolean impar = true;
    
    for(int i = 1; i <= n; i++){
      impar = false;
      if(i % 3 == 0){
        impar = true;
        }
        if (impar){
          System.out.print(i + " ");
          }
      }
	}
}

