/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio25 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int r = 0;
    
    System.out.print("Escribe un número: ");
    n = s.nextInt();
    
    for(int i = 0; i < 4; i++){
      for(int j = 4; j >= i; j--){
        System.out.print(" ");
        }
      for(int k = 0; k <= i; k++){
        r = n+k;
        System.out.print(r-i);
        } 
        if(i >=1){
      for(int l = 1; l <= i; l++){
        System.out.print(n-l);
        }
      }
        System.out.println("");
    }
  } 
}

