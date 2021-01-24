/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio15 {
	
	public static void main (String args[]) {
    
    System.out.print("Los números primos son: ");
    for(int i = 1; i < 1001; i++){
      if(esPrimo(i)){
        System.out.print(i + " ");
        }
      }
		
	}
  
  public static boolean esPrimo(int x){
    for(int i = 2; i < x; i++){
      if(x % i == 0){
        return false;
        }
      }
      return true;
    }
}

