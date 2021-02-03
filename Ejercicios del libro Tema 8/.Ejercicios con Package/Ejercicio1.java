/*
 *@utor Jesús María Olalla Pérez 
 */
import Matematicas.Primary;
import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n = 0;
    
    System.out.print("Escribe un número entero positivo: ");
    n = sc.nextInt();
    
    
    if(Matematicas.Primary.esPrimo(n)){
      System.out.print("El " + n + " es primo.");
    }else{
        System.out.print("El " + n + " no es primo.");
      }
  }
}

