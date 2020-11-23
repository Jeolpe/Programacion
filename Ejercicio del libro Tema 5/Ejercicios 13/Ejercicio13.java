/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio13 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int contador = 0;
    int contador1 = 0;
    
    for(int i = 0; i < 10; i++){
      System.out.println("Escribe un número");
      n = s.nextInt();
      if(n >= 0){
        contador++;
      }else{
        contador1++;
        }
      }
		System.out.println("Has escrito: " + contador + " números positivos");
    System.out.println("Has escrito: " + contador1 + " números negativos");
	}
}

