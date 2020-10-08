/*
 *@utor Jesús María Olalla Pérez
 */
import java.util.Scanner;
public class Ejercicio3 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    double peseta = 0;
    double resultado = 0;
    
    System.out.println("¿Cuantas pesetas quieres cambiar?");
    peseta = s.nextInt();
    
    resultado = peseta / 166.386;
    
    System.out.println(peseta + " pesetas son " + resultado + " euros");    
	}
}

