/*
 *@utor Jesús María Olalla Pérez 
 */
import Matematicas.Primary;
import java.util.Scanner;
public class Ejercicios18 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int num = 0;
    int contador = 0;
    int pegamento = 0;
		
    System.out.print("Escribe un número binario: ");
    num = sc.nextInt();
    
   
    System.out.print("El número en binario es el: " + Matematicas.Primary.decimalABinario(num)); 
	}
}

