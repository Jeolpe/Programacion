/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio52 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int longitud = 0;
    int min = 0;
    int Max = 0;
    
    System.out.print("Escribe la longitud del Array Unidimensional: ");
    longitud = sc.nextInt();
    
    System.out.print("Escribe el mínimo: ");
    min = sc.nextInt();
    
    System.out.print("Escribe el Máximo: ");
    Max = sc.nextInt();
    
    int[] a = generarNumerosAleatorios(longitud, min, Max);
    
    for(int num:a){
      System.out.printf("%-4d",num);
      }
    System.out.println("");
    System.out.println("El número aleatorio generado es el: ");
    System.out.print(aleatorioDeArray(a));
		
	}
  
  public static int[] generarNumerosAleatorios(int x, int m, int M){
    int[] uni = new int[x];
    
    for(int i = 0; i < uni.length; i++){
      uni[i] = (int)(Math.random()*(M-m+1)+m);
      }
      return uni;
    }
    
    public static int aleatorioDeArray(int[] uni){
      return uni[(int)(Math.random()*uni.length)];
    } 
}

