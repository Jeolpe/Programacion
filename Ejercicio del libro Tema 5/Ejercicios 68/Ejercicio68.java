/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio68 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int n2 = 0;
    int contador = 0;
    int r3 = 0;
    int r2 = 0;
    int r = 0;
    System.out.print("Por favor, escriba un número entero positivo: ");
    n = s.nextInt();
    
    n2 = n;
    if(n2 == 0){
      contador = 1;
      }
      
      while(n2 > 0){
        r = (r*10) + (n2%10);
        contador++;
        n2/=10;
        }
        
        for(int i =0; i < contador; i++){
          r2 = r%10;
          if(r2 % 2 == 0){
            r2++;
            }else{
            r2--;
            }
            r3 = (r3 *10) + r2;
            r/= 10;
          }
          
          System.out.print("Dislocando el " + n + " sale el " + r3);
  }
}

