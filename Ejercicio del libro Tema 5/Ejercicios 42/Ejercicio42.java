/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio42 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    boolean primo = true;
    
    System.out.print("Escribe un número: ");
    n = s.nextInt();
		
    for(int i = n; i <= n+5; i++){
      primo = true;
      for(int j = 2; j < i; j++){
        if(i % j == 0){
          primo = false;
          }
        }
        if(primo){
        System.out.print(i + " ");
      }
      }
	}
}

