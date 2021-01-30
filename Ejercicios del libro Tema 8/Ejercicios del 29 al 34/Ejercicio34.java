/*
 *@utor Jesús María Olalla Pérez 
 */
import array.ArrayBi;
import array.ArrayUni;
import java.util.Scanner;
public class Ejercicio34 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int fils = 0;
    int colums = 0;
    int min = 0;
    int Max = 0;
    String frase = "";
    
    System.out.print("Escribe el número de filas: ");
    fils = sc.nextInt();
    
    System.out.print("Escribe el número de columnas: ");
    colums = sc.nextInt();
    
    System.out.print("Escribe el mínimo: ");
    min = sc.nextInt();
    
    System.out.print("Escribe el Máximo: ");
    Max = sc.nextInt();
    
    do{
    System.out.print("Escribe todo lo siguiente: ");
    frase = sc.next();
    }while(!frase.equals("nose") && !frase.equals("neso"));
    
    int[][] a = array.ArrayBi.generaArrayBidi(fils, colums, min, Max);
    int[] b = array.ArrayBi.diagonal(a,frase);
    
    array.ArrayBi.mostrar(a);
    System.out.println("");
    array.ArrayUni.mostrarDos(b);
		
	}
}

