/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio26 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int c = 0;
    int m = 0;
    int M = 0; 
    
    System.out.print("Escribe la cantidad de Arrays Unidimensionales: ");
    c = sc.nextInt();
    
    System.out.print("Escribe el mínimo: ");
    m = sc.nextInt();
    
    System.out.print("Escribe el máximo: ");
    M = sc.nextInt();
    
    int[] a = aleatoriosNumeros(c,m,M);
    int[] b = volteoNumeros(a,c);
    
    System.out.print("El número original es el: ");
    for(int num:a){
      System.out.printf("%-4d",num);
      }
      
      System.out.println("");
    System.out.print("El número volteado es el: ");
    for(int num:b){
      System.out.printf("%-4d",num);
      }
	}
  
  public static int [] aleatoriosNumeros(int z, int m, int M){
    int[] x = new int[z];
    for(int i = 0; i < x.length;i++){
      x[i] = (int)(Math.random()*(M-m+1)+m);
      }
      return x;
    }
    
    public static int [] volteoNumeros(int[] x, int z){
      int[] y = new int[z];
      int contador = 0;
      for(int i = z-1; i >= 0; i--){
        y[contador] = x[i];
        contador++;
       }
        return y;
      }
}

