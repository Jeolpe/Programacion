/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class funcionesDeClase11 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int c   = 20;
    int min = 1;
    int Max = 100;
    
    int[] a = generarNumerosAleatorios(c, min, Max);
    
    mostrar(a);
    
  }
  
  public static int[] generarNumerosAleatorios(int x ,int m, int M){
    int[] uni = new int[x];
    int contador = 0;
    
    if(m > M){
      int aux = M;
      m = M;
      m = aux;
      }
      
    for(int num:uni){
      uni[contador] = (int)(Math.random()*(M-m+1)+m);
      contador++;
      }
      return uni;
    }
    
    public static void mostrar (int[] uni){
   
      System.out.println("La matriz unidimensional creada es: ");
      for(int num:uni){
        System.out.printf("%-4d",num);
        }
      }
}

