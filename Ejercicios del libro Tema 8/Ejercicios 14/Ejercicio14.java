/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio14 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n = 0;
    int n2 = 0;
    
    System.out.print("Escribe un número entero positivo: ");
    n = sc.nextInt();
    
    System.out.print("Escribe un número entero positivo: ");
    n2 = sc.nextInt();
    
    System.out.print("El número creado con los 2 números es el: " + unionNumeros(n,n2));
  }
  
  public static int voltea(int x){
    int x2 = 0;
    while(x > 0){
      x2 =(x2*10) + (x%10);
      x/= 10;
      }
      return x2;
    }
  public static int unionNumeros(int x, int z){
    z = voltea(z);
    while (z > 0){
      x =(x*10) + (z%10);
      z/= 10;
      }
      return x;
    }
  }

