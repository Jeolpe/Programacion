/*
 *@utor Jesús María Olalla Pérez 
 */
import Matematicas.Primary;
import java.util.Scanner;

public class Ejercicios11 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n    = 0;
    int digi = 0;
    
    System.out.print("Escribe un número entero positivo: ");
    n = sc.nextInt();
    
    System.out.print("Escribe el dígito que quiera añadir por detrás al número: ");
    digi = sc.nextInt();
    
    System.out.print("El número con el dígito añadido es el: " + Primary.pegaDigitoPorDetras(n,digi));
		
	}
}

