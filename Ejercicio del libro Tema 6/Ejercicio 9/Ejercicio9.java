/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio9 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int a = 0;
    int contador = 0;
    
    a = (int)(Math.random()*101);
    
    while(a != 24){
      if(a %2 ==0){
        contador++;
        System.out.print(a + " ");
        }
      a = (int)(Math.random()*101);
      }
      System.out.println("");
      System.out.println("");
      System.out.print("Se han generado " + contador + " números antes de llegar al número 24");
  }
}

