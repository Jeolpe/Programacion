/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio13{
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int a = 0;
    int b = 0;
    int c = 0;
    int aux = 0;
    
    System.out.println("Escriba usted el primer número");
    a = s.nextInt();
    
    System.out.println("Escriba usted el segundo número");
    b = s.nextInt();
    
    System.out.println("Escriba usted el tercer número");
    c = s.nextInt();
    
    if (a > b){
      aux = a;
      a = b;
      b = aux;
      }
      
    if (b > c){
      aux = b;
      b = c;
      c = aux;
      }
      
    if (a > c){
      aux = a;
      a = c;
      c = aux;
      }
      
      System.out.println("El número ordenador de menor a mayor es: "  + a + " " + b + " " + c);
      
      
      
      
      
      
    
    
    
		
	}
}

