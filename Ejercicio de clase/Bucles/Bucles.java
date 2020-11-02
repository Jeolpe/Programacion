/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Bucles {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    
    String frase = "";
    int cont = 0;
    
    System.out.println("Escriba usted una frase a su gusto");
     frase = s.nextLine();
     
     System.out.println("Escriba cuantas veces quiere que se repita el número");
     cont = s.nextInt();
     
     for( int i = 0; i <= cont; i++){
       System.out.println(frase + " " + i);
       } 
     
		
	}
}

