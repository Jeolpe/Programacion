/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio12 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int num = 0;
    int a = 0;
    int b = 1;
    int c = 0;
    
    System.out.println("Escribe hasta el número que llegue Fibonacci");
    num = s.nextInt();
    
    for(int i = 0; i <= num; i++){
      if(i < num){
       System.out.print(a + ",");
       c = b + a;
       a = b;
       b = c;
        }else{
         System.out.print(a);
      }
    }
	}
}

