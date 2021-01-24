/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio4 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n = 0; 
    int n2 = 0;
    
    System.out.print("Escribe la base: ");
    n = sc.nextInt();
    
    System.out.print("Escribe el exponente: ");
    n2 = sc.nextInt();
    
    System.out.println("");
    System.out.print(n + "^" + n2 + " = " + bucle(n, n2));
	}
  
  public static int bucle(int x, int z){
    int aux = 1;
    for(int i = 0; i < z; i++){
      aux*= x;
      }
      return aux;
  }
}

