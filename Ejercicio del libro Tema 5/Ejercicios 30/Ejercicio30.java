/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio30 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int d1 = 0;
    int d2 = 0;
    int h1 = 0;
    int h2 = 0;
    int dtotal = 0;
    int hour = 0;
    int hourtotal= 0;
    int hourdefinitiva = 0;
    
    
    do {
    System.out.println("Por favor, introduzca primero el día (del 1 al 7).");
    d1 = s.nextInt();
    System.out.println("Por favor, introduzca la primera hora.");
    h1 = s.nextInt();
    
    System.out.println("Por favor, introduzca el segundo día (del 1 al 7).");
    d2 = s.nextInt();
    System.out.println("Por favor, introduzca la segunda hora.");
    h2 = s.nextInt();
    
   }while(d1 > d2);
   
   
   dtotal = d2 - d1;
   hour = (h1 - h2) * (-1);
   hourtotal = dtotal * 24;
   hourdefinitiva = hourtotal + hour;
   
  
   
   System.out.println("Entre las " + h1 + ":00 del " + d1 + " y las " + h2 + ":00 del " + d2 + " hay " + hourdefinitiva + " horas total");
   
  
  
    
    
  
    
    
    
    
    
    
		
	}
}

