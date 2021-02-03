/*
 *@utor Jesús María Olalla Pérez 
 */
import Matematicas.Primary;
import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n = 0;
    
    System.out.print("Escribe un número entero positivo: ");
    n = sc.nextInt();
    
    if(Primary.esCapicua(n)){
      System.out.print("El " + n + " es capicua");
    }else{
       System.out.print("El " + n + " no es capicua");
      }
  }
}

