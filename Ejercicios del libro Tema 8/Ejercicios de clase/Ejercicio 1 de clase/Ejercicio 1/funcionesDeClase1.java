/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class funcionesDeClase1 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int c = 0;
    int min = 1; 
    int Max = 50;
    
    System.out.print("Escribe la cantidad de la Matriz Unidimensional: ");
    c = sc.nextInt();
    
    int[] a = generarNumerosAleatorios(c,min,Max);
		
    mostrarArray(a);
	}
  
  public static void mostrarArray(int[] uni){
    System.out.println("El tamaño del Array Unidimensional es: " + uni.length);
    System.out.println("");
    System.out.print("┌");
    for(int num:uni){
   System.out.print("────┬");
 }
   System.out.println("");
    for(int num:uni){
       System.out.print("│");
    System.out.printf("%3d ", num);
      }
      System.out.print("│");
      System.out.println("");
      System.out.print("└");
      for(int num:uni){
      System.out.print("────┴");
    }
  }
  
  public static int[] generarNumerosAleatorios(int x, int m, int M){
    int[] uni = new int[x];
    for(int i = 0; i < uni.length; i++){
      uni[i] = (int)(Math.random()*(M-m+1)+m);
      }
      return uni;
    }
}

