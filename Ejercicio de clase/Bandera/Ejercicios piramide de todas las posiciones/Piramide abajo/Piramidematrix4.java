/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Piramidematrix4 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    
    for(int i = 1; i <= 9; i+= 2){
      for(int j = 2; j <= i-1; j+=2){
        System.out.print(" ");
        } 
        for( int k = 9; k >= i; k--){
          System.out.print("*");
           
        }
        System.out.println("");
      }
		
	}
}

