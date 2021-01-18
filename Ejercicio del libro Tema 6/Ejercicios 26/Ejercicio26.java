/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio26 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int h = 0;
    int x = 0;
    
    System.out.print("Introduce la altura: ");
    h = s.nextInt();
    
    System.out.print("Introduce la anchura: ");
    x = s.nextInt();
    int a = 0;
    int contador = 0;
    
    
    
    for(int i = 1; i <= h; i++){
    
      for(int j = 1; j <= x; j++){
        a = (int)(Math.random()*(x*2)+1);
        if(i == 1 || i == h){
          switch(a){
            case(1):
            if(contador ==0){
            System.out.print(" ");
            contador = 1;
          
            break;
            }
            default:
            System.out.print("*");
          }
        
        
           }else if(j == 1 || j == x && contador != 1){
            switch(a){
            case(1):
            if(contador == 0){
            System.out.print(" ");
            contador = 1;
            break;
          }
            default:
            System.out.print("*");
          }
            }else{
             System.out.print("*"); 
          }
          
        }
            System.out.println(" ");
            
        }
        
  }
}

