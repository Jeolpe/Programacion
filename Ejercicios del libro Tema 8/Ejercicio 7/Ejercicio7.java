/*
 * @utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio7 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n = 0;
    int d = 0;
		
    System.out.print("Escribe un número positivo: ");
    n = sc.nextInt();
    
    System.out.print("Escribe la pocisión que quiera que devuelva el número: ");
    d = sc.nextInt();
    
    System.out.print("El número es el " + digitoNumero(n,d));
	}
  
  public static int voltio(int x){
    int x2 = 0;
    while(x > 0){
      x2 = (x2 * 10) + (x%10);
      x/= 10;
      }
      return x2;
    }
    
   
      
      public static int digitoNumero(int x, int z){
        x = voltio(x);
        int x2= 0;
        for(int i = 0; i < z; i++){
          x/= 10;
          }
          x2= x%10;
          return x2;
        }
      
      
}

