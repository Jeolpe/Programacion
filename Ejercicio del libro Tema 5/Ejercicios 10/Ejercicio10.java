/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio10 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int num_uno = 0;
    int aux = 0;
    int contador = 0;
    
    do{
      System.out.println("Introduce un número positivo (Para finalizar introduce un número negativo)");
      num_uno = s.nextInt();
      
      if(num_uno >= 0){
        System.out.println("Usted ha introducido un número positivo");
        aux+= num_uno;
        num_uno = 0;
        contador++;
        
      }else {
        System.out.println("Usted ha introducido un número negativo");
      }
    } while (num_uno >= 0);
    
		System.out.println("La media del número es: " + aux / contador);
	}
}

