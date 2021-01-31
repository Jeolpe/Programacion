/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio40 {
	public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int c = 0;
    int min = 0;
    int Max = 0;
    
    System.out.print("Escribe la cantidad de Arrays Unidimensional: ");
    c = sc.nextInt();
    
    System.out.print("El tamaño mínimo: ");
    min = sc.nextInt();
    
    System.out.print("El tamaño Máximo: ");
    Max = sc.nextInt();
		
    int[] a = generarArrays(c,min,Max);
    int[] b = filtraCon7(a);
    mostrar(a);
    System.out.println("");
    mostrar(b);
	}
  
  public static int[] generarArrays(int z, int m, int M){
    int[] uni = new int[z];
    for(int i = 0; i < uni.length; i++){
      uni[i] = (int)(Math.random()*(M-m+1)+m);
      }
      return uni;
    }
    
    public static void mostrar(int[] uni){
      System.out.println("El número generado aleatoriamente es: ");
      for(int num:uni){
        System.out.printf("%-4d",num);
        }
      }
      
      public static boolean esSiete(int x){
        int aux = 0;
        while(x > 0){
          aux = x%10;
            x/= 10;
          if(aux == 7){
            return true;
            }
          }
          return false;
        }
        
        public static int contar(int[] uni){
          int contador = 0;
          int aux = 0;
          for(int num:uni){
          while(num > 0){
          aux = num%10;
          if(aux == 7){
           contador++;
           num = 0;
           }
            num/= 10;
           } 
          }
          return contador;
        }
        
     public static int[] filtraCon7(int[] x){
       int[] uni = new int[contar(x)];
       int contador = 0;
       for(int num:x){
         if(esSiete(num)){
           uni[contador] = num;
           contador++;
           }
         }
         return uni;
       }
  }

