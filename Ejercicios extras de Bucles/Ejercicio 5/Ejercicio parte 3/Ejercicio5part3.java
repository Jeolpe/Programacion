/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio5part3 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int num_uno = 0;
    int total = 0;
    
    System.out.println("Escribe el número de filas que quiere que sea la piramide");
    num_uno = s.nextInt();
    
    System.out.println("Número introducido es: " + num_uno);
    
    for ( int i = num_uno; i >= 1; i--){
      for (int j = num_uno; j >= i; j--){
        System.out.print(" ");
      }
      for (int k = num_uno; k >= i; k--){
        System.out.print(k);
        }
        System.out.println("");
      }
		
	}
}


