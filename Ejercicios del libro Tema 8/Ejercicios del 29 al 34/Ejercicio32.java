/*
 *@utor Jesús María Olalla Pérez 
 */
import array.ArrayBi;
import array.ArrayUni;
import java.util.Scanner;
public class Ejercicio32 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int fils   = 0;
    int colums = 0;
    int min    = 0;
    int Max    = 0;
    int num    = 0;
    
    System.out.print("Escribe el número de filas: ");
    fils = sc.nextInt();
		
    System.out.print("Escribe el número de columnas: ");
    colums = sc.nextInt();
    
    System.out.print("Escribe el número mínimo: ");
    min = sc.nextInt();
    
    System.out.print("Escribe el número Máximo: ");
    Max = sc.nextInt();
    
    System.out.print("Escribe el número que quieres que aparezca: ");
    num = sc.nextInt();
    
    int[][] a = array.ArrayBi.generaArrayBidi(fils, colums, min, Max);
    int[] b = array.ArrayBi.coordenadasEnArrayBi(a,num);
    
    array.ArrayBi.mostrar(a);
    
    System.out.println("");
    System.out.println("El número aparece en la posición: ");
    array.ArrayUni.mostrarDos(b);
    
  }
  
}

