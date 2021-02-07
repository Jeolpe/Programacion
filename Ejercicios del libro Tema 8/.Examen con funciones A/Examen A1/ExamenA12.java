/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class ExamenA12 {
  
  public static void main (String args[]){
    
    Scanner sc = new Scanner(System.in);
    int fils   = 0;
    int colums = 0; 
    int min    = 0; 
    int Max    = 0;
    int[] c    = {1,2,3,4};
    
    System.out.print("Escribe el número de filas: ");
    fils = sc.nextInt();
    
    System.out.print("Escribe el número de columnas: " );
    colums = sc.nextInt();
    
    System.out.print("Escribe el número menor: ");
    min = sc.nextInt();
    
    System.out.print("Escribe el mayor: ");
    Max = sc.nextInt();
    
   
    int[][] a = generarNumerosAleatoriosBidi(fils, colums, min, Max);
    mostrarBidi(a);
    System.out.println("");
    
    for(int num:c){
    int[] b = eleccionDeFilasYColumnas(a,num);
    if(num == 1){
      System.out.println("Mediadiagonal superior izquierda: ");
    }else if(num == 2){
      System.out.println("Mediadiagonal superior derecha: ");
      }else if(num == 3){
        System.out.println("Mediadiagonal inferior izquierda: ");
        }else{
          System.out.println("Mediadiagonal inferior derecha: ");
      }
    mostrarUni(b);
    for(int i = 1; i <= 3; i++){
      if(i == 1){
        System.out.print("Mínimo: ");
        }
        if(i == 2){
        System.out.print("Máximo: ");
        }
        if(i == 3){
        System.out.print("Media: ");
        }
        
      System.out.print(calculoArrayUni(b,i) + " ");
      }
      System.out.println("");
      System.out.println("");
   }
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
    
    public static int calculoArrayUni(int[] uni, int x){
      int M = Integer.MIN_VALUE;
      int m = Integer.MAX_VALUE;
      int count = 0;
      int plus = 0;
      int resultado = 0;
      int aux = 0;
      for(int num: uni){
        if(M < num){
          M = num;
          }
        if(m > num){
          m = num;
          }
          count++;
          plus+= num;
        }
        resultado = plus/count;
        if(x == 1){
          aux = m;
          }
          if(x == 2){
            aux = M;
            }
            if(x == 3){
             aux = resultado;
              }
        return aux;
      }
      
    public static void mostrarUni(int[] uni){
    for(int num:uni){
      System.out.printf("%4d",num);
      }
      System.out.println("");
   }
}
