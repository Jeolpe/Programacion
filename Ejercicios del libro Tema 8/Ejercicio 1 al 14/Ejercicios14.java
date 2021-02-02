/*
 *@utor Jesús María Olalla Pérez 
 */
import Matematicas.Primary;
import java.util.Scanner;

public class Ejercicios14 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n_uno = 0;
    int n_dos = 0;
    
    System.out.print("Escribe un número entero positivo: ");
    n_uno = sc.nextInt();
    
    System.out.print("Escribe otro número entero positivo: ");
    n_dos = sc.nextInt();
    
    
    System.out.print("El número con el dígito añadido es el: " + Primary.juntaNumeros(n_uno, n_dos));
		
	}
}

