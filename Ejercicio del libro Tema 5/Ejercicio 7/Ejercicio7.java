/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio7 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int key = 1234;
    int clave = 0;
    int intentos = 0;
    
    do{
      System.out.println("Escriba la combinación de 4 dígitos para abrir la caja fuerte");
      clave = s.nextInt();
      
      if( clave == key){
         System.out.println("Clave correcta");
       }else {
        System.out.println("Clave incorrecta, intentelo de nuevo");
      }
       
      intentos++;
    } while((intentos  < 4) && (clave != key));
    
    if(clave == key){
      System.out.println("Enhorabuena has introducido bien la clave");
      
    }else{
      System.out.println("Has agotado todas las oportunidades");
      }
    
		
	}
}

