/*
 * @utor Jesús María Olalla Pérez 
 */
import array.ArrayBi;
import java.util.Scanner;

public class Ejercicio30 {
	
	public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    int fils   = 0;
    int colums = 0;
    int min    = 0;
    int Max    = 0;
    int f      = 0;
    
    System.out.print("Escribe el número de filas: ");
    fils = sc.nextInt();
		
    System.out.print("Escribe el número de columnas: ");
    colums = sc.nextInt();
    
    System.out.print("Escribe el número mínimo: ");
    min = sc.nextInt();
    
    System.out.print("Escribe el número Máximo: ");
    Max = sc.nextInt();
    
    System.out.print("Escribe el número de columna que quieres que aparezca: ");
    f = sc.nextInt();
    
    int[][] a = array.ArrayBi.generaArrayBidi(fils, colums, min, Max);
    int[] b = array.ArrayBi.filaDeArrayBi(a,f);
    
    System.out.println("El array bidimensional es el: ");
    array.ArrayBi.mostrar(a);
    
    System.out.println("");
    System.out.println("El arrays del número de filas elegido: ");
    array.ArrayBi.mostrarfilaDeArrayBi(b);
  }
}

