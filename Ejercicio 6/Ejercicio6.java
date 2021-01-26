/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio6 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n = 0;
		
    System.out.print("Escribe un número entero positivo: ");
    n = sc.nextInt();
    
    System.out.print("Hay " + cuentaDigitos(n) + " dígito/s");
   } 
  public static int cuentaDigitos(int x){
    int contador = 0;
    if(x == 0){
      contador = 1;
      return contador;
      }
      while(x > 0){
        x/= 10;
        contador++;
        }
        return contador;
    }
  
}

