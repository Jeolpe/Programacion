/*
 *@utor Jesús María Olalla Pérez 
 */
import java.util.Scanner;

public class Ejercicio4{
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("Escribe el primer número");
    int num_uno = s.nextInt();
    
    System.out.println("Escribe el segundo número");
    int num_dos = s.nextInt();
    
    int resultado_multiplicacion = 0;
    resultado_multiplicacion = num_uno * num_dos;
    
    int resultado_suma = 0;
    resultado_suma = num_uno + num_dos; 
    
    int resultado_resta = 0;
    resultado_resta = num_uno - num_dos;
    
    int resultado_division = 0;
    resultado_division = num_uno / num_dos;
    
    System.out.println("");
    System.out.println("El resultado de la suma es " + resultado_suma);
    System.out.println("");
    System.out.println("El resultado de la resta es " + resultado_resta );
    System.out.println("");
    System.out.println("El resultado de la multiplicacion es " + resultado_multiplicacion );
    System.out.println("");
    System.out.println("El resultado de la division es " + resultado_division);
  }
}

