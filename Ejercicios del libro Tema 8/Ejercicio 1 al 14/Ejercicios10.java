/*
 *@utor Jesús María Olalla Pérez 
 */
import Matematicas.Primary;
import java.util.Scanner;

public class Ejercicios10 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n    = 0;
    int kill = 0;
    
    System.out.print("Escribe un número entero positivo: ");
    n = sc.nextInt();
    
    System.out.print("Escribe la cantidad de número que dea eliminar por la izquierda: ");
    kill = sc.nextInt();
    
    System.out.print("Número decapitado: " + Primary.quitaDigitoPorDelante(n,kill));
		
	}
}
