/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class funcionesDeClase2{
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int c = 0;
    int min = 0;
    int Max = 0;
		
    System.out.print("Escribe la cantidad de números que quieres que tenga el Array Unidimensional: ");
    c = sc.nextInt();
    
    System.out.print("Escribe el mínimo: ");
    min = sc.nextInt();
    
    System.out.print("Escribe el Máximo: ");
    Max = sc.nextInt();
    
    int[] a = generarNumerosAleatorios(c,min,Max);
    
    mostrar(a);
    
    mostarContador(a);
	}
  
  public static int[] generarNumerosAleatorios(int x, int m, int M){
    int[] uni = new int[x];
    for(int i = 0; i < uni.length; i++){
      uni[i] = (int)(Math.random()*(M-m+1)+m);
      }
      return uni;
    }
  
  public static void mostrar(int[] uni){
    System.out.println("");
    System.out.println("El Array generado es el: ");
    for(int num:uni){
      System.out.printf("%-4d",num);
      }
    }
    
    public static int contar(int[] uni){
      int contador = 0;
      for(int i = 0; i < uni.length; i++){
        if(uni[i] % 2 == 0){
          contador++;
          }
        }
        return contador;
      }
  
  public static void mostarContador(int[] uni){
    System.out.println("");
    System.out.print("Hay " + contar(uni) + " números pares.");
    }
}

