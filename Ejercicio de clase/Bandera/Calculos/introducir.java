/*
 *@utor Jesús María Olalla Pérez 
 */
import java.util.Scanner;

public class introducir {
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("Escribe el primer número");
    int num_uno = s.nextInt();
    
    System.out.println("Escribe el segundo número");
    int num_dos = s.nextInt();
    
    
    int resultado_multiplicacion = 0;
    resultado_multiplicacion = num_uno * num_dos;
    
    
    System.out.println("");
    System.out.println("El resultado de la suma es " + resultado_multiplicacion);
    
	}
}

