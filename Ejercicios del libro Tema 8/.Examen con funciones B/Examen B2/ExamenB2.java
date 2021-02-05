/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class ExamenB2 {
	
	public static void main (String args[])
  throws InterruptedException{
    
    Scanner sc = new Scanner(System.in);
    int fils   = 0;
    int colums = 0;
    int min    = 0;
    int Max    = 0;
    int random = 0;
    boolean[][] saber;
		
    System.out.print("Indique el tamaño de la matriz bidimensional - filas: ");
    fils = sc.nextInt();
    
    System.out.print("Indique el tamaño de la matriz bidimensional - columnas: ");
    colums = sc.nextInt();
    
    System.out.print("Indique extremo inferior rango aleatorio para rellenar matriz: ");
    min = sc.nextInt();
    
    System.out.print("Indique extremo superior rango aleatorio para rellenar matriz: ");
    Max = sc.nextInt();
    
    System.out.print("Indique la cantidad de valores aleatorios que desea extraer:");
    do{
      random = sc.nextInt();
      if(random > (fils * colums)){
        System.out.print("Error, debe introducir un número igual o inferior a " + (fils * colums) + ": ");
      }
    }while(random >(fils * colums));
    
    int[][] a = generarNumerosAleatorios(fils, colums, min, Max);
    
    System.out.println("La matriz bidimensional tiene los siguientes valores:");
    for(int i = 0; i < a.length; i++){
      for(int j = 0; j < a[0].length; j++){
        saber[i][j] = false;
        System.out.printf("%3d",a[i][j]);
        }
        System.out.println("");
      }
      
     int[] b = esRepetido(a,random, saber);
      System.out.println("Los valores aleatoriamente obtenidos de la matriz son: ");
      
      
  }
  
  public static int[][] generarNumerosAleatorios(int filas, int columnas, int minimo, int Maximo){
    int[][] bidi = new int[filas][columnas];
    for(int i = 0; i < bidi.length; i++){
      for(int j = 0; j < bidi[0].length; j++){
        bidi[i][j] = (int)(Math.random()*(Maximo-minimo+1)+minimo);
      }
    }
    return bidi;
  }
  
  public static int[] esRepetido( int[][] bidi,int cantidad, boolean[][] a){
    int[] uni = new int[cantidad];
    int fils  = 0;
    int colums = 0;
    for(int i = 0; i < cantidad; i++){
      do{
      fils = (int)(Math.random()*9);
      colums = (int)(Math.random()*9);
      }while(a[fils][colums] = true);
         a[fils][colums] = true;
         uni[i] = bidi[fils][colums];
        }
        return uni;
    }
    
  }
