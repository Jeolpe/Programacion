/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio8 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int multi = 0;
    
    System.out.println("Escribe un número para calcular su tabla de multiplicar");
    multi = s.nextInt();
    
    for(int i = 0; i <= 10; i++){
      for(int j = i; j <= i; j++){
        System.out.print("La tabla de multiplicar del numero " + multi + " x " + j + " es " + multi * j);
        
        }
        System.out.println("");
      }
		
	}
}

