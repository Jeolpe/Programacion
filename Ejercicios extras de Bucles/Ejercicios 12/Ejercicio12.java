/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio12 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    String palabra = "";
    String resultado = "";
    String espacio = " ";
    int contador = 0;
    
    while(!palabra.equals("salir") && (contador < 4)){
      contador ++;
      System.out.println("Escribe palabras para formar una frase(Escribe salir para quieras terminar la frase)");
      palabra = s.nextLine();
        if (!palabra.equals("salir")){ 
          resultado = palabra + espacio + resultado;
          
        }
    }
    
		System.out.println("La frase introducida es: " + resultado);
    
      
  
	}
}

