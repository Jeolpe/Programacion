/*
*@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class funcionesDeClase21{
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int c   = 0;
    int min = 0;
    int Max = 0;
    String formato = "";
    
    System.out.print("Escribe la cantidad de Arrays Unidimensionales: ");
    c = sc.nextInt();
    
    System.out.print("Escribe el mínimo: ");
    min = sc.nextInt();
    
    System.out.print("Escribe el Máximo: ");
    Max = sc.nextInt();
    
    int[] a = generarNumerosAleatorios(c,min,Max);
    int[] b = capturandoNumerosPares(a);
    
    System.out.println("El Array Unidimensional generado con números aleatorios es: ");
    mostrar(a);
    
   
    
    System.out.println("");
    System.out.println("Los números pares son: ");
    mostrar(b);
  }
  
  public static int[] generarNumerosAleatorios(int x, int m, int M){
    int[] uni = new int[x];
    
    for(int i = 0; i < uni.length; i++){
      uni[i] = (int)(Math.random()*(M-m+1)+m);
    }
    return uni;
  }
  
  public static void mostrar(int[] uni){
    for(int num:uni){
      System.out.printf("%-4d",num);
      }
    }
    
  public static int contar(int[] uni){
    int contador = 0;
    for(int num:uni){
      if(num % 2 == 0){
      contador++;
    }
      }
      return contador;
    }
  
  public static int[] capturandoNumerosPares(int[] uni){
    int[] x = new int[contar(uni)];
    int contador = 0;
    for(int num:uni){
      if(num % 2 == 0){
        x[contador] = num;
        contador++;
        }
      }
      return x;
    }
}

