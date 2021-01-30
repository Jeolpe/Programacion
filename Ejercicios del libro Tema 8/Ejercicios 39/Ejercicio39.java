/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio39 {
	
	public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    int num = 0;
    String[] palabra = {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
    
    System.out.print("Escribe un número entero positivo: ");
    num = sc.nextInt();
    
    int [] a = convierteEnPalabras(num);
    
   mostrar(a,palabra,num);
		
	}
  
   public static int voltio(int x){
     int aux = 0;
     while(x > 0){
       aux = (aux*10) + (x%10);
       x/= 10;
       }
       return aux;
     }
     
      public static int contador(int x){
     int count = 0;
     while(x > 0){
      x/= 10;
      count++;
       }
       return count;
     }
     
     
   public static int[] convierteEnPalabras(int x){
     int[] n = new int[contador(x)];
     x = voltio(x);
     int aux = 0;
     int count = 0;
     while(x > 0){
       aux = x%10;
       x/= 10;
       n[count] = aux;
       count++;
       }
       return n;
     }
     
     public static void mostrar(int[] uni, String[]uni2, int x){
       int count = 1;
       System.out.println("");
       System.out.print("Los número escritos en letra son: ");
       System.out.println("");
       for(int num:uni){
         if(count < contador(x)){
         System.out.print(uni2[num] + ",");
         count++;
         }else{
           System.out.print(uni2[num] + ".");
           }
       }
     }
}

