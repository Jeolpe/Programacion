/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio3 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    
    String palo = "";
    String carta = "";
    
    int n = (int)(Math.random()*4) + 1;
    
    switch(n){
      case(1):
      palo = "Bastos";
      break;
      case(2):
      palo = "Oros";
      break;
      case(3):
      palo = "Copas";
      break;
      case(4):
      palo = "Espadas";
      break;
      }
		
    int n2 = (int)(Math.random()*10) + 1;
    switch(n2){
      case(1):
      carta = "AS";
      break;
      case(8):
      carta = "Sota";
      break;
      case(9):
      carta = "Caballo";
      break;
      case(10):
      carta = "Rey";
      break;
      default:
      carta = String.valueOf(n2);
    }
    System.out.print("La carta que ha salido es el " + carta + " de " + palo);
	}
}

