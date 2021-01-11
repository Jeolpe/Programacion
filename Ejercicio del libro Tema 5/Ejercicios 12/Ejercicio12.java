/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio12 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    
    System.out.print("Escribe un número: ");
    n = s.nextInt();
    int a = 0;
    int b = 1;
    int c = 0;
    int contador= 0;
    
    for(int i = 0; i <= contador; i++){
      do{
        System.out.print(a + ",");
        contador++;
        }while (contador != n);
      do{
        System.out.print(b + ",");
        contador++;
        }while (contador != n);
        
      do{
        c = b + a;
        System.out.print(c + ",");
        contador++;
        }while (contador != n); 
      
      a = b + c;
      b = c + a;
    }
      

