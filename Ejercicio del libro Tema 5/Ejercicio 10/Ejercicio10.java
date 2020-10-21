/*
*@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio10 {
	
	public static void main (String args[]) {
		
    Scanner s = new Scanner(System.in);
    double num_uno = 0;
    double suma = 0;
    double contador = 0;


    
    
    while ( num_uno >= 0){
      System.out.println("Escribe un número positivo. (En el caso de parar introduzca un número negativo)");
      num_uno = s.nextInt();
      contador++;
      suma = suma + num_uno;
      
      
      }
      System.out.println("La media de los números positivos introducidos son : " + suma/contador);
    
    
    
	}
}

