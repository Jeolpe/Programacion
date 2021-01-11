/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio13 {
	
	public static void main (String args[]) {
		
    Scanner s = new Scanner(System.in);
    int n = 0;
    int negativo = 0;
    int positivo = 0;
    
    System.out.println("Introduzca 10 números enteros : ");
    for(int i = 0; i < 10; i++){
      n = s.nextInt();
      if(n < 0){
        negativo++;
      }else{
        positivo++;
        }
      }
      System.out.println("Los números positivos son: " + positivo);
      System.out.println("Los números negativos son: " + negativo);
	}
}

