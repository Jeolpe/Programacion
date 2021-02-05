/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class ExamenA2 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int tamanio, num;
    
    
    System.out.print("Introduzca la cantidad de elementos del conjunto aleatorio base: ");
    tamanio = sc.nextInt();
    
    int[] a = new int[tamanio];
    int count = 0;
    
    for(int i = 0; i < a.length;i++){
      System.out.print("Introduzca un valor aleatorio base: ");
        count = 0;
      do{
        num = sc.nextInt();
       if(!esRepetido(a,num)){
        a[i] = num;
        num = Integer.MIN_VALUE;
        }else{
        System.out.print("Dato repetido. Introduzca un valor aleatorio base: "); 
       } 
     }while(esRepetido(a,num));
        
    }
    
      mostrarArrayUni(a);
      System.out.println("");
      System.out.println("");
      
      int fils, colums;
      
      System.out.print("Indique el tamaño de la matriz bidimensional a ser rellenada - filas:");
      fils = sc.nextInt();
      
      System.out.print("Indique el tamaño de la matriz bidimensional a ser rellenada - columnas:");
      colums = sc.nextInt();
      
      int[][] b = generarArrayBidi(a, fils, colums);
      mostrarArrayBidi(b);
      
  }
  
    public static int[][] generarArrayBidi(int[] uni, int f, int c){
      int[][] bidi = new int[f][c];
      int numAlea = 0;
      
      for(int i = 0 ; i < bidi.length; i++){
        for(int j = 0; j < bidi[0].length; j++){
          numAlea = (int)(Math.random()*uni.length);
          bidi[i][j] = uni[numAlea];
          }
        }
        return bidi;
      }
  
    
    public static boolean esRepetido(int[] uni, int x){
      boolean repetido = false;
      for(int i = 0; i < uni.length; i++){
        if(uni[i] == x){ 
        repetido = true;
         }   
      }
        return repetido;
    }
      
      public static void mostrarArrayUni(int[] uni){
        System.out.println("");
        System.out.println("Los valores que podrán ser elegidos aleatoriamente son los siguientes: ");
        for(int num:uni){
        System.out.printf("%4d",num); 
          }
      }
      
      public static void mostrarArrayBidi(int[][] bidi){
        for(int i = 0; i < bidi.length; i++){
          for(int j = 0; j < bidi[0].length; j++){
            System.out.printf("%4d", bidi[i][j]);
            }
            System.out.println("");
          }
        }
}

