/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio48 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int c   = 0;
    int c2  = 0;
    int min = 0;
    int Max = 0;
    
    System.out.print("Escribe la cantidad del Array 1: ");
    c = sc.nextInt();
    
    System.out.print("Escribe la cantidad del Array 2: ");
    c2 = sc.nextInt();
    
    System.out.print("Escribe el mínimo: ");
    min = sc.nextInt();
    
    System.out.print("Escribe el Máximo: ");
    Max = sc.nextInt();
    int resultado = c+c2;
    
    int[] a = generarNumerosArray(c, min, Max);
    int[] b = generarNumerosArray(c2, min, Max);
    int[] d = concatenacionDeArrays(resultado,a,b,c,c2);
		
    
    mostrarArraysConcatenados(a);
    
    mostrarArraysConcatenados(b);
    
    mostrarArraysConcatenados(d);
    
    
	}
  
  public static int[] generarNumerosArray(int x, int m, int M){
    int[] uni = new int[x];
    
    for(int i = 0; i < uni.length; i++){
      uni[i] = (int)(Math.random()*(M-m+1)+m);
      }
      return uni;
    }
    
    public static int[] concatenacionDeArrays(int x, int[] z, int[] y, int c, int a){
      int contador = 0;
      int[] uni = new int[x];
      for(int i = 0; i < uni.length; i++){
        if(c > i){
        uni[i] = z[i];
        }else{
        uni[i] = y[contador];
        contador++;
        }
        
      }
      return uni;
    }
    
    public static void mostrarArraysConcatenados(int[] uni){
      for(int num:uni){
        System.out.printf("%-4d",num);
        }
        System.out.println("");
      }
}

