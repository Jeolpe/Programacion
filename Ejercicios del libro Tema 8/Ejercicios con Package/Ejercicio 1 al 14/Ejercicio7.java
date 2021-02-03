/*
 *@utor Jesús María Olalla Pérez 
 */
import Matematicas.Primary;
import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = 0;
    int posc = 0;
		
    System.out.print("Escribe un número entero positivo: ");
    n = sc.nextInt();
    
    System.out.print("Escribe la posición del número: ");
    posc = sc.nextInt();
    
    System.out.print("La posición " + posc + " del número " + n + " es: " + Primary.devuelveDigito(n,posc));
	}
}

