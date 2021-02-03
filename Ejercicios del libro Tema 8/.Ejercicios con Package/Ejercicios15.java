/*
 *@utor Jesús María Olalla Pérez 
 */
import Matematicas.Primary;
import java.util.Scanner;

public class Ejercicios15 {
	
	public static void main (String args[]) {
    int min = 1;
    int Max = 1000;
    
    for(int i = 1; i < 1000; i++){
      if(Matematicas.Primary.esPrimo(i)){
       System.out.printf("%4d",i);
      }
    }
  }
}

