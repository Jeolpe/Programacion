/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio6 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int[][] n = new int[6][10];
    boolean repetido = true;
    
    for(int i = 0; i < 6; i++){
      for(int j = 0; j < 10; j++){
        do{
          n[i][j] = (int)(Math.random()*1001);
          repetido = false;
          for(int k = 0; k < 10*i+j;k++){
            if(n[i][j] == n[k/10][k%10]){
              repetido = true;
              }
            }
          }while(repetido);
          System.out.print(n[i][j] + " ");
      }
      System.out.println("");
    }
    int m = Integer.MAX_VALUE;
    int M = Integer.MIN_VALUE;
    int pMi = 0;
    int pMj = 0;
    int pmi = 0;
    int pmj = 0;
    
    for(int i = 0; i < 6; i++){
      for(int j = 0; j < 10; j++){
        if(n[i][j] <= m){
          m = n[i][j];
          pmi = i;
          pmj = j;
          }
          
          if(n[i][j] >= M){
            M = n[i][j];
            pMi = i;
            pMj = j;
            }
        }
      }
      System.out.println("");
      System.out.println("El número Mayor es el: " + M +" y se encuentra en las coordenadas: ["+ pMi +"]["+ pMj+"].");
      System.out.print("El número Mayor es el: " + m +" y se encuentra en las coordenadas: ["+pmi +"]["+ pmj+"].");
	}
}

