/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio13 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int a = 0;
    int a2 = 0;
    
     do{
      a = (int)(Math.random()*6)+1;
      a2 = (int)(Math.random()*6)+1;
      System.out.print(a + " ");
      System.out.println(a2 + " ");
      }while(a != a2);
      
      System.out.println("Los 2 dados han dado el mismo resultado: ");
      System.out.println("Dado 1: " + a);
      System.out.print("Dado 2: " + a2);
  }
}

