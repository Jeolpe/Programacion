/*
 * @utor Jesús Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio54 {
	
	public static void main (String args[]) {
    
		Scanner s = new Scanner(System.in);
    int h = 0;
    
    System.out.print("Introduzca la altura deseada: ");
    h = s.nextInt();
    
    //colocando la parte de arriba//
    for(int i = 0; i < h; i++){
      System.out.print("*");
      }
      System.out.println("");
      
      //colocando la parte del medio//
      for(int i = 0; i < h-2; i++){
        System.out.print("*");
        for(int j = h-3; j > i; j--){
          System.out.print(" ");
          }
          System.out.print("*");
          System.out.println("");
        }
        //la ultima parte(sin bucle porque no hace falta)//
        System.out.print("*");
	}
}

