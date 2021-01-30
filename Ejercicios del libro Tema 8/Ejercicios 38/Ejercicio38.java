/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio38 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int c = 0;
    
    System.out.print("Escribe la cantidad del Array Unidimensional: ");
    c = sc.nextInt();
    
    int[] a = new int[c];
    
    
    for(int i = 0; i < a.length; i++){
      System.out.print("Escribe el " + (i+1) + "º elemento: " );
      a[i] = sc.nextInt();
      }
      int[] b = filtraCapicuas(a);
      System.out.println("");
      
      mostrar(b);
  }
  
  public static boolean esCapicua(int x){
    int x2 = 0;
    int aux = x;
    while(aux > 0){
      x2 =(x2*10) + (aux%10);
      aux/= 10;
      }
      if(x2 == x){
        return true;
        }
        return false;
    } 
    
    public static int contador(int[] uni){
    int count = 0;
    for(int nume:uni){
    if(esCapicua(nume)){
      count++;
      }
    }
      return count;
    }
    
    public static int[] filtraCapicuas(int[] uni){
      int[] x = new int[contador(uni)]; 
      int count = 0;
      for(int num:uni){
      if(esCapicua(num)){
        x[count] = num;
        count++;
        }
     }
     return x;
  }
  
  public static void mostrar(int[] uni){
    System.out.println("Los números capicua son: ");
    System.out.println("");
    for(int num:uni){
        System.out.print(num + " ");
        }
    }
}

