/*
 *@utor Jesús María Olalla Perez
 */

import java.util.Scanner;
public class Ejercicio11 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int a            = 0;
    int resultado    = 0;
   
   
    
    System.out.println(" Con cuántos Mb quieres que haga la conversión?");
    a = s.nextInt();
    
    resultado = a*1000;
    
   System.out.println(a + " Mb son  " + resultado + " Kb" );
	}
}

