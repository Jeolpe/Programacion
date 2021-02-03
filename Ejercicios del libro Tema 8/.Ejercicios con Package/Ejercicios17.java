/*
 *@utor Jesús María Olalla Pérez
 */
import Matematicas.Primary; 
import java.util.Scanner;

public class Ejercicios17 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int num = 0;
		
    System.out.print("Escribe un número binario: ");
    num = sc.nextInt();
    
    System.out.print("El número binario " + num + " pasado a decimal es " + Matematicas.Primary.binarioADecimal(num));
	}
}

