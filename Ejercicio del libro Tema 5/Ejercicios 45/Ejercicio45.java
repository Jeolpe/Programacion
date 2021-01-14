/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio45 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int p = 0;
    int i2 = 0;
    int contador = 0;
    int r = 0;
    int r2 = 0;
    int contador2 = 0;
    int r3 = 0;
    int n2 = 0;
    
    System.out.print("Por favor, escriba un número entero: ");
    n = s.nextInt();
    
    System.out.print("Escriba en que posición quiera que sustituya el número: ");
    p = s.nextInt();
    
    System.out.print("Escriba el número que quiera sustituir: ");
    i2 = s.nextInt();
    
    n2 = n;
    
    if(n2 == 0){
      contador = 1;
      }
      
      while(n2 > 0){
        r = (r*10) + (n2%10);
        n2/=10;
        contador++;
        }
        
        for(int i = 0; i < contador; i++){
          r2 = r%10;
          contador2++;
          if(contador2 == p){
            r3 = (r3 *10) + i2;
            }else{
              r3 = (r3 * 10) + r2;
            }
            r/=10;
          }
          System.out.print("El número resultante es; " + r3);
  }
}

