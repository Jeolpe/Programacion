/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio1 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n = 0;
    
    System.out.print("Escribe un número entero positivo: ");
    n = sc.nextInt();
    
    if(esCapicua(n)){
      System.out.print("El " + n + " es un número capicúa");
      }else{
        System.out.print("El " + n + " NO es un número capicúa");
    }
	}
  
  public static boolean esCapicua(int x){
    return x == voltea(x);
    }
    
    public static int voltea(int x){
       int l = 0;
       while(x > 0){
         l = (l * 10) + (x%10);
         x/= 10; 
      }
      return l;
    }
}

