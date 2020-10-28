/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Piramidematrix3 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int h = 0;
    for( int i = 1; i <= 9; i+=2 ){
      h++;
      for ( int j = 4; j >= h ; j--){
        System.out.print(" ");
        }
        for( int k = 1; k <= i; k++){
          System.out.print("*");         
          }
          System.out.println("");
      }
    
	}
}

