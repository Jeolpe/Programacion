/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio5 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
     int num_uno   = 0;
     int resultado_uno = 0;
     int suma = 0;
     int maximo = 100;
     int minimo = 199;
    
    for ( int i = 1; i <= 50; i++){
        num_uno = (int)(Math.random() * 100) + 100;
        System.out.print(num_uno +  " " );
        suma+= num_uno;
        
        if (num_uno < minimo) {
            minimo = num_uno;
          }
        if (num_uno > maximo) {
            maximo = num_uno;
          }
      }
		resultado_uno = suma / 50;
    System.out.println("");
    System.out.println("");
    System.out.println("El resultado de la media de todos los números son: " + resultado_uno + " Además el número más alto es: " + maximo + " y el número más bajo es: " + minimo);
	}
}

