/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio55 {
	
	public static void main (String args[]) {
		
    Scanner s = new Scanner(System.in);
    int n = 0;
    int n2 = 0;
    int contador = 0;
    int r = 0;
    int r2 = 0;
    
    System.out.print("Por favor, Escribe un número entero positivo: ");
    n = s.nextInt();
    
    n2 = n;
    if(n2 == 0){
    contador = 1;
   }
   
   while(n2 > 0){
     r =(r*10) + (n2%10);
     contador++;
     n2/=10;
     }
     r2 = r;
     for(int i = 0; i < contador-1; i++){
       r2/= 10;
       }
       
    for(int j = 0; j < contador-1 ; j++){
      r2 = (r2 * 10)+ (r%10);
      r/=10;
      }
      
      System.out.print(r2);
	}
}

