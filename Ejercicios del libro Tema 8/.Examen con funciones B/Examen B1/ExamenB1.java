/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class ExamenB1 {
	
	public static void main (String args[])
  throws InterruptedException{
    
    Scanner sc  = new Scanner(System.in);
    int tamanio = 0;
    int fils    = 0;
    int colums  = 0;
    
    System.out.print("Introduzca el tamaño de la matriz unidimensional:");
    tamanio = sc.nextInt();
    
    int[] a = new int[tamanio];
    
    for(int i = 0; i <a.length; i++){
      System.out.print("Introduzca el elemento " + (i+1)+ "º: ");
      a[i] = sc.nextInt();
    }
      
      System.out.print("Introduzca el tamaño de la matriz bidimensional - filas: ");
      fils = sc.nextInt();
      
      System.out.print("Introduzca el tamaño de la matriz bidimensional - columnas: ");
      colums = sc.nextInt();
      
       presentar(a);
        
        System.out.println("");
        System.out.println("");
        
      int[][] b = convertirDeUniABidi(a,fils,colums);
      
      presentar(b);
  }
  public static int[][] convertirDeUniABidi(int[] uni, int filas, int columnas){
    int[][] bi = new int[filas][columnas];
    int count = 0;
    for(int i = 0; i <bi.length;i++){
      for(int j = 0; j <bi[0].length;j++){
       bi[i][j] = (count < uni.length) ?uni[count] : -1;
       count++;
      /*if(count < uni.length){
        bi[i][j] = uni[count];
         count++;
        }else{
        bi[i][j] = -1;
        }
         */
      }
    }
    return bi;
  }
  public static void presentar(int[] uni){
    System.out.println("");
      System.out.println("La matriz unidimensional de origen es:");
      for(int num:uni){
        System.out.printf("%3d", num);
      }
  }
  
  public static void presentar(int[][] bidi){
  System.out.println("La matriz bidimensional de destino queda así:");
      for(int i = 0; i <bidi.length; i++){
        for(int j = 0; j <bidi[0].length;j++){
          System.out.printf("%3d",bidi[i][j]);
        }
          System.out.println("");
      }
  }
}
