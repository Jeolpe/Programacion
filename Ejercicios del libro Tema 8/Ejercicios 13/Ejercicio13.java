/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio13 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n = 0;
    int p1 = 0;
    int p2 = 0;
    
    System.out.print("Escribe un número entero positivo: ");
    n = sc.nextInt();
    
    System.out.print("Escriba el primer parametro: ");
    p1 = sc.nextInt();
    
    System.out.print("Escriba el segundo parametro: ");
    p2 = sc.nextInt();
		
	}
  public static int contadorDeNumeros(int x, int z){
    int contador = 0;
    if(x == 0){
      contador = 1;
      return contador;
      }
      while(x > 0){
        x/= 10;
        contador++;
        return contador;
   }
 }
}

