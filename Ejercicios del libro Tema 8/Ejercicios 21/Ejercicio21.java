/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio21 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int c = 0;
    int max = 0;
    int min = 0;
    
    System.out.print("Escribe la cantidad de Array que quieres que tenga la Unidimensional: ");
    c = sc.nextInt();
    
    System.out.print("Escribe el máximo: ");
    max = sc.nextInt();
    
    System.out.print("Escribe el mínimo: ");
    min = sc.nextInt();
    
    int[]a = NumeroAleatorio(c,max,min);
    
    for(int num:a){
      System.out.print(num + " ");
      }
      
      System.out.println("");
      System.out.print("El número más pequeño de los Arrays Unidimensionales es el: " + NumeroMenor(a));
		}
    
    public static int [] NumeroAleatorio(int z, int w, int y){
      int [] x = new int[z];
      for(int i = 0; i < x.length; i++){
        x[i] = (int)(Math.random()*(y-w+1)+w);
        }
        return x;
      }
      
      public static int NumeroMenor(int[]z){
        int x2 = Integer.MAX_VALUE;
        for(int num:z){
         if( x2>= num){
           x2 = num;
           }
      }
      return x2;
    }

      
  }

