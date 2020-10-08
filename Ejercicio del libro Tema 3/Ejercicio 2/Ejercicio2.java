/*
 *@utor Jesús María Olalla Pérez
 */
import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int € = 0;
    double peseta = 166.386;
    double resultado = 0;
    
    System.out.println("¿Cuantos euros quieres cambiar?");
    € = s.nextInt();
    
    resultado = peseta * €;
    
    System.out.println(€ + " euros son " + resultado + " pesetas");
    
    
    
    
		
	}
}

