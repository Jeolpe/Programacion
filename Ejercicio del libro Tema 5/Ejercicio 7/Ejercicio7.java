/*
 *@utor Jesús María Olalla Pérez
*/

import java.util.Scanner;
public class Ejercicio7 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int contador = 0;
    
    do{
      System.out.println("Escribe la combinación de la caja fuerte: ");
      n = s.nextInt();
      contador++;
     if( n!= 4821){
      System.out.println("El resultado es incorrecto");
      System.out.println("--------------------------");
       }
    }while(n != 4821 && contador != 4);
  
    if (n == 4821){
      System.out.print("El resultado de la combinación es correcto");
       }
  }
}

