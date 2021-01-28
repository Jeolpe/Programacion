/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio24 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int c = 0;
    int M = 0;
    int m = 0;
    int n = 0;
    
    System.out.print("Escribe la longitud del Array Unidimensional: ");
    c = sc.nextInt();
    
    System.out.print("Escribe el Máximo: ");
    M = sc.nextInt();
    
    System.out.print("Escribe el mínimo: ");
    m = sc.nextInt();
    
    System.out.print("Escribe un número: ");
    n = sc.nextInt();
    
    int[] a = numeroAleatorios(c,m,M);
    
    for(int num:a){
      System.out.print(num + " ");
      }
      
      System.out.println("");
      
      if(comprobación(a,n)){
        System.out.print("El número introducido se encuentra en el Arrays Unidimensional.");
        }else{
          System.out.print("El número introducido NO se encuentra en el Arrays Unidimensional.");
        }
		}
    
    public static int [] numeroAleatorios(int z, int m, int M){
      int [] x = new int[z];
      for(int i = 0; i < x.length; i++){
        x[i] = (int)(Math.random()*(M-m+1)+m);
        }
        return x;
      }
      
      public static boolean comprobación(int[] x, int z){
        for(int num:x){
          if(num == z){
            return true;
            }
          }
          return false;
        }
}

