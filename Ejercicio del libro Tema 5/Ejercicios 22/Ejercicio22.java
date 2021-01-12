/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio22 {
	
	public static void main (String args[]) {
		
    Scanner s = new Scanner(System.in);
    int r = 0;
    boolean primo = true;
    
    for(int i = 2; i <= 100; i++){
      primo = true;
      for(int j = 2; j < i; j++){
        if (i % j == 0){
          primo = false;
          }
        
        }
        if(primo){
        System.out.print(i + " ");
        }
      }
      
      
    
	}
}

