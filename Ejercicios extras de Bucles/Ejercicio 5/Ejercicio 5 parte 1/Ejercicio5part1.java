/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio5part1 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int num_uno = 0;
    int total = 0;
    
    System.out.println("Escribe el número de filas que quiere que sea la piramide");
    num_uno = s.nextInt();
    
    System.out.println("Número introducido es: " + num_uno);
    
    for ( int i = 1; i <= num_uno; i++){
      
      for (int j = 1; j <= i; j++){
        System.out.print(" ");
        }
        System.out.print(i);
        System.out.println("");
      }
		
	}
}

