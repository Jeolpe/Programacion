/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio47 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int h = 0;
    
    System.out.print("Escribe la altura de la forma: ");
    h = s.nextInt();
    
    if(h >= 5){
      for(int i = 0; i < 6; i++){
        System.out.print("M");
        }
        System.out.println("");
      for(int i = 0; i < h/2-1; i++){
        System.out.print("M");
        for(int j = 0; j < 6-2; j++){
          System.out.print(" ");
          }
          System.out.print("M");
          System.out.println("");
        }
        for(int i = 0; i < 6; i++){
        System.out.print("M");
        }
        System.out.println("");
        for(int i = 0; i < h/2-1; i++){
        System.out.print("M");
        for(int j = 0; j < 6-2; j++){
          System.out.print(" ");
          }
          System.out.print("M");
          System.out.println("");
        }
        for(int i = 0; i < 6; i++){
        System.out.print("M");
        }
      }else{
        System.out.print("Altura introducida incorrecta. La altura debe de ser mayor o igual a 5");
      }
  }
}

