/*
 *@utor Jesús María Olalla Perez
 */

import java.util.Scanner;
public class Ejercicio2{
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int hour = 0;
    
    System.out.println("¿Dime el día de la semana?");
    hour = s.nextInt();
    
    if ((hour>=6) && (hour<=12)){
      System.out.println("¡Buenos dias!");
    } else if ((hour>=13) && (hour<=20)){
      System.out.println("¡Buenas tardes!");
    } else if ((hour>=21) && (hour<=23)){
      System.out.println("¡Buenas noches!");
    } else if ((hour>=0) && (hour<=5)){
      System.out.println("¡Buenas noches!");
    } else {
      System.out.println("¡Error en el sistema!");
  }
 }
}
