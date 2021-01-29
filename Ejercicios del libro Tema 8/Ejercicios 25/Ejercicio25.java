/*
 * @utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio25 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int c  = 0;
    int M  = 0;
    int m  = 0;
    int d  = 0;
    
    System.out.print("Escribe la cantidad del Arrays Unidimensional: ");
    c = sc.nextInt();
    
    System.out.print("Escribe el mínimo: ");
    m = sc.nextInt();
    
    System.out.print("Escribe el Máximo: ");
    M = sc.nextInt();
    
    System.out.print("Escribe un dígito: ");
    d = sc.nextInt();
    
    int[] a = aleatoriosNumeros(c,m,M);
    
    for(int num:a){
      System.out.print(num + " ");
      }
      
      System.out.println("");
      
    if(saberNumeros(a,d)){
    System.out.print("El número que has introducido esta en la posición: " + saberPosicion(a,d));
    }else{
    System.out.print("El número no se encuentra en la Matriz Unidimensional.");
    }
  }
  
  public static int [] aleatoriosNumeros(int z, int m, int M){
    int [] x = new int[z];
    for(int i = 0; i < x.length; i++){
      x[i] = (int)(Math.random()*(M-m+1)+m);
      }
      return x;
    }
    
    public static boolean saberNumeros(int [] x, int z){
      int contador = 0;
      for(int num:x){
        if(num == z){
          return true;
          }
        }
        return false;
      }
    
      
      public static String saberPosicion(int [] x, int z){
        String contador = "";
        for(int i = 0; i < x.length; i++){
          if(x[i] == z){
            contador= contador + i + " ";
            }
          }
          return contador;
        }
    }

