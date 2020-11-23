/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio21 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int contador = 0;
    int impar = 0;
    int par = 0;
    
    
    do{
     System.out.println("Escribe un número positivo (Número negativo para finalizar)");
     n = s.nextInt();
		 contador++;
     if(n % 2 != 0){
       impar++;
       
      }else{
      par = n;
      }
        
    }while(n >= 0);
    
    System.out.println("Has introducido " + contador + " números.");
    System.out.println("Has introducido " + impar + " números impares");
    System.out.println("El numero par más grande que has introducido es el " + par);
	}
}

