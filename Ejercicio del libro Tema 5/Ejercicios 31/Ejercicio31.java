/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio31 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int r = 0;
    
    System.out.print("Introducimos la altura de la letra L: ");
    n = s.nextInt();
    
    for(int i = 0; i < n; i++){
      System.out.println("*");
      }
      r = (n/2)+1;
      for(int j = 0; j < r;j++){
        System.out.print("*");
      }
    }
}

