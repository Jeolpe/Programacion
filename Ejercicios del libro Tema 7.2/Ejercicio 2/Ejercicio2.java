/*
 *@utor Jesús María Olalla Pérez  
 */

import java.util.Scanner;
public class Ejercicio2 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int sumaFilas = 0;
    int sumaTotal = 0;
    int sumaColumnas = 0;
  
    
    //Primero pregunta el programa por los números.
    System.out.print("Escribe 20 números enteros:");
    int[][]n = new int[4][5];
    for(int i = 0; i < 4;i++){
      for(int j = 0; j < 5; j++){
        n[i][j] = s.nextInt();
        }
      } 
      
      //Sumo las filas.
      for(int i = 0; i < 4; i++){
        sumaFilas = 0;
        for(int j = 0; j < 5; j++){
          sumaFilas+= n[i][j];
          }
          System.out.println("La suma de la fila " + (i+1) + " es: " + sumaFilas);
          sumaTotal+= sumaFilas;
        }
      System.out.println("---------------------------------------------------- ");
      //Sumo las columnas
      for(int i = 0; i < 5; i++){
        sumaColumnas = 0;
        for(int j = 0; j < 4; j++){
          sumaColumnas+= n[j][i];
          }
          System.out.println("La suma de la columna " + (i+1) + " es: " + sumaColumnas);
          sumaTotal+= sumaColumnas;
        }

		//Calculamos las dos sumas.
    System.out.println("---------------------------------------------------- ");
    System.out.print("La suma total de columnas y filas son: " + sumaTotal);
	}
}

