/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Bucles3 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int num_uno = 0;
    int num_dos = 0;

    
    System.out.println("Escribe el número que quieras");
    num_uno = s.nextInt();
    
    System.out.println("Escribe la cantidad de filas que quieres que sea la tabla");
    num_dos = s.nextInt();
    
    for(int i = 1; i <= num_dos; i + i(num_uno)++){
      System.out.println(num_uno + "" + i);
    }
    
    
		
	}
}

