/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio27 {
	
	public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    int c = 0;
    int m = 0;
    int M = 0;
    int n = 0;
    
    System.out.print("Escribe la cantidad de Arrays Unidimensionales: ");
    c = sc.nextInt();
    
    System.out.print("Escribe el mínimo: ");
    m = sc.nextInt();
    
    System.out.print("Escribe el Máximo: ");
    M = sc.nextInt();
    
    System.out.print("Escribe la cantidad de veces que se mueva los números: ");
    n = sc.nextInt();
    
    int[] a = aleatoriosNumeros(c,m,M);
    int[] b = numeroArraysSiguiente(a,c,n);
    
    mostrarNumeros(a);
    mostrarNumeros(b);
	}
  
  public static int[] aleatoriosNumeros(int z, int m, int M){
    int[] x = new int [z];
    for(int i = 0; i < x.length;i++){
      x[i] = (int)(Math.random()*(M-m+1)+m);
      }
      return x;
    }
    
    public static int [] numeroArraysSiguiente(int[] y, int z, int v){
      int [] x = y.clone();
      int aux = 0;
      while(v-- > 0){
        aux = x[z-1];
        for(int i = z-1; i > 0; i--){
          x[i] = x[i-1];
          }
          x[0] = aux;
          
        }
      return x;
    }
    
    public static void mostrarNumeros(int[]x){
      for(int num:x){
      System.out.printf("%-5d",num);
      }		
      System.out.println("");
      
      }
}

