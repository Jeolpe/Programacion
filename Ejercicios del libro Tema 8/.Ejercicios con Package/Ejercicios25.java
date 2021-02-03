/*
 *@utor Jesús María Olalla Pérez 
 */
import array.ArrayUni;
import java.util.Scanner;
public class Ejercicios25 {
	
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
    System.out.print("Escribe el número para saber si esta dentro de un Array y saber la posición: ");
    numero = sc.nextInt();
    
    int[] a = array.ArrayUni.generaArrayUni(n,min,Max);
    
    for(int num:a){
      System.out.printf("%4d",num);
    }
    
    System.out.println("");
    if(array.ArrayUni.estaEnArrayUni(a,numero)){
      System.out.print("El número " + numero + " se encuentra dentro del Array y esta en la posición " + array.ArrayUni.posicionEnArrayUni(a,numero));
      }else{
      System.out.print("El número " + numero + " no se encuentra dentro del Array");  
    }
	}
}
