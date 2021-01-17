/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio10 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int a = 0;
    int a2 = 0;
    String c = "";
    
      
      for(int i = 1; i <= 10; i++){
        a2 = (int)(Math.random()*40) + 1;
        a = (int)(Math.random()*6) + 1;
    switch(a){
      case(1):
      c ="*" ;
      break;
      case(2):
      c ="-";
      break;
      case(3):
      c = "=" ;
      break;
      case(4):
      c = "." ;
      break;
      case(5):
      c ="|" ;
      break;
      case(6):
      c ="@" ;
      break;
      default:
      }
        for(int j = 1; j <= a2; j++){
      System.out.print(c);
          }
          System.out.println("");
          }
  }
}

