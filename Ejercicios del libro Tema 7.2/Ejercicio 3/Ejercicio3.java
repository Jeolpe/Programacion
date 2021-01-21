/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio3 {
	
	public static void main (String args[])
  throws InterruptedException{
    
    Scanner s = new Scanner(System.in);
    int[][]n = new int[4][5];
    
    //El programa generará los números de forma aleatoria.
    for(int i = 0; i < 4; i++){
      for(int j = 0; j < 5; j++){
        n[i][j] = (int)(Math.random()*((999-100)+1)+1);
        System.out.print(n[i][j] + " ");
        //Para que sea un retraso de 1 segundo.
        Thread.sleep(1000);
        }
        System.out.println("");
      }
  }
}

