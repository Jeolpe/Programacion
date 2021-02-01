/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio51 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int c = 0;
    int min = 2 ;
    int Max = 100 ;
    
    System.out.print("Escribe la cantidad de números de Array Unidimensional: ");
    c = sc.nextInt();
		
    int[] a = generarNumerosAleatorios(c,min,Max);
    
    mostrar(a);
    
    mostrarComprobacion(a);
}
  
  public static int[] generarNumerosAleatorios(int x, int m, int M){
    int[] uni = new int[x];
    
    for(int i = 0; i < uni.length; i++){
      uni[i] = (int)(Math.random()*(M-m+1)+m);
      }
    return uni;
    }
    
    public static boolean esPrimo(int x){
      for(int i = 2; i < x; i++ ){
        if(x % i == 0){
          return false;
          }
        }
        return true;
      }
      
      public static int voltea(int x){
        int aux = 0;
        int x2 = 0;
        x2 = x;
        while(x > 0){
          aux = (aux *10) + (x%10);
          x/= 10;
          }
          return aux;
        }
      
      public static boolean esCapicua(int x){
        if(x == voltea(x)){
          return true;
          }
          return false;
        }
        
        public static void mostrar(int[] uni){
          System.out.println("El número generado aleatoriamente es: ");
          for(int num:uni){
            System.out.printf("%-4d",num);
            }
            System.out.println("");
            System.out.println("");
          }
          
          public static void mostrarComprobacion(int[] uni){
             for(int num:uni){
               if(esPrimo(num)){
                System.out.print("El " + num + " es primo ");
                }else{
                 System.out.print("El " + num + " es primo ");
               }  
         
               if(esCapicua(num)){
                System.out.print("y es capicua.");
                }else{
                 System.out.print("y no es capicua.");
               }
              System.out.println(""); 
	           }
          }
}

