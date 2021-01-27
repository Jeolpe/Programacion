/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio11 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n = 0;
    int d = 0;
    
    System.out.print("Escribe un número entero positivo: ");
    n = sc.nextInt();
    
    System.out.print("Escribe el dígito que quieres añadir: ");
    d = sc.nextInt();
    
    System.out.print(pegaPorDetras(n,d));
  }
  
  /*
   * @Param x. Añada un número entero positivo*/
  public static int pegaPorDetras(int x, int z){
    x = (x*10) + z;
    return x;
    }
}

