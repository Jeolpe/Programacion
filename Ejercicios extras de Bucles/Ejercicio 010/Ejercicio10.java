/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio10 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    String palabra = "";
    String resultado = "";
    String espacio = " ";
    
    while(!palabra.equals("salir")){
      System.out.println("Escribe palabras para formar una frase(Escribe salir para quieras terminar la frase)");
      palabra = s.nextLine();
      System.out.println("");
        if (!palabra.equals("salir")){ 
          resultado = resultado + espacio + palabra;
      
        }
    }
		System.out.println("La frase introducida es: " + resultado);
	}
}

