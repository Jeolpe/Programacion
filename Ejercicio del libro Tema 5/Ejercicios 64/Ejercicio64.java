/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio64 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int n2 = 0;
    int n3 = 0;
      while(n != 4){
        if(n3 != 3){
        for(int i = 0; i < 1; i++){
      for(int j = 0; j < 6; j++){
        System.out.print("*");
        }
      }
      System.out.println("");
      for(int i = 0; i < 1+n2;i++){
        System.out.print("*");
        for(int j = 0; j < 4; j++){
          System.out.print(" ");
          }
          System.out.print("*");
          System.out.println("");
        }
        for(int i = 0; i < 1; i++){
      for(int j = 0; j < 6; j++){
        System.out.print("*");
        }
      }
      System.out.println("");
      }else{
        for(int i = 0; i < 3; i++){
          System.out.print("*");
          }
          System.out.println("");
          for(int j = 0; j < 3+n2; j++){
            System.out.print("*");
            System.out.print(" ");
            System.out.print("*");
            System.out.println("");
            }
            for(int i = 0; i < 3; i++){
          System.out.print("*");
          }
          System.out.println("");
      }
      
       System.out.println("1. Agrandarlo");
       System.out.println("2. Achicarlo");
       System.out.println("3. Cambiar la orientación");
       System.out.println("4. Salir");
       System.out.print("Indique qué quiere hacer con el rectángulo:");
       n = s.nextInt();
     
       
       
       switch(n){
         case(1):
         n2 =n2 + 1;
         break;
         case(2):
         if(n2 > -1){
         n2 = n2-1;
         }else{
         break;
       }
       break;
         case(3):
         n3 = n3 + 3;
         if(n3 == 9){
           n3 = n3 - 6;
           }
         break;
         case 4: 
         n = 4;
         break;
         default:
         }
      
        }
        System.out.println("...............................................");
        System.out.println("...............................................");
        System.out.println("Muchas gracias por haber utilizado mi programa.");
        System.out.println("...............................................");
        System.out.println("...............................................");
		
	}
}

