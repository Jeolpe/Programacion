/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio8 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    
    System.out.print("Introduce un número: ");
    n = s.nextInt();
    
    for(int i = 0; i<= 10; i++){
      for(int j = i; j <= i; j++){
      System.out.println(n + "x" + i +  " = " + n*i + " ");
      }
    }
  }
}

