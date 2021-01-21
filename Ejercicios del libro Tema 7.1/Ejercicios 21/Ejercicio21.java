/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio21 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
		int[]n = new int[15];
    boolean esmultiplo = false;
    int contador = 1;
    
    for(int i = 0; i < n.length; i++){
      n[i] = (int)(Math.random()*501);
      }
      
      
        for(int i = 0; i <n.length; i++){
          
              while(n[i]%5 !=0){
               n[i]++;
          }
            }
          System.out.println("");
        
        
        for(int num:n){
          System.out.print(num + " ");
          }
	}
}

