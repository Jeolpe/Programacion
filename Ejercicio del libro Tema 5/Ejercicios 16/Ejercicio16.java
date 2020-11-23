/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio16 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int contador = 0;
    int n = 0;
    
    System.out.println("Escribe un número");
    n = s.nextInt();
    
    for(int i = 1; i <= n; i++){
      if(n % i == 0){
        contador++;
        }
      }
    
    if(contador == 0){
      System.out.println("Es un número primo");
      
    }else{
      System.out.println("El número no es primo");
      }
    
		
	}
}

