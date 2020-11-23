/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio19 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int h = 1;
    String c = "";
    
    System.out.println("Escribe la altura que quieres que tenga la piramide");
    h = s.nextInt();
    
    System.out.println("¿Con que carácter quieres que se haga la piramide?");
    c = s.next();
    
    for(int i = 0; i <= h; i++){
      for(int j = h ; j >= i; j--){
        System.out.print(" ");
          }
          for(int k = 1; k <= i ; k++){
          System.out.print(c);
        }
        System.out.println();
      }
    
		
	}
}

