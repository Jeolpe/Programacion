/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio18 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int num_uno = 0;
    int num_dos = 0;
    
    do{
      
    System.out.println("Escribe 2 números");
    
    System.out.print("Escribe el primer número: ");
    num_uno = s.nextInt();
    
    System.out.print("Escribe el segundo número: ");
    num_dos = s.nextInt();
    
    if (num_uno < num_dos){
     for(int i = num_uno; i <= num_dos; i+= 7){
       System.out.print(i + ",");
     }
     
    }else if(num_uno > num_dos) {
     for(int j = num_dos; j <= num_uno; j+= 7){
       System.out.print(j + ",");
     }
    }
    
   }while(num_uno == num_dos); 
   
   System.out.println("");
    
  }
}

