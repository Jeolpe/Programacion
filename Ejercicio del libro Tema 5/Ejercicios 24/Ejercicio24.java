/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio24 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int r = 0;
    
    System.out.print("Escribe el número que quiere que aparezca en la piramide: ");
    n = s.nextInt();
    
    for(int i = 0; i < 4; i++){
      for(int j = 4; j >= i; j--){
        System.out.print(" ");
        }
      for(int k = 0; k <= i; k++){
        System.out.print(n + k);
        r = (n+k);
        }
        if(i >= 1){
      for(int l = 1; l <= i; l++){
        System.out.print(r-l);
        }
      }
        System.out.println("");
      }
  }
}

