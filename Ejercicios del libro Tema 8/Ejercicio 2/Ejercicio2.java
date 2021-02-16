/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio2 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n = 0;
    
    System.out.print("Escribe un número entero positivo: ");
    n = sc.nextInt();
    
    if(bucle(n)){
      System.out.print("El número introducido es primo");
      }else{
        System.out.print("El número introducido NO es primo");
      }
		
	}
  
  public static boolean bucle(int x){
    for(int i = 2; i < x; i++){
      if(x % i == 0){
        return false;
          
          }
      }
     return true;
   }
 }


