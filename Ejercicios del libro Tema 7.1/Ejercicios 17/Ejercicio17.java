/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio17 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int[]n = new int[10];
    boolean dentro = false;
    int n2 = 0;
    
    
    for( int i = 0; i <n.length;i++){
      n[i] = (int)(Math.random()*101);
      }
      
      
     
    do{ 
      System.out.print("Escribe un número: ");
        n2 = s.nextInt();  
       for(int num:n){
        if(num == n2){
          dentro = true;
        
        }
      }
      
      if(!dentro){
        System.out.print("El número no esta dentro, intentelo de nuevo.");
        System.out.println("");
        }
        }while(!dentro);
        
        while(n[0] != n2){
          int aux = n[9];
          for(int i = 9; i > 0; i--){
            n[i] = n[i-1];
            }
            n[0] = aux;
          }
          
          for(int num: n){
            System.out.print( num + " ");
            }
		
	}
}

