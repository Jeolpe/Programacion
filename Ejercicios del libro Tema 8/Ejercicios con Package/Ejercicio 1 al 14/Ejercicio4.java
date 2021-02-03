/*
 *@utor Jesús María Olalla Pérez 
 */
import Matematicas.Primary;
import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    int base = 0;
    int exp  = 0;
    
    System.out.print("Escribe la base: ");
    base = sc.nextInt();
    
    System.out.print("Escribe el Exponente: ");
    exp = sc.nextInt();
    
    System.out.print("La potencia del número " + base + " con exponente " + exp + " es: " + Primary.potenciaNumero(base,exp));
		
	}
}

