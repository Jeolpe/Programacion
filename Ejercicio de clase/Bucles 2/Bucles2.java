/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Bucles2 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int num_uno   = 0;
    int num_dos   = 0;
    int resultado = 0;
    
    for (int i = 1; i <= 10; i++){
      
    System.out.println("Escribe el primer número");
    num_uno = s.nextInt();
    
    System.out.println("Escribe el segundo número");
    num_dos = s.nextInt();
    
    resultado = num_uno + num_dos;
    
    System.out.println("El resultado de la suma es: " + resultado);
    System.out.println(" ");
    
    }
    
  }
}

