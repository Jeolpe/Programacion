/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio11 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int resultado = 0;
    int num_uno = 0;
    
    System.out.println("Introduce un número cualquiera");
    num_uno = s.nextInt();
    
    for(int i = 0; i <= 5; i++){
      for (int j = 0; j <= i; j++){
        resultado = num_uno + i;
        }
        System.out.println("El cuadrado de  " + resultado + " es " + resultado * resultado);
        System.out.println("El cubo de  " + resultado + " es " + resultado * resultado * resultado);
      }
      
		
	}
}

