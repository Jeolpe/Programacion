/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio34 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int n2 = 0;
    int r2 = 0;
    int r = 0;
    int par = 0;
    int impar = 0;
    int aux = 0;
    int aux2 = 0;
    
    System.out.print("Escribe un número entero: ");
    n = s.nextInt();
    
    System.out.print("Escribe un segundo número entero: ");
    n2 = s.nextInt();
    
    while(n > 0){
      r = (r*10) + (n%10);
      n/=10;
      }
    while(n2 > 0){
      r2= (r2*10) + (n2%10);
      n2/=10;
      }
      
      while(r2 > 0){
        par = r % 10;
        if (par % 2 == 0){
          aux = (aux*10) + par;
        }else{
          aux2 = (aux2*10) + par;
        }
        
        impar = r2 % 10;
        if(impar % 2 == 0){
           aux = (aux*10) + impar;
          }else{
            aux2 =(aux2*10) + impar; 
          }
          par/= 10;
          impar/=10;
          r2/= 10;
          r/= 10;
        }
        
        System.out.println("Los números pares son: " + aux);
        System.out.print("Los números impares son: " + aux2);
        
  }
}

