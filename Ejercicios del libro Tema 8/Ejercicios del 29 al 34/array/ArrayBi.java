/*
 *@utor Jesús María Olalla Pérez
 */

package array;
public class ArrayBi {
  

	/*Genera Arrays Bidimensionales Aleatoriamente*/
	public static int [][] generaArrayBidi(int fil, int colum, int m, int M ){
    int[][] x = new int[fil][colum];
    
    for(int i = 0; i < fil; i++){
      for(int j = 0; j <colum; j++){
        x[i][j] = (int)(Math.random()*(M-m+1)+m);
      }
    }
    return x;
  }
  /*Termina los Arrays generados Aleatoriamente*/
  
/*--------------------------------------------------------------------------------*/
  
  /*Presenta por pantalla un Array Bidimensional*/
  public static void mostrar(int[][] bi){
    for(int i = 0; i < bi.length; i++){
      for(int j = 0; j < bi[0].length;j++){
        System.out.printf("%-4d",bi[i][j]);
      }
      System.out.println("");
    }
  }
  /*Termina de presentar un Array Bidimensional*/
  
/*-----------------------------------------------------------------------------------*/
  
  /*Esto es para el Ejercicio 30*/
  
  public static int[] filaDeArrayBi(int[][] bi, int fil){
    int[] x = new int[bi[0].length];
      for(int j = 0; j < bi[0].length;j++){
        x[j] = bi[fil-1][j];
      }
    return x;
  }
  
  public static void mostrarfilaDeArrayBi(int[] x){
    for(int num:x){
      System.out.printf("%-4d",num);
      }
    }
    
    /*Aquí termina el Ejercicio 30*/
    
/*-------------------------------------------------------------------------------------*/

    /*Esto es para el Ejercicio 31*/
    
  public static int[] columnaDeArrayBi(int[][] bi, int colum){
    int[] x = new int[bi.length];
    for(int i = 0; i < bi.length;i++){
      x[i] = bi[i][colum-1];
      }
      return x;
    }
    
    public static void mostrarcolumnaDeArrayBi(int[] x){
    for(int num:x){
      System.out.printf("%-4d",num);
      }
    }
    
    /*Aquí termina el Ejercicio 30*/
    
    /*-------------------------------------------------------------------------------------*/
    
    /*Esto es para el Ejercicio 32*/
    
      public static int[] coordenadasEnArrayBi(int[][] bi, int num1){
    for(int i = 0; i < bi.length; i++){
      for(int j = 0; j < bi[0].length; j++){
        if(bi[i][j] == num1){
         int[] x = {i,j};
           return x;
          }
        }
      }
      int[] x = {-1,-1};
      return x;
    }
  
    /*Aquí termina el Ejercicio 32*/
    
    /*-------------------------------------------------------------------------------------*/
    
    /*Esto es el Ejercicio 33*/
    
    public static int[] esPuntoSillaFilas(int[][] bi){
    int[] x = new int[bi.length];
    int m = Integer.MAX_VALUE;
    int M = Integer.MIN_VALUE;
    for(int i = 0; i < bi.length;i++){
      for(int j = 0; j < bi[0].length;j++){
        if(m > bi[i][j]){
          m = bi[i][j];
          x[i] = bi[i][j];
          }
        }
        m = Integer.MAX_VALUE;
      }
      return x;
    }
    
    public static int[] esPuntoSillaColumnas(int[][] bi){
      int[] x = new int[bi[0].length];
      int M = Integer.MIN_VALUE;
      for(int j = 0; j < bi[0].length;j++){
        for(int i = 0; i < bi.length;i++){
          if(M < bi[i][j]){
            M = bi[i][j];
            x[j] = bi[i][j];
            }
          }
          M = Integer.MIN_VALUE;
        }
        return x;
      }
      
    /*Aquí termina el Ejercicio 33*/
    
 /*-------------------------------------------------------------------------------------*/

    /*Esto es el Ejercicio 34*/
    
    public static int[] diagonal(int[][] bi, String palabra){
      int[] x = new int[bi.length];
      
      
      if(palabra.equals("nose")){
        for(int i = 0 ; i < bi.length;i++){
          for(int j = 0; j < bi[0].length;j++){
            if(i == j){
            x[i] = bi[i][j];
          }
            }
          }
        }
        
        if(palabra.equals("neso")){
          int aux = bi[0].length-1;
          for(int i = 0; i <bi.length ;i++){
            for(int j = 0; j < bi[0].length;j++){
              if(aux == j){
              x[i] = bi[i][j];
              aux--;
              }
            }
          }
       }
      return x;
   }
   
   /*Aquí termina el Ejercicio 33*/
}
