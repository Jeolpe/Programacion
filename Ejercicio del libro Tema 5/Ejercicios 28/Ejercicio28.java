/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio28 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int r = 0;
    int contador = 0;
    int suma = 0;
    
    
    System.out.print("Escribe un número: ");
    n = s.nextInt();
    
    for(int i = 1; i < n; i++){
      if(i % 3 == 0){
        System.out.print(i + ",");
        contador++;
        suma+=i;
        }
      }
      r = suma / contador;
      System.out.println("");
      System.out.println("Hay " + contador + " números múltiple de 3");
      System.out.print("La media de todos los múltiplos de 3 son: " + r);
  }
}

