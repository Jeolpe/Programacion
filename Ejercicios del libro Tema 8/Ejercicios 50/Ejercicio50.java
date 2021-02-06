/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio50 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int c   = 0;
    int c2  = 0;
    int min = 0;
    int Max = 0;
		
    System.out.print("Escribe la cantidad de Array 1: ");
    c = sc.nextInt();
    
    System.out.print("Escribe la cantidad de Array 2: ");
    c2 = sc.nextInt();
    
    System.out.print("Escribe el mínimo: ");
    min = sc.nextInt();
    
    System.out.print("Escribe el Máximo: ");
    Max = sc.nextInt();
    
    int resultado = c + c2;
    
    int[] a = generarNumerosAleatorios(c,min,Max);
    int[] b = generarNumerosAleatorios(c2,min,Max);
    int[] d = mezclaNumerosMatrices(a,b,resultado);
    
    
    mostrar(a);
    mostrar(b);
    mostrar(d);
   
	}
  
  public static int[] generarNumerosAleatorios(int x, int m, int M){
    int[] uni = new int[x];
    
    for(int i = 0; i < uni.length; i++){
      uni[i] = (int)(Math.random()*(M-m+1)+m);
      }
      return uni;
    }
    
    public static int[] mezclaNumerosMatrices(int[] x, int[] z, int suma){
      int[] uni = new int[suma];
      int contador = 0;
      int contador2 = 0;
      int contador3 = 0;
      int count = 0;
      do{
        if(contador < x.length){
          uni[count] = x[contador];
          count++;
          contador++;
          }
          if(contador2 < z.length){
            uni[count] = z[contador2];
            count++;
            contador2++;
            }
            contador3++;
        }while(count < uni.length);
        return uni;
      }
      
      public static void mostrar(int[] uni){
        for(int num:uni){
        System.out.print(num + " ");
      }
      System.out.println("");
    }
}

