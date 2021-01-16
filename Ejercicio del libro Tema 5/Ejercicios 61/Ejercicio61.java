/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio61 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int h = 0;
    
    System.out.print("Escribe la altura: ");
    h = s.nextInt();
    
    if(h >= 3){
    for(int i = 1; i <= h; i++){
      for(int m = 1; m < i; m++){
        System.out.print(" ");
        }
      for(int j = 1; j <= 3; j++){
        System.out.print("*");
        }
        for(int k = 2*(h); k > i+i; k--){
          System.out.print(" ");
          }
          for(int l = 1; l <= 3; l++){
        System.out.print("*");
        }
        System.out.println("");
      }
    }else{
      System.out.print("Escriba una altura mayor o igual a 3.");
    }
  }
}

