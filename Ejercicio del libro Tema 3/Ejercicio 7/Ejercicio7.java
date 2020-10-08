/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio7 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    double num_uno      = 0;
    double sin_iva   = 0;
    double resultado = 0;
    
    System.out.println("¿Cuanto te ha costado hoy la compra?");
    num_uno = s.nextDouble();
    
    sin_iva = num_uno * 0.21;
    resultado = num_uno - sin_iva;
    
    System.out.println("La compra de hoy te ha costado sin iva " + resultado + "€");
    
    
  }
}

