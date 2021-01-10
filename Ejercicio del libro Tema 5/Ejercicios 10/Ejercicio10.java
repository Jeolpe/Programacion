/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio10 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int aux = 0;
    int contador = 0;
    int n = 0;
    int resultado = 0;
    
    do{
      System.out.print("Escribe un número positivo: ");
      n = s.nextInt();
      if (n >= 0){
      aux= aux + n;
      contador++;
      }
    }while(n >= 0);
      resultado = aux/contador;
      
    System.out.print("La media de todos los números introducidos son: " + resultado);
	}
}

