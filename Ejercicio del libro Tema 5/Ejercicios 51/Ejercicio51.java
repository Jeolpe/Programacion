/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio51 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int n2 = 0;
    int contador = 0;
    int r = 0;
    int r2 = 0;
    int r3 = 0;
    int r4 = 0;
    
    System.out.print("Por favor, escribe un número entero positivo: ");
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
      if((r2 == 0) || (r2 == 8)){
        r3 = (r3 * 10) + r2;
        }else{
          r4 =(r4 * 10) + r2;
          }
      r/=10;
      r2= 0;
      
        
      
    }
      if (r3 == 0){
        System.out.println("El gusano númerico no se ha comido ningún número");
        }else{
      System.out.println("Los números que han sido comido por el gusano: " +  r3);
    }
      System.out.print("Los números que no han sido comido por el gusano: " + r4);
      
    
    
		
	}
}

