/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio36 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    long n = 0;
    long n2 = 0;
    long r = 0;
    
    System.out.print("Escribe un número: ");
    n = s.nextLong();
    
    n2 = n;
    while(n2 > 0){
      r = (r*10) + (n2%10);
      n2/= 10;
      }
      
      if(r == n){
        System.out.print(n + " si es capicúa");
        
        }else{
          System.out.print(n + " no es capicúa");
    }
  }
}

