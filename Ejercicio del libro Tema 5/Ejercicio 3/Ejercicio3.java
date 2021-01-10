/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio3 {
	
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
    int i = 0;
    
    do{
      if(i < 100){
        System.out.print(i + ",");
      i+=5;
       }else{
         System.out.print(i);
         i+=5;
         }
        
    } while (i<=100);
  }
}

