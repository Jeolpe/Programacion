/*
 *@utor Jesús María Olalla Pérez 
 */
import Matematicas.Primary;
import java.util.Scanner;

public class Ejercicios13 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n         = 0;
    int digimenor = 0;
    int digiMayor = 0;
    
    System.out.print("Escribe un número entero positivo: ");
    n = sc.nextInt();
    
    System.out.print("Escribe el interbalo menor: ");
    digimenor = sc.nextInt();
    
    System.out.print("Escribe el interbalo mayor: ");
    digiMayor = sc.nextInt();
    
    System.out.print("El número con el dígito añadido es el: " + Primary.trozoDeNumero(n,digimenor, digiMayor));
		
	}
}

