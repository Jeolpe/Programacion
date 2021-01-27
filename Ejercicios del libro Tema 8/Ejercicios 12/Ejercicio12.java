/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio12 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n = 0;
    int d = 0;
    int aux = 0;
    
    System.out.print("Escriba un número entero positivo: ");
    n = sc.nextInt();
    
    System.out.print("Escriba el dígito que quiera añadir: ");
    d = sc.nextInt();
    
    aux = pegaPorDelante(n,d);
    
    
    System.out.print(pegaPorDelante(n,d));
    
  }
  
  public static int voltea(int x){
    int x2 = 0;
    while(x > 0){
      x2 = (x2*10) + (x%10);
      x/= 10;
      }
      return x2;
    }
    
    public static int pegaPorDelante(int x, int z){
      x = voltea(x);
      x =(x*10) + z;
      x = voltea(x);
      return x;
      }
      
    
}

