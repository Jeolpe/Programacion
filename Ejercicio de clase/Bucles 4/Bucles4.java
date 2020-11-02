/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Bucles4 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int num_uno   = 0;
    int num_dos   = 0; 
    int resultado = 1;
   
    
    System.out.println("Escribe un número cualquiera");
    num_uno = s.nextInt();
    
    System.out.println("Escribe el número de veces que quieras ver la potencia");
    num_dos = s.nextInt();
    
    for (int i = 1; i <= num_dos; i++){
      
    resultado = num_uno * resultado ;
       
    System.out.println(num_uno + "^" + i + " = " + resultado);
    
    }
  }
}

