/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio43 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int p = 0;
    int n2 = 0;
    int contador = 0;
    int r2 = 0;
    int r3 = 0;
    int r4 = 0;
    int r = 0;
    int contador2 = 0;
    
    System.out.print("Escribe un número: ");
    n = s.nextInt();
    
    System.out.print("Escibe la posición que quieres que se corte: ");
    p = s.nextInt();
    
    n2 = n;
    if(n2 == 0){
      contador = 1;
      }
		
    while(n2 > 0){
      r = (r*10) + (n2%10);
      n2/= 10;
      contador++;
      }
      
    for(int i = 0; i < contador; i++){
      r2 = r%10;
      contador2++;
      if(contador2 >= p){
        r4 = (r4 * 10) + (r2);
        }else{
         r3 = (r3 * 10) + (r2); 
       }
        
        r/=10;
      }
      System.out.print("Los números partidos son el: " + r3 + " y el " + r4);
	}
}

