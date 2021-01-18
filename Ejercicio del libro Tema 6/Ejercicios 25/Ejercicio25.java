/*
 * @utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio25 {
	
	public static void main (String args[]) {
    boolean primo = true;
	
  for(int i = 1; i <= 100; i++){
    int a = (int)(Math.random()*191 + 10);
    
    primo = true;
    for(int j = 2; j < a; j++){
      if(a % j == 0){
        primo = false;
        }
      }
    if(a % 5 == 0){
      System.out.print("[" + a + "]" + " ");
      }
      if(primo){
        System.out.print("#"+ a + "#");
        
      }
    }	
	}
}

