/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio11 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int num_uno = 0;
    int resultado = 0;
    int cuadrado = 0;
    int cubo = 0;
    
    
    
    System.out.println("Escribe un número entero");
    num_uno = s.nextInt();
    System.out.println("Los 5 siguientes números enteros son:");
      
    
    int i = 1;
    while(i <= 5){
      resultado = num_uno + i;
      cuadrado = resultado * resultado;
      cubo = resultado * resultado * resultado;
       
      System.out.println("El cuadrado de los números: " + resultado + "^2 = " + cuadrado );
      System.out.println("El cubo de los números: " + resultado + "^3 = " + cubo );
      
      i++;
      }
    
    
		
	}
}

