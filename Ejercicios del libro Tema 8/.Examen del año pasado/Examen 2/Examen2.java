/*
 *@utor Jesús María Olalla Pérez 
 */
import Varios.esenciales;
import java.util.Scanner;
public class Examen2 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int rows = esenciales.generaNumeroAleatorio(1,8);
    int cols = esenciales.generaNumeroAleatorio(1,8);
    
    int[][] b = esenciales.rellenarMatrizAleatorios(rows, cols, 1,99);
    esenciales.PresentaMatrizConLineas(b);
    
		
	}
}



