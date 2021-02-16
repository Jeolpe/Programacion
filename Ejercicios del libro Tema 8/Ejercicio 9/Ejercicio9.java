/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio9 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int d = 0;
    int n = 0;
    
    System.out.print("Escribe un número entero positivo: ");
    n = sc.nextInt();
    
    System.out.print("Escribe el número de dígitos que desea quitar: ");
    d = sc.nextInt();
    
    System.out.print("El número ha quedado " + quitaPorDetras(n,d));
		
	}
  
  public static int quitaPorDetras(int x, int z){
    for(int i = 1; i <= z; i++){
      x/= 10;
      }
      return x;
    }
}

