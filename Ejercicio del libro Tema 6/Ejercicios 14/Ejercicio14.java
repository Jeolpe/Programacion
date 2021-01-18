/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio14 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int a = 0;
    int contador = 0;
    String n = "";
    int n2 = 0;
    int n3 = 0;
    
    a = (int)(Math.random()*101);
    n3 = 101;
    while(contador != 5 && !n.equals("correcto")){
      System.out.print(a);
      System.out.println("");
      System.out.print("El número es mayor, menor o es el correcto al número pensado: ");
      n = s.nextLine();
      if(n.equals("mayor")){
        n2 = a;
        
         a = (int)(Math.random()*(n3-n2)+1)+n2;
        }else{
          
          n3 = a;
          n3--;
          a = (int)(Math.random()*(n3-n2)+1)+n2;
          
          }
          contador++;
    }	
	}
}

