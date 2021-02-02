/*
 *@utor Jesús María Olalla Pérez 
 */
import Matematicas.Primary;
import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n = 0;
    
    System.out.print("Escribe un número entero positivo:");
    n = sc.nextInt();
    
    System.out.print("El número: " + n + " tiene " + Primary.cuentaDigitos(n) + " dígitos.");
		
	}
}

