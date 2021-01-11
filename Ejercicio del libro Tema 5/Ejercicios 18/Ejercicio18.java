/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio18 {
	
	public static void main (String args[]) {
	
    Scanner s = new Scanner(System.in);
    int n  = 0;
    int n2 = 0;
    
    System.out.print("Escribe el primer número entero: ");
    n = s.nextInt();
    
    System.out.print("Escribe el segundo número entero: ");
    n2= s.nextInt();
    
    if(n != n2){
    if(n < n2){
      for(int i = n; i <= n2; i+= 7){
        System.out.print(i + ",");
        }
      }else{
        for(int j = n2; j <= n; j+= 7){
          System.out.print(j + ",");
          }
        }
      }else{
        System.out.print("Los números deben de ser distintos.");
      }
	}
}

