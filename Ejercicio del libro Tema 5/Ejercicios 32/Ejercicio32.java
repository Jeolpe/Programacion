/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio32 {
	
	public static void main (String args[]) {
    
		Scanner s = new Scanner(System.in);
    int n = 0;
    int r = 0;
    int contador = 0;
    int v = 0;
    int suma = 0;
    
    System.out.print("Porfavor introduzca un número entero positivo: ");
    n = s.nextInt();
    
    while(n > 0){
      v = (v*10) + (n%10); 
      n/=10;
      }
    
    while(v > 0){
      r = (v%10);
      if(r % 2 == 0){
      System.out.print(r + " ");
      suma+= r;
    }
        v/=10;
      }
      System.out.print("");
      System.out.print("La suma de los números pares son: " + suma);
	}
}

