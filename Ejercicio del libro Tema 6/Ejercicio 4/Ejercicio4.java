/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio4 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
     int num_uno = 0;
    
    for( int i = 1; i <= 20; i++){
        num_uno = (int)(Math.random() * 10 + 1);
        System.out.print(num_uno + ", ");
      }
		
	}
}

