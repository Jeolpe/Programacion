/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio46 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int h = 0;
    int a = 0;
    
    System.out.print("Escribe la altura del rectangulo: ");
    h = s.nextInt();
    
    System.out.print("Escribe la anchura del rectangulo: ");
    a = s.nextInt();
    
    if(h >= 2 && a >= 2){
    for(int i = 0; i < a; i++){
      System.out.print("*");
      }
      System.out.println();
    for(int i = 1; i <= h-2; i++){
      System.out.print("*");
      for(int j = 0; j < a-2; j++){
        System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
      }
      for(int i = 0; i < a; i++){
      System.out.print("*");
      }
    }else{
      System.out.print("La altura y la anchura es incorrcta. Deben de ser ambas mayores o iguales a 2.");
    }
    
  }
}

