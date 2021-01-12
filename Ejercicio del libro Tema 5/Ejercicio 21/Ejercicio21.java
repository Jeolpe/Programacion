/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio21 {
	
	public static void main (String args[]) {
		
    Scanner s = new Scanner(System.in);
    int n = 0;
    int contador = 0;
    double suma = 0;
    double contador2 = 0;
    double resultado = 0;
    int par = 0;
    int c = 0;
    int aux = 0;
     do{
      System.out.print("Escribe un número positivo (Si desea salir escriba un número negativo): ");
      n = s.nextInt();
      if(n >= 0){
      contador++;
      if(n % 2 == 0){
        if(n >= par){
          par = n;
          }
        
        }else{
          if (n >= 0){
          suma+=n;
          contador2++;
          }
        }
      }

      } while(n >= 0);
      
      
      resultado = suma/contador2;
      
      System.out.println("Has introducido " + contador + " números" + " enteros");
      System.out.println("La media de los números impares son: " + resultado);
      System.out.println("El número más grande de los pares es: " + par);
	}
}

