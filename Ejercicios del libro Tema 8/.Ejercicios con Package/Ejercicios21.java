/*
 *@utor Jesús María Olalla Pérez 
 */
import array.ArrayUni;
import java.util.Scanner;
public class Ejercicios21 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n   = 0;
    int min = 0;
    int Max = 0;
    
    System.out.print("Escribe un número entero positivo: ");
    n = sc.nextInt();
    System.out.print("Escribe un extremo para los números aleatorios: ");
    min = sc.nextInt();
    System.out.print("Escribe el otro extremo para los números aleatorios: ");
		Max = sc.nextInt();
    
    int[] a = array.ArrayUni.generaArrayUni(n,min,Max);
    
    for(int num:a){
      System.out.printf("%4d",num);
    }
    
    System.out.println("");
    System.out.print("El número más pequeño de todos Arrays es: ");
    System.out.print(array.ArrayUni.minimoArrayUni(a));
	}
}

