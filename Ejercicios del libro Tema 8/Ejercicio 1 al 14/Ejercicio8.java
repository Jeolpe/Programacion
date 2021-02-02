/*
 *@utor Jesús María Olalla Pérez 
 */
import Matematicas.Primary;
import java.util.Scanner;

public class Ejercicio8 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n    = 0;
    int digi = 0;
    
    System.out.print("Escribe un número entero positivo: ");
    n = sc.nextInt();
    
    System.out.print("Escribe un dígito para saber la posición de dicho número: ");
    digi = sc.nextInt();
    
    System.out.print("El dígito: " + digi + " del número: " + n + " se encuentra en la posición: " + Primary.posicionDeDigitos(n,digi));
		
	}
}

