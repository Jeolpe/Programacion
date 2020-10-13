/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio7 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    
    double nota_uno  = 0;
    double nota_dos  = 0;
    double nota_tres = 0;
    double result = 0;
    
    System.out.println("¿Cuál es la nota que has sacado en el primer examén?");
    nota_uno = s.nextInt();
    
    System.out.println("Cuál es la nota que has sacado en el segundo examén?");
    nota_dos = s.nextInt();
    
    System.out.println("Cual es la nota que has sacado en el tercer examén?");
    nota_tres = s.nextInt();
    
    result = (nota_uno + nota_dos + nota_tres)/3; 
    
    System.out.println("La nota media es de : " + result);
  }
}

