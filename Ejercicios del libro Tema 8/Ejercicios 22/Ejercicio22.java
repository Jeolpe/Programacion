/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio22 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int c = 0;
    int max = 0;
    int min = 0;
    
    System.out.print("Escribe la cantidad de números que quieres que contenga la Matriz Unidimensional: ");
    c = sc.nextInt();
    
    System.out.print("Escribe el Máximo de números aleatorios: ");
    max = sc.nextInt();
    
    System.out.print("Escribe el mínimo de números aleatorios: ");
    min = sc.nextInt();
    
    int [] m = numerosAleatorios(c,min,max);
    
     for(int num:m){
       System.out.print(num + " ");
       }
       System.out.println("");
       
       System.out.print("El número mayor de todos los unidimensionales son: " + numeroMaximo(m));
		}
    
    public static int [] numerosAleatorios(int z, int m, int M){
      int[] x = new int[z];
      
      for(int i = 0; i < x.length; i++){
        x[i] = (int)(Math.random()*(M-m+1)+m);
        }
        return x;
      }
      
      public static int numeroMaximo(int[]x){
        int x2 = Integer.MIN_VALUE;
        for(int num:x){
          if(x2 < num){
            x2 = num;
            }
          }
          return x2;
        }
 }

