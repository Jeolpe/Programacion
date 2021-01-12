/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio26 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int contador = 0;
    int d = 0;
    int d2 = 0;
    int r = 0;
    
    System.out.print("Escribe un número: ");
    n = s.nextInt();
    
    System.out.print("Escribe un dígito: ");
    d = s.nextInt();
    
    while(n > 0){
      r = (r*10) + (n%10);
      n/=10;
    }
    
    do{
      d2 = r%10;
      if(d2 == d){
        contador++;
        }else{
        contador++;
      }     
      r/= 10;
      }while(d2 != d);
      
      System.out.print("El puesto es el número : " + contador);
  }
}

