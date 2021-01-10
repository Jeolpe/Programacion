/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio6 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int i = 320;
    
    do{
      if(i > 160){
      System.out.print(i + ",");
      i-=20;
       }else{
        System.out.print(i);
        i-=20;
      }
    }while(i >= 160);
     
  }
}

