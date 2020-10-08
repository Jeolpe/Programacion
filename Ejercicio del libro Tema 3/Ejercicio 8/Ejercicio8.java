/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio8 {
	
	public static void main (String args[]) {
  
  Scanner s = new Scanner(System.in);
  
  int hour       = 0;
  int day        = 0;
  int resultado1 = 0;
  int resultadofinal = 0; 
  String name  = "";
  
  System.out.println("¿Cual es su nombre?");
  name = s.nextLine();
  
  System.out.println("Cuántos días a la semana trabajas?");
  day = s.nextInt();
  
  System.out.println("Cuántas horas al día trabajas?");
  hour = s.nextInt();
  
  resultado1 = hour * 12;
  resultadofinal = resultado1 * day;
  
  System.out.println("El salario semanal de " + name + " es de " + resultadofinal + "€ a la semana");
  
		
	}
}

