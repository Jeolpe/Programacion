/*
 *@utor Jesús María Olalla Pérez 
*/

import java.util.Scanner; 
public class Ejercicio1 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    
    for(int i = 0; i<=100;i+=5){
      if(i < 100){
        System.out.print(i + ",");
        
      }else{
        System.out.print(i);
        }
      }
		
	}
}

