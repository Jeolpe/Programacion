/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio49 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int k = 0;
    int contador = 0;
    int contador2 = 0;
    int contadort = 0;
    int n2 = 0;
    int n3 = 0;
    int m = 0;
    int suma = 0;
    
    System.out.print("Por favor, escribe un número entero positivo (si desea parar escriba un número primo): ");
    do{
      n = s.nextInt();
      contador++;
      k = 0;
      for(int i = 2; i < n; i++){
        if(n % i == 0){
          k = 1;
        }
      }
    if (k != 0){
    if (n >= n2){
      n2 = n;
      }
      
       if (n <= n3 || contador ==1){
      n3 = n;
      suma+= n;
    }
      }
      }while(k != 0);
      contadort = contador - 1;
      m = suma / contadort;
      System.out.println("Has introducido " + contadort + " números no primos.");
      System.out.println("Máximo: " + n2  );
      System.out.println("Mínimo: " + n3  );
      System.out.print("Media: " + m  );
		
	}
}

