/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio2 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    
    char[]simbolo = new char[10];
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';
    
     for(char n: simbolo){
       System.out.print(n + " ");
       }
       // Como podemos observar al compilar, los caracteres ausentes se convierten en espacios en blanco.
	}
}

