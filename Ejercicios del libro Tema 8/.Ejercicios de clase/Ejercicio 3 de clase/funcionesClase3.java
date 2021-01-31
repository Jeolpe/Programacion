/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class funcionesClase3{
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int opcion = 0;
    
    String[] palabra = {"suma","resta","multiplicación","división","salir"};
    
    mostrarOpciones(palabra);
    opcion = sc.nextInt(); 
    mostrar(palabra, opcion);
  }
  
  public static void mostrarOpciones(String[] uni){
    int opcion = 0;
    int contador = 1;
    System.out.println("MENU: ");
    for(String num:uni){
      System.out.println("opcion " + contador +": " + num);
      contador++;
      }
      System.out.println("");
       System.out.print("Elija una opción: ");
    }
  public static void mostrar (String[] uni, int z){
    z = z-1;
    System.out.println("");
    System.out.print("La opción que usted ha elegido es: ");
    System.out.print(uni[z]);
      }
}


