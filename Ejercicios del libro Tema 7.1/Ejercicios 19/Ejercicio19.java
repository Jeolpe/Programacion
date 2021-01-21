/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio19 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int[]n = new int[12];
    int[]n3 = new int[13];
    int n2 = 0;
    int Posc = 0;
    int aux = 0;
    int numeros = 1;
    
    for(int i = 0; i < n.length; i++){
      n[i] = (int)(Math.random()*201);
      System.out.print(n[i] + " ");
    
      }
      
      
      
      System.out.println("");
      System.out.print("Escribe el número que quieras introducir: ");
      n2 = s.nextInt();
      
      System.out.print("Escribe la posición que quieres que este el número: ");
      Posc = s.nextInt();
      System.out.println("");
      System.out.println("");
      
      for(int i = 11; i > Posc; i--){
        n[i] = n[i-1];
        }
        n[Posc] = n2;
        
        for(int num:n){
          System.out.print(num + " ");
          }
  }
}

