/*
 *@utor Jesús María Olalla Pérez
 */
import java.util.Scanner;
public class Ejercicio9 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int contador = 1;
    int num_uno = 0;
    int n = 0;
    
    System.out.println("Escribe un número y te diré cuantos dígitos tiene");
    num_uno = s.nextInt();
    
    n = num_uno;
    while(num_uno > 10){
      num_uno/= 10;
      contador++;
      }
		System.out.println("EL número " + n + " tiene: " + contador + " dígitos");
	}
}

