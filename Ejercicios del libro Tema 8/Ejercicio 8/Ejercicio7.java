/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio7 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n = 0;
    int n2 = 0;
    
    System.out.print("Escribe un número entero positivo: ");
    n = sc.nextInt();
    
    System.out.print("Escribe el número para que le diga la posición: ");
    n2 = sc.nextInt();
    
    
    System.out.print("Esta en la posición " + contadorNum(n,n2));
		
	}
  
  public static int contadorNum(int x, int z){
    int contador = 0;
    int x2 = 0;
    x = DarLaVuelta (x);
    if(x == 0){
      contador = 1;
      return contador;
      }
      
      while(x > 0){
        x2 = x % 10;
        contador++;
        if(x2 == z){
          return contador;
        }
          x/= 10;
        }
        contador = -1;
        return contador;
     }
  
  public static int DarLaVuelta(int x){
    int x2 = 0;
    while(x > 0){
      x2 = (x2*10)+(x%10);
      x/= 10;
      }
      return x2;
    }
}

