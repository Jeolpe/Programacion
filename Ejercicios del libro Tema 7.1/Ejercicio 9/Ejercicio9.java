/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio9 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    boolean par = false;
    
   String verde = "\033[32m";
   String Azul = "\033[34m";
    
    int[] n = new int[8];
    
    System.out.println("Por favor, escribe 8 números: ");
   
    for(int i = 0; i < n.length; i++){
      n[i] = s.nextInt();
        }
    
    System.out.println("");
      System.out.println("Los números introducidos son: ");
      System.out.println("");
      for(int num:n){
        if(num % 2 == 0){
          System.out.println(num +  " es Par");
          }else{
            System.out.println(num + " es Impar");
        }
      }
		
	}
}

