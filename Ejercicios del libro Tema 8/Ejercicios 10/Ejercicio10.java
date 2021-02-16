/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio10 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n = 0;
    int d = 0;
    
    System.out.print("Escribe un número entero: ");
    n = sc.nextInt();
    
    System.out.print("Escribe un dígito: ");
    d = sc.nextInt();
    
    int aux = quitaPorDelante(n,d);
    
		System.out.print("El número ha quedado: " + voltioOtraVez(aux));
	}
  
  public static int voltio(int x){
    int x2 = 0;
    while(x > 0){
      x2 = (x2 * 10) + ( x % 10);
      x/= 10;
      }
      return x2;
    }
    
    public static int quitaPorDelante(int x, int z){
      x = voltio (x);
      
      for(int i = 1; i <= z; i++){
        x/= 10;
        }
        return x;
      }
      
      public static int voltioOtraVez(int x){
        int x2 = 0;
      while(x > 0){
      x2 = (x2 * 10) + ( x % 10);
      x/= 10;
      }
      return x2;
    }
        
}

