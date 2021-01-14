/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio50 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int h = 0;
    int e = 0;
    
    System.out.print("Introduzca la altura: ");
    h = s.nextInt();
    
    System.out.print("Introduzca el espacio entre los números: ");
    e = s.nextInt();
    
    //comprobar que se ha escrito bien los números//
    if(h >= 5 && e >= 1){
    //primera fila//
    System.out.print("*");
    for(int i = 0; i < 2; i++){
      for(int j = 0; j < e; j++){
        System.out.print(" ");
        }
      for(int k = 0; k < 4; k++){
        System.out.print("*");
        }
      }
      System.out.println("");
      //Segunda fila//
      System.out.print("*");
      for(int i = 0; i < e; i++){
        System.out.print(" ");
        }
      for(int i = 0; i < 2; i++){
        System.out.print("*");
        for(int j = 0; j < e+(4-1);j++){
          System.out.print(" ");
          }
          
        }
        System.out.println("");
        //tercera fila//
        System.out.print("*");
    for(int i = 0; i < 2; i++){
      for(int j = 0; j < e; j++){
        System.out.print(" ");
        }
      for(int k = 0; k < 4; k++){
        System.out.print("*");
        }
      }
      
      System.out.println("");
      //cuarta línera(la que varía con las alturas).
      for(int i = 0; i < h - 4; i++){
        System.out.print("*");
        for(int j = 0; j < e + (4-1); j++){
          System.out.print(" ");
          }
          System.out.print("*");
          for(int k = 0; k < e + (4-1); k++){
          System.out.print(" ");
          }
          System.out.print("*");
          System.out.println("");
          }
          
          //quinta línea//
               System.out.print("*");
    for(int i = 0; i < 2; i++){
      for(int j = 0; j < e; j++){
        System.out.print(" ");
        }
      for(int k = 0; k < 4; k++){
        System.out.print("*");
        }
      }
    }else{
     System.out.print("Las condiciones introducidas son incorrectas. Por favor, vuelva a intentarlo.");
   }
  }
}

