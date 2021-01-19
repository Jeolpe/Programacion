/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio4 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int [20];
    
    for(int i = 0; i < numero.length; i++){
      numero[i] =(int)(Math.random()*101);
      System.out.println( "El " + (i + 1) + "º número es: " + numero[i] + " ");
      }
      
      
    for(int i = 0; i < cuadrado.length; i++){
        cuadrado[i] = numero[i] * numero[i];
        System.out.println( "El cuadrado del  " + (i + 1) + "º número es: " + cuadrado[i] + " ");
        }
        
    for(int i = 0; i < cubo.length; i++){
      cubo[i] = cuadrado[i] * numero[i];
      System.out.println( "El cubo del " + (i + 1) + "º número es: " + cubo[i] + " ");
      }  
  }
}

