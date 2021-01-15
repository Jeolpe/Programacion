/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio58 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int n2 = 0;
    double contador = 0;
    double suma = 0;
    int r2 = 0;
    int r = 0;
    double resultado = 0;
    
    
    System.out.print("Por favor, Escribe un número entero positivo: ");
    n = s.nextInt();
    
    n2 = n;
    if(n2 == 0){
      contador = 1;
      }
      
      while(n2 > 0){
        r =(r*10) + (n2%10);
        n2/=10;
        contador++;
        }
        
        for(int i = 0; i < contador; i++){
          r2 = r%10;
          suma+= r2;
          r/=10;
          }
          
          resultado = suma / contador;
          System.out.print("La media de todos los dígito introducido es: " + resultado);
  }
}

