/*
 *@utor Jesús María Olalla Pérez
 */
import java.util.Scanner;
public class Ejercicio2 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int i = 0;
    
    while(i <= 100){
      if (i < 100){
      System.out.print(i + ",");
      i+= 5;
      }else{
        System.out.print(i);
        i+= 5;
      }
		}
	}
}
                
