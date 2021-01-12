/*
 *@utor Jesús María Olalla Pérez;
 */

import java.util.Scanner;
public class Ejercicio29 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int f = 1;
    
    System.out.print("Escribe un número: ");
    n = s.nextInt();
    
    for(int i = 1; i <= n; i++){
      f*=i;
      }
      System.out.print(n + "! = " + f);
  }
}

