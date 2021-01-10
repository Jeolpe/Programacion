/*
 *@utor Jesús María Olalla Pérez
 */
 
import java.util.Scanner; 
public class Ejercicio4 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    
    for(int i = 320; i>=160; i-=20){
      if(i>160){
      System.out.print(i + ",");
       }else{
        System.out.print(i);
      }
    }
	}
}

