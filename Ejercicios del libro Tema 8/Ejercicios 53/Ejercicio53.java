/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio53 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int fils   = 0;
    int colums = 0;
    int min    = 0;
    int Max    = 0;
    int posc   = 0;
    
    System.out.print("Escribe el número de filas: ");
    fils = sc.nextInt();
    
    System.out.print("Escribe el número de columnas: ");
    colums = sc.nextInt();
    
    System.out.print("Escribe el mínimo: ");
    min = sc.nextInt();
    
    System.out.print("Escribe el Máximo: ");
    Max = sc.nextInt();
    
    System.out.print("Elija la posición del número que usted quiera: ");
    posc = sc.nextInt();
    
    int[][] a = generarNumerosAleatorios(fils, colums, min, Max);
    
    mostrar(a);
    
   System.out.println("");
   System.out.print("nEsimo (a," + posc + ") devuelve " + nEsimo(a,posc));
    		
	}
  
  public static int[][] generarNumerosAleatorios(int filas, int columnas, int m, int M){
    int[][] bidi = new int[filas][columnas];
    for(int i = 0; i < bidi.length; i++){
      for(int j = 0; j < bidi[0].length; j++){ 
        bidi[i][j] = (int)(Math.random()*(M-m+1)+m);
      }
    }
      System.out.println("");
      
      
    return bidi;
  }
    
  
   public static int nEsimo(int[][] bidi, int posicion) {
     int contador = -1;
     int num = 0;
     for(int i = 0; i < bidi.length; i++){
       for(int j = 0; j < bidi[0].length; j++){ 
         contador++;
          if(posicion == contador){
          return num = bidi[i][j];
          }
        }
      } 
     return -1;
    }
  
  public static void mostrar(int[][] bidi){
    for(int i = 0; i < bidi.length; i++){
      for(int j = 0; j < bidi[0].length;j++){
        System.out.printf("%-4d",bidi[i][j]);
      }
      System.out.println("");
    }
  }
}


