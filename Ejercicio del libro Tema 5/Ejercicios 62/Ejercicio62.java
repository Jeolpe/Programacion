/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio62 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int n2 = 0;
    int contador = 0;
    int contador2 = 0;
    int r = 0;
    int suerte = 0;
    int r2 = 0;
    
    System.out.print("Por favor, escriba un número entero positivo: ");
    n = s.nextInt();
    
    n2 = n;
    if(n2 == 0){
      contador = 1;
      }
      
      while(n2 > 0){
        r = (r*10) + (n2%10);
        contador++;
        n2/=10;
        }
        
        for(int i = 0; i < contador; i++){
          r2 = r%10;
          if(r2 == 3 || r2 == 7 || r2 == 8 || r2 == 9){
            suerte++;
            }else{
              suerte--;
            }
          r/=10;
          }
          
          if(suerte > 0){
            System.out.print("El " + n + " es afortunado");
            }else{
              System.out.print("El " + n + " no es afortunado");
            }
  }
}

