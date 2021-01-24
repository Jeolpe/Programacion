/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio16 {
	
	public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = 0;
    
    System.out.print("Escribe un número entero positivo: ");
    n = sc.nextInt();
    
    if(esPrimo(n)){
    System.out.print("El " + n + " que usted ha escrito es capicua");
    }else{
      System.out.print("El " + n + " que usted ha escrito no es capicua");
    }
		
	}
  
  public static boolean esPrimo(int x){
    if(x == voltea(x)){
      return true;
    }else{
      return false;
    }
  }
    
    public static int voltea(int x){
      int longitud = 0;
      while(x > 0){
        longitud =(longitud * 10) + (x%10);
        x/= 10;
        }
        return longitud;
      }
}

