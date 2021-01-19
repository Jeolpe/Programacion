/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio7 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    
    int[]n = new int[10];
    int r = 0;
    int r2 = 0;
    
    for(int i = 0; i < n.length; i++){
      n[i] = (int)(Math.random()*21);
      System.out.print(n[i] + " ");
      }
    System.out.println("");
    System.out.println("");
    
    System.out.print("Escribe el primer valor: ");
    r = s.nextInt();
    
    System.out.print("Escribe el segundo valor: ");
    r2 = s.nextInt();
    
    for(int i = 0; i < n.length; i++){
      if( n[i] == r){
        n[i] = r2;
        System.out.print("\""+ n[i] + "\" ");
        }else{
          System.out.print(n[i] + " ");
        }
      } 
	}
}

