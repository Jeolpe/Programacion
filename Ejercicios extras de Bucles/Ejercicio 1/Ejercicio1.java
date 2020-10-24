/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio1 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int num_uno = 0;
    
    System.out.println("Introduzca la cantidad de números");
    num_uno = s.nextInt();
    
    for (int i = 1; i <= num_uno; i++){
      if(i < num_uno){
      System.out.print(i + "-");
      
       } else {
       System.out.println(i);
    }
   }
  }
}

