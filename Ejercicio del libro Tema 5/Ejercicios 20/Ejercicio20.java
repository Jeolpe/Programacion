/*
 *@utor JEsús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio20 {
	
	public static void main (String args[]) {
		
    Scanner s = new Scanner(System.in);
    int h = 0;
    String c = "";
    int contador = 0;
    
    System.out.print("Escribe la altura de la piramide: ");
    h = s.nextInt();
    
    System.out.print("Escribe el carácter que quieres que contenga la pirmide: ");
    c = s.next();
    
    for(int i = 0; i < h; i++){
      for(int j = h; j > i; j--){
        System.out.print(" ");
        }
      for(int k = i; k <= i; k++){
        System.out.print(c);
        }
      for(int l = 1 ; l < i+i; l++){
        System.out.print(" ");
        }
        if(contador >= 1){
        System.out.print(c);
      }
      contador++;
        System.out.println("");
      }
    for(int m = 0; m <= h*2; m++){
      System.out.print(c);
      }
    
	}
}

