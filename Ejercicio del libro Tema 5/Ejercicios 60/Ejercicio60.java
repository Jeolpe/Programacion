/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio60 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int h = 0;
    
    System.out.print("Escribe una altura: ");
    h = s.nextInt();
    
    
		//La parte alta//
    for(int i = 0; i < h-2; i++){
      for(int j = 1; j < 4; j++){
        System.out.print("*");
        }
      for(int k = 1; k < 6; k++){
          System.out.print(" ");
          }
      for(int l = 1; l < 4; l++){
        System.out.print("*");
        }
        System.out.println("");
      }
      
      //La parte baja//
      for(int i = 0; i < 2; i++){
        for(int j = 1; j < 7; j++){
          System.out.print("*");
          }
        for(int k = 1; k < 3; k++){
          System.out.print(" ");
          }
        for(int l = 1; l < 7; l++){
          System.out.print("*");
          }
          System.out.println("");
        }
	}
}

