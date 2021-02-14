/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio13{
	
	public static void main (String args[])
  throws InterruptedException{
    
    Scanner s = new Scanner(System.in);
    String[] P ={"Españ", "Rusia", "Japón","Austr"};
    int[][] n = new int[4][10];
    int suma = 0;
    int contador = 0;
    int resultado = 0;
    int m = Integer.MAX_VALUE;
    int M = Integer.MIN_VALUE;
    
    for(int i = 0; i < 4; i++){
    System.out.print(P[i] + ": ");
      for(int j = 0; j <10; j++){
        n[i][j] = (int)(Math.random()*(210-140+1))+140;
        System.out.print(n[i][j] + " ");
        if(n[i][j] > M){
          M = n[i][j];
          }else if(n[i][j] < m){
            m = n[i][j];
           }
        contador++;
        suma+= n[i][j];
        }
        resultado = suma/contador;
        Thread.sleep(1);
        System.out.print("   " + resultado);
        System.out.print(" " + m);
        System.out.print(" " + M);
        System.out.println("");
        m = Integer.MAX_VALUE;
        M = Integer.MIN_VALUE;
        contador = 0;
        suma = 0;
      }
  }
}

