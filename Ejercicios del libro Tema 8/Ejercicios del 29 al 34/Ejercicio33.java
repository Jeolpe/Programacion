/*
 *@utor Jesús María Olalla Pérez 
 */
import array.ArrayBi;
import array.ArrayUni;
import java.util.Scanner;

public class Ejercicio33 {
	
	public static void main (String args[]) {
		
    Scanner sc = new Scanner(System.in);
    int fils = 0;
    int colums = 0;
    int min = 0;
    int Max = 0;
    
    System.out.print("Escribe el número de filas: ");
    fils = sc.nextInt();
    
    System.out.print("Escribe el número de columnas: ");
    colums = sc.nextInt();
    
    System.out.print("Escribe el mínimo: ");
    min = sc.nextInt();
    
    System.out.print("Escribe el Máximo: ");
    Max = sc.nextInt();
    
    int[][] a = array.ArrayBi.generaArrayBidi(fils, colums, min, Max);
    int[] menorFilas = array.ArrayBi.esPuntoSillaFilas(a);
    int[] mayorColumnas = array.ArrayBi.esPuntoSillaColumnas(a);
    
    array.ArrayBi.mostrar(a);
    
    System.out.println("");
    System.out.print("Filas: ");
    array.ArrayUni.mostrarDos(menorFilas);
    System.out.println("");
    System.out.println("");
    System.out.print("Colum: ");
    array.ArrayUni.mostrarDos(mayorColumnas);
    
	}
}

