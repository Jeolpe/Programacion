/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio28 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int c = 0;
    int min = 0;
    int Max = 0;
    int movIzq = 0;
    
    System.out.print("Escribe la cantidad de número de Arrays Unidimensionales: ");
    c = sc.nextInt();
    
    System.out.print("Escribe el mínimo: ");
    min = sc.nextInt();

		System.out.print("Escribe el Máximo: ");
    Max = sc.nextInt();
    
    System.out.print("Escribe la cantidad de veces que el número se mueva hacia la izquierda: ");
    movIzq = sc.nextInt();
    
    int[] a = rellenarArraysAleatorios(c,min,Max);
    int[] b = moverAlaIzquierda(a,movIzq);
    
    mostrarArraysUnidimensional(a);
    mostrarArraysUnidimensional(b);
	}
  
  public static int[] rellenarArraysAleatorios(int z, int m, int M){
    int[] x = new int[z];
    for(int i = 0; i < x.length; i++){
      x[i] = (int)(Math.random()*(M-m+1)+m);
      }
      return x;
    }
    
    public static int[] moverAlaIzquierda( int[] y,int v){
      int[] x = y.clone();
      int aux = 0;
      while(v-- > 0){
        aux = x[0];
        for(int i = 0; i < x.length-1;i++){
          x[i] = x[i+1];
          }
          x[x.length-1] = aux;
        } 
        return x;
      }
      
      public static void mostrarArraysUnidimensional(int[]x){
        for(int i = 0; i < x.length; i++){
          System.out.printf("%-3d",x[i]);
          }
          System.out.println("");
        }
  
}

