/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Piramidematrix2 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int h = 0;
    
    for( int i = 1; i <= 5; i++){
      for (int m = 4; m >= i; m--){
        System.out.print(" ");
        }
      for( int j = 1; j <= i; j++){
        System.out.print("*");
        }
        System.out.println("");
      }
    for (int k = 4; k >= 1; k--){
      h++;
      for ( int n = 1; n <= h ; n++){
        System.out.print(" "); 
        }
      for(int l = 1; l <= k; l++){
        System.out.print("*");
        }
        System.out.println("");
      }
	}
}

