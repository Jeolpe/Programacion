/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio8 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    double suma = 0;
    double contador = 0;
    double r = 0;
    String d = "";
    
    int[] n = new int[12];
    String[] e = new String[12];
    
    System.out.println("Escribe la media de temperatura que hizo cada mes: ");
    for(int i = 0; i < n.length; i++){
      n[i] = s.nextInt();
      suma+= n[i];
      contador++;
      }
      r = suma/contador;
      
      for(int i = 0; i < 12; i++){
        for(int j = 0; j < n[i]; j++){
          switch(i){
            case(0):
            e[i] = "Enero";
            break;
            case(1):
            e[i] = "Febrero";
            break;
            case(2):
            e[i] = "Marzo";
            break;
            case(3):
            e[i] = "Abril";
            break;
            case(4):
            e[i] = "Mayo";
            break;
            case(5):
            e[i] = "Junio";
            break;
            case(6):
            e[i] = "Julio";
            break;
            case(7):
            e[i] = "Agosto";
            break;
            case(8):
            e[i] = "Septiembre";
            break;
            case(9):
            e[i] = "Octubre";
            break;
            case(10):
            e[i] = "Noviembre";
            break;
            case(11):
            e[i] = "Diciembre";
            break;
            default:
            }
          System.out.print("*");
          }
          System.out.print("   " + e[i]);
          System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.print("La media de la temperatura en todo el año es: " + r + "º");
  }
}

