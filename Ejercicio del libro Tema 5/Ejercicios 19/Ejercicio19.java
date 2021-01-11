/*
 *Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio19 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int h = 0;
    String c = "";
    int contador = 0;
    
    System.out.print("Escribe la altura de la piramide: ");
    h = s.nextInt();
    
    System.out.print("Escribe el carácter de la piramide: ");
    c = s.next();
    
    for(int i = 0; i < h; i++){
      for(int j = h; j >= i+2; j--){
        System.out.print(" ");
        }
      for(int k = 0; k <= i+i; k++){
        System.out.print(c);
        contador++;
        }
        System.out.println("");
      }
  }
}

