/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio4 {
	
	public static void main (String args[])
    throws InterruptedException{
      
    Scanner s = new Scanner(System.in);
		int[][]n = new int[4][5];
    int suma = 0;
    int suma2 = 0;
    int sumatotal = 0;
    
    for(int i = 0; i < 4; i++){
      for(int j = 0; j < 5; j++){
        n[i][j] = (int)(Math.random()*(999-100)+1)+100;
        
        System.out.print(n[i][j] + " ");
        suma+= n[i][j];
        sumatotal+= n[i][j];
        }
        Thread.sleep(1000);
        System.out.print("    ="+ suma);
        System.out.println("");
        suma = 0;
      }
      
      for(int i = 0; i < 5; i++){
        for(int j = 0; j < 4; j++){
          suma2+=n[j][i];
          sumatotal+=n[j][i]; 
          }
          Thread.sleep(1000);
          System.out.print(suma2 + " ");
          suma2 = 0;
          }
          Thread.sleep(2000);
          System.out.print("   La suma total es: " + sumatotal);
	}
}

