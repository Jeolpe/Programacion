/*
 *@utor Jesús María Olalla Perez 
 */

import java.util.Scanner;
public class idea{
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    double lado   = 0;
    double base   = 0;
    double altura = 0;
    int opcion = 0;
    
		System.out.println(" CÁLCULO DE ÁREAS");
    System.out.println(" ----------------");
   System.out.println(" 1. Cuadrado");
    System.out.println(" 2. Rectángulo");
    System.out.println(" 3. Triángulo");
    System.out.println( "Elija una opción (1-3): ");
    opcion = s.nextInt();
    
    switch (opcion){
      
    case 1:
     System.out.println("Introduzca el lado del cuadrado en cm: ");
     lado = s.nextDouble();
     System.out.println("El área del cuadrado es " + (lado * lado) + " cm2");
     break;
     
     case 2:
      System.out.println("Introduzca la base del rectángulo en cm: ");
      base = s.nextDouble();
      System.out.println("Introduzca la altura del rectángulo en cm: ");
      altura = s.nextDouble();
      System.out.println("El área del rectángulo es " + (base * altura) + " cm2");
      break;
      
      default:
      System.out.println("Lo siento, la opción elegida no es correcta.");
    
    
      }
	}
}

