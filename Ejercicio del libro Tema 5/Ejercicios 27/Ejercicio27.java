/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio27 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int contador = 0;
    int suma = 0;
    
    System.out.println("Escribe el número que quieres que llegue el múltipo de 3");
    n = s.nextInt();
    
    for(int i = 1; i <= n; i++){
      if(i % 3 == 0){
        System.out.print(i + ",");
        
        contador++;
        suma+= i;
        
        }
    }
    System.out.println("");
     System.out.println("Has introducido " + contador + " números");
     System.out.println("La suma de todos los número son " + suma);
	} 
}

