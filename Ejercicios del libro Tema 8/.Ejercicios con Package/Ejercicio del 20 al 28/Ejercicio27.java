/*
 *@utor Jesús María Olalla Pérez 
 */
import array.ArrayUni;
import java.util.Scanner;
public class Ejercicio27 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n      = 0;
    int min    = 0;
    int Max    = 0;
    int numero = 0;
    
    System.out.print("Escribe un número entero positivo: ");
    n = sc.nextInt();
    System.out.print("Escribe un extremo para los números aleatorios: ");
    min = sc.nextInt();
    System.out.print("Escribe el otro extremo para los números aleatorios: ");
		Max = sc.nextInt();
    System.out.print("Escribe el número de veces que quieres que rote el número hacia la derecha");
    numero = sc.nextInt();
    
    int[] a = array.ArrayUni.generaArrayUni(n,min,Max);
    
    for(int num:a){
      System.out.printf("%4d",num);
    }
    
    a = array.ArrayUni.rotaDerechaArrayUni(a,numero);
    System.out.println("");
    System.out.println("El número rotado a la derecha: ");
    for(int num:a){
      System.out.printf("%4d",num);
    }
  }
}
