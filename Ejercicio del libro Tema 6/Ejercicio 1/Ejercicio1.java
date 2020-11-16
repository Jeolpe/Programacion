/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio1 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int resultado = 0;
    int num_uno   = 0;
    int tirada = 0;
    int suma = 0;
    System.out.println("Este programa muestra la tirada de un dado del 1 al 3");
    
    for(int i = 1; i <= 3; i++){
    tirada = (int)(Math.random() * 3 + 1);
     System.out.println("El resultado del dado es: " + tirada + " ");
     suma += tirada;
    }
    System.out.println("El resultado de los números sobtenidos en los dados son: " + suma);
	}
}

