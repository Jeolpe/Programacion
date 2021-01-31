/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio37 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n = 0;
		String[] morse = {". _ _ _ _", ". ._ _ _", ". . . _ _", ". . . . _", ". . . . .","_ . . . .", "_ _ . . .", "_ _ _ . .", "_ _ _ _ .", "_ _ _ _ _"};
	
    System.out.print("Escribe un numero entero positivo: ");
    n = sc.nextInt();
    
    int[] a = convierteEnMorse(n);
    
    mostrar(a,morse,n);
  }
  
  public static int volteo(int x){
    int aux = 0;
    while(x > 0){
      aux = (aux*10) + (x%10);
      x/= 10;
      }
      return aux;
    }
    
    public static int contar(int x){
    int contador = 0;
    while(x > 0){
      x/= 10;
      contador++;
      }
      return contador;
    }
    
    
    public static int[] convierteEnMorse(int x){
      int[] uni = new int[contar(x)];
      int aux = 0;
      int count = 0;
      while(x > 0){
        aux = x%10;
        x/= 10;
        uni[count] = aux;
        count++;
        }
      return uni;
      }
      
      public static void mostrar(int[] uni, String[] p, int x){
        System.out.println("");
        System.out.println("El número " + x +  " traducido en morse es: ");
        for(int num:uni){
          System.out.print(p[num] + " ");
          }
        }
}

