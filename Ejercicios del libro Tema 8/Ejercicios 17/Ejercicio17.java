/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio17 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int b = 0;
    
    System.out.print("Escribe un número binario: ");
    b = sc.nextInt();
    
    System.out.print("El número convertido a decimal es el: " + Numeros(b));
	}
  
    public static int Numeros(int x){
       int x3 = 0;
       int x2 = 0;
       int aux = 1;
       int contador = 1;
       int suma = 0;
       while(x > 0){
         x3 = x % 10;
         x2 = aux * contador;
         aux = x2;
         contador = 2;
         if(x3 == 1){
         suma+= x2;
        }
         x/= 10;
         }
         return suma;
      }
}

