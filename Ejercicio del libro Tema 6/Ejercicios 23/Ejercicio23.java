/*
 * @utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio23 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    String d = "";
    
    for(int i = 1; i <= 5; i++){
      int a = (int)(Math.random()*6)+1;
      
      switch(a){
        case(1):
        d = "As";
        break;
        case(2):
        d = "K";
        break;
        case(3):
        d = "Q";
        break;
        case(4):
        d = "J";
        break;
        case(5):
        d = String.valueOf(a);
        break;
        case(6):
        d = String.valueOf(a);
        break;
        default:


      
        }
        System.out.print(d + " ");
      }
		
	}
}

