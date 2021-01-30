/*
 *@utor Jesús María Olalla Pérez 
 */
import array.ArrayBi;

import java.util.Scanner;
public class Ejercicio29 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int fils = 0;
    int colums = 0;
    int min = 0;
    int Max = 0;
    
		System.out.print("Escribe el númer de filas del Arrays Bidimensional: ");
    fils = sc.nextInt();
    
    System.out.print("Escribe el número de columnas del Arrays Bidimensional: ");
    colums = sc.nextInt();
    
    System.out.print("Escribe el valor mínimo del número aleatorio: ");
    min = sc.nextInt();
    
    System.out.print("Escribe el número Máximo del número aleatorio: ");
    Max = sc.nextInt();
    
    int[][] a = array.ArrayBi.generaArrayBidi(fils, colums, min, Max);
    
    array.ArrayBi.mostrar(a);
	}
}

