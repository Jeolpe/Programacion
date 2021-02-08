/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Examen3 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int tamanio, min,Max;
    
    System.out.print("Comenzamos a configurar el Array Unidimensional: ");
    System.out.println();
    System.out.println();
    
    System.out.print("Escribe el tamaño del Array Unidimensional: ");
    tamanio = sc.nextInt();
    
    System.out.print("Escribe el mínimo: ");
    min = sc.nextInt();
    
    System.out.print("Escribe el Máximo: ");
    Max = sc.nextInt(); 
    
    System.out.println();
    
    System.out.print("Comenzamos a configurar el Array Bidimensional: ");
    System.out.println();
    System.out.println();
    
    int fils, colums;
    
    System.out.print("Escribe el número de filas: ");
    fils = sc.nextInt();
    
    System.out.print("Escribe el número de columnas: ");
    colums = sc.nextInt();
    
    System.out.print("Escribe el mínimo: ");
    min = sc.nextInt();
    
    System.out.print("Escribe el Máximo: ");
    Max = sc.nextInt();
    
    System.out.println();
    System.out.println();
    
    int[] a = generarArrayUni(tamanio, min, Max);
    System.out.println("El array de 1 dimension original es: ");
    mostrarUni(a);
    
    System.out.println();
    
    int[][] b = generarArrayBidi(fils, colums, min,Max);
    
    System.out.println("El array original es: ");
    mostrarbidi(b);
    
    System.out.println();
    
    int[] c = rotarColumnaAlaIzquierdaUni(a);
    System.out.println("El array de 1 dimension movido es: ");
    mostrarUni(c);
    
    System.out.println();
    
    int[][] d = rotarColumnaAlaIzquierda(b);
    System.out.println("El array movido es: ");
    mostrarbidi(d);
		
	}
  /*----------Esto es para la Matriz Unidimensional----------*/
  public static int[] generarArrayUni(int x, int m, int M){
    int[] uni = new int[x];
    
    for(int i = 0; i < uni.length; i++){
      uni[i] = (int)(Math.random()*(M-m+1)+m);
      }
      return uni;
    }
  
  public static int[] rotarColumnaAlaIzquierdaUni(int[] arr){
    int[] uni = new int[arr.length];
    int aux;
    aux = arr[0];
    
    for(int i = arr.length-1; i > 0; i--){
      uni[i-1] = arr[i];
    }
    
    uni[uni.length-1] = aux;
    return uni;
  }
  
  public static void mostrarUni(int[] uni){
    for(int num:uni){
      System.out.print(num + " ");
      }
    }
    /*----------------------------------------------------*/
  
  /*----------Esto es para la Matriz Bidimensional----------*/
  
  public static int[][] rotarColumnaAlaIzquierda(int[][] arr){
    int[][] bidi = new int[arr.length][arr[0].length];
    int[] uni = new int[arr.length];
    
    for(int i = 0; i < arr.length; i++){
      uni[i] = arr[i][0];
      }
      
      for(int i = 0; i < arr.length; i++){
        for(int j = arr[0].length-1; j > 0 ; j--){
          bidi[i][j-1] = arr[i][j]; 
          }
        }
        
        for(int i = 0; i < arr.length; i++){
          bidi[i][arr[0].length-1] = uni[i];
          }
      return bidi;
    }
    
    public static int[][] generarArrayBidi(int f,int c, int m, int M){
     int[][] bidi = new int[f][c];
     
     for(int i = 0; i < bidi.length; i++){
       for(int j = 0; j < bidi[0].length; j++){
         bidi[i][j] = (int)(Math.random()*(M-m+1)+m);
         }
       }
       return bidi;
      }
      
      public static void mostrarbidi(int[][] arr){
        for(int i = 0; i < arr.length; i++){
          for(int j = 0; j < arr[0].length; j++){
            System.out.printf("%4d",arr[i][j]);
            }
            System.out.println();
          }
        }
    /*----------------------------------------------------*/
    
    
}

