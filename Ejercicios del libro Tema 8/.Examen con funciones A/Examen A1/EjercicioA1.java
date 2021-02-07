/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class EjercicioA1 {
  
  public static void main (String args[]){
    
    Scanner sc = new Scanner(System.in);
    int fils   = 0;
    int colums = 0; 
    int min    = 0; 
    int Max    = 0;
    int elec   = 0;
    
    System.out.print("Escribe el número de filas: ");
    fils = sc.nextInt();
    
    System.out.print("Escribe el número de columnas: " );
    colums = sc.nextInt();
    
    System.out.print("Escribe el número menor: ");
    min = sc.nextInt();
    
    System.out.print("Escribe el mayor: ");
    Max = sc.nextInt();
    
    System.out.println("Escribe: 1. Mediadiagonal superior izquierda");
    System.out.println("         2. Mediadiagonal superior derecha");
    System.out.println("         3. Mediadiagonal inferior izquierda ");
    System.out.println("         4. Mediadiagonal inferior derecha ");
    elec = sc.nextInt();
    
    int[][] a = generarNumerosAleatoriosBidi(fils, colums, min, Max);
    mostrarBidi(a);
    
    int[] b = eleccionDeFilasYColumnas(a,elec);
    mostrarUni(b);
  }
  
  public static int[][] generarNumerosAleatoriosBidi(int f, int c, int m, int M){
    int[][] bidi = new int[f][c];
    
    for(int i = 0; i < bidi.length; i++){
      for(int j = 0; j <bidi[0].length;j++){
        bidi[i][j] = (int)(Math.random()*(M-m+1)+m);
        }
      }
      return bidi;
    }
    
    public static void mostrarBidi(int[][] bidi){
      System.out.println("");
      System.out.println("El Arrays bidimensional generado es el: ");
      for(int i = 0; i < bidi.length; i++){
      for(int j = 0; j <bidi[0].length;j++){
        System.out.printf("%4d",bidi[i][j]);
        }
      System.out.println("");
      }
    }
    
    public static int[] eleccionDeFilasYColumnas(int[][] bidi, int x){
      int[] uni = new int[bidi.length];
      int i      = 0;
      int j      = 0;
      int fils   = 0;
      int colums = 0;
     
        
      for( i = 0; i < bidi.length; i++){
       for( j = 0; j <bidi[0].length;j++){
        switch(x){
        case(1):
        fils   = i;
        colums = j;
        break;
        case(2):
        fils = (bidi[0].length-1)-i;
        colums = j;
        break;
        case(3):
        fils = (bidi.length-1)-i;
        colums = j;
        break;
        case(4):
        fils = Math.abs((bidi.length-bidi[0].length))+i;
        colums = j;
        break;
        default:
        }
        if(fils == colums){
          uni[i] = bidi[i][j];
        }
       }
         
     }
      return uni;
    }
    
    public static void mostrarUni(int[] uni){
     System.out.println("");
    for(int num:uni){
      System.out.print(num + " ");
      }
   }
}
