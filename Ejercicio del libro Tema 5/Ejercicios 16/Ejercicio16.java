/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio16 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int i = 0;
    boolean primo = true;
    
    System.out.print("Escribe un número: ");
    n = s.nextInt();
    
    for(i = 2; i < n; i++){
      if( n % i == 0){
        primo = false;
        }
      }
      
    if(primo){
      System.out.print("El número es primo");
    }else{
    System.out.print("El número no es primo");
   }
  }
}

