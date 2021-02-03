/*
 *@utor Jesús María Olalla Pérez 
 */
import Matematicas.Primary;
import java.util.Scanner;

public class Ejercicios16 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int min = 1;
    int Max = 99999;
    
    for(int i = 1; i < 99999; i++){
      if(Matematicas.Primary.esCapicua(i)){
        System.out.printf(i + " ");
        }
      }
  }
}

