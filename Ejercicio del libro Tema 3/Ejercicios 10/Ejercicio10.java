/*
 *@utor Jesús María Olalla Perez
 */

import java.util.Scanner;
public class Ejercicio10 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    double a            = 0;
    double resultado    = 0;
   
   
    
    System.out.println(" Con cuántos Kb quieres que haga la conversión?");
    a = s.nextInt();
    
    resultado = a/1000;
    
   System.out.println(a + " Kb son  " + resultado + " Mb" );
	}
}

