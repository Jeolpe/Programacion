/*
 *@utor Jesús María Olalla Perez
 */

import java.util.Scanner;
public class Ejercicio1{
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    String día = "";
    
    System.out.println("¿Dime el día de la semana?");
    día = s.nextLine();
    
    if(día.equals("lunes")){
      System.out.println("Hoy es Lunes, así que te toca Mátematicas");
    } else if(día.equals ("martes")) {
      System.out.println("Hoy es Martes, así que te toca Lengua"); 
    } else if (día.equals ("miercoles")) {
      System.out.println("Hoy es Miércoles, así que te toca Física");
    } else if(día.equals ("jueves")) {
      System.out.println("Hoy es Jueves, así que te toca Química");
    } else if(día.equals ("viernes")) {
      System.out.println("Hoy es Viernes, así que te toca Ciencias naturales");
    } else {
      System.out.println("Hoy es Sabado o domingo, así que te toca descanso");
  }
 }
} 

