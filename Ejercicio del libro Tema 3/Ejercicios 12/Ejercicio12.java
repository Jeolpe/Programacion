/*
 *@utor Jesús Maria Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio12 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int    num_uno   = 0;
    int    num_dos   = 0;
    double resultado = 0;
    
    System.out.println("Cuanto has sacado en el primer examén?");
    num_uno = s.nextInt();
    
    System.out.println("¿Que nota media deseas tener?");
    num_dos = s.nextInt();
    
    resultado = (num_dos *2)-num_uno;
    
    System.out.println("La nota que tienes que sacar es " + resultado);		
	}
}

