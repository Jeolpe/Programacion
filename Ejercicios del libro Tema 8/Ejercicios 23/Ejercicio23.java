/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio23 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int c = 0;
    int max = 0;
    int min = 0;
    
    System.out.print("Escribe la cantidad de números aleatorios que desee obtener: ");
    c = sc.nextInt();
    
    System.out.print("Escribe el valor máximo: ");
    max = sc.nextInt();
    
    System.out.print("Escribe el valor mínimo: ");
    min = sc.nextInt();
    
    int [] a = numerosAleatorios(c, min, max);
    
    for(int num:a){
      System.out.print(num + " ");
      }
      
      System.out.print("");
      System.out.print("La media de los números obtenidos es de: " + mediaNumeros(a));
      
  }
  public static int [] numerosAleatorios(int z, int m, int M){
    int [] x = new int[z];
    for(int i = 0; i < x.length;i++){
      x[i] = (int)(Math.random()*(M-m+1)+m);
      }
      return x;
    }
    
    public static double mediaNumeros(int[]x){
      double suma = 0;
      double contador = 0;
      double resultado = 0;
      for(int num:x){
        suma+= num;
        contador++;
        }
        resultado = suma/contador;
        return resultado;
      }
}

