/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio15 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int b = 0;
    int ex = 0;
    
    System.out.println("Escribe el número que quieres que sea la base");
    b = s.nextInt();
    
    System.out.println("Escribe el número que quieres que sea el exponente");
    ex = s.nextInt();
    
    for(int i = 0; i <= ex; i++){
      if (i < ex){
        System.out.print(b+ "^"+i + "," );
      }else{
        System.out.print(b+"^"+i);
        
        }
      
      }
		
	}
}

