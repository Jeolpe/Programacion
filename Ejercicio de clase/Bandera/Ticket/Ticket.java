/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ticket {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    

    
    String nombre_uno  = "";
    String nombre_dos  = "";
    String nombre_tres = "";
    
    int precio_uno  = 0;
    int precio_dos  = 0;
    int precio_tres = 0;
    
    int cantidad_uno  = 0;
    int cantidad_dos  = 0;
    int cantidad_tres = 0;
    
    int resultado_uno = 0;
    int resultado_dos = 0;
    int resultado_tres = 0;
    
    System.out.println("Indique el articulo uno");
    nombre_uno = s.nextLine();
    System.out.println("Cuál es el precio?");
    precio_uno = s.nextInt();
    System.out.println("Cantidad del articulo deseado");
    cantidad_uno= s.nextInt();
    
    System.out.println("Indique el articulo dos");
    nombre_dos = s.next();
    System.out.println("Cuál es el precio?");
    precio_dos = s.nextInt();
    System.out.println("Cantidad del articulo deseado");
    cantidad_dos= s.nextInt();
    
    System.out.println("Indique el articulo tres");
    nombre_tres= s.next();
    System.out.println("Cuál es el precio?");
    precio_tres = s.nextInt();
    System.out.println("Cantidad del articulo deseado");
    cantidad_tres= s.nextInt();
    
    
    
    
    resultado_uno = cantidad_uno * precio_uno;
    resultado_dos = cantidad_dos * precio_dos;
    resultado_tres = cantidad_tres * precio_tres;
    
    System.out.println("Artículo	Cantidad	Precio unidad	 Subtotal");
    System.out.println( nombre_uno +"            "+ cantidad_uno  +"                  "+ precio_uno  +"            "+ resultado_uno  );
    System.out.println( nombre_dos + "               "+ cantidad_dos  +"                  "+ precio_dos  +"            "+ resultado_dos  );
    System.out.println( nombre_tres +"            "+ cantidad_tres  +"                  "+ precio_tres  +"            "+ resultado_tres);
    
	}
}
