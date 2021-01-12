/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio30 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int h = 0;
    int d = 0;
    int h2 = 0;
    int d2 = 0;
    int dt = 0;
    int dth = 0;
    int r = 0;
    int ht = 0;
    
    System.out.println("Introduzca la primera hora: ");
    System.out.print("Día: ");
    d = s.nextInt();
    System.out.print("Hora: ");
    h = s.nextInt();
    System.out.println("Introduzca la primera hora: ");
    System.out.print("Día: ");
    d2 = s.nextInt();
    System.out.print("Hora: ");
    h2 = s.nextInt();
    
    dt = d2 - d;
    dth = dt*24;
    ht = h - h2;
    r = dth + (-1*ht);
    
  System.out.print("Entre las " + h + ":00 del " +  d + " y las " +  h2 + ":00h del " +  d2 +  " hay " +  r +  " hora/s.");
  }
}

