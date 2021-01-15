/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio57 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int h = 0;
    
    System.out.print("Introduce la altura: ");
    h = s.nextInt();
    
    //Ponemos la parte de arriba de la piramide//
    for(int i = 1; i <= h; i++){
      System.out.print("*");
      }
      System.out.println("");
      
      //Ponemos la parte media de la piramide//
      for(int i = 0; i < h-2; i++){
        for(int j = 0; j <= i; j++){
          System.out.print(" ");
          }
          System.out.print("*");
          for(int k = h-4; k >= i; k--){
            System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
        
        //Ponemos la parte baja de la piramide//
        for(int i = 0; i <= h-2; i++){
          System.out.print(" ");
        }
        System.out.print("*");
         
  }
}

