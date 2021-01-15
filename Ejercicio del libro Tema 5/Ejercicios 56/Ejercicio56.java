/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio56 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int h = 0;
    
    System.out.print("Por favor, escribe la altura deseada: ");
    h = s.nextInt();
    
    //Parte de arriba de la piramide//
    for(int i = 0; i < h; i++){
      System.out.print("*");
      }
      System.out.println("");
      
      //Parte media de la piramide//
      for(int i = 0; i < h-1;i++){
        for(int j = 0; j <= i; j++){
          System.out.print(" ");
          }
        for(int k = h-1; k > i; k--){
          System.out.print("*");
          }
          System.out.println("");
        }
  }
}

